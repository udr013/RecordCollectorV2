package com.udr013.discogs_rest_client.services.server;


import com.udr013.discogs_rest_client.models.ReleaseModel;
import com.udr013.discogs_rest_client.models.Result;
import com.udr013.discogs_rest_client.services.client.DiscogsApiClient;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/record", produces = "application/json") //do not use consumes: body not null
public class RecordEndPoint{

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	private final DiscogsApiClient discogsApiClient;

	@Autowired
	public RecordEndPoint(DiscogsApiClient discogsApiClient){
		this.discogsApiClient = discogsApiClient;
	}

	@GetMapping
	public ReleaseModel getRecord(@RequestParam("recordid") String recordid){

		LOGGER.info("Entered getRecord, and we call the client with id: " + recordid);

		ReleaseModel releaseModel = discogsApiClient.getRelease(recordid);
		if(releaseModel.getArtists() == null){
			LOGGER.info("Hmm, no artist?");
		}
		return releaseModel;
	}

	@GetMapping("/bla")
	public List<Result> getRecords(@RequestParam("artist") String artist, @RequestParam(required=false, value = "title") String title){
		StringBuilder s = new StringBuilder();

		if(artist != null && title != null){
			artist = artist.replace(" ", "-");
			s.append(artist);
			title = title.replace(" ", "-");
			s.append("-" + title);
		} else{
			if(artist != null){
				artist = artist.replace(" ", "-");
				s.append(artist);
			} else{
				if(title != null){
					title = title.replace(" ", "-");
					s.append(title);
				}
			}
		}
		String query = s.toString();

		LOGGER.info("Entered getRecord, and we call the client with id: " + artist);

		return discogsApiClient.getArtistAndOrTitleReleases(query);
	}
}