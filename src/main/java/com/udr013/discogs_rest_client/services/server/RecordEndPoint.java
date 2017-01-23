package com.udr013.discogs_rest_client.services.server;


import com.udr013.discogs_rest_client.models.ReleaseModel;
import com.udr013.discogs_rest_client.services.client.DiscogsApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/record", produces = "application/json", consumes = "application/json")
public class RecordEndPoint {


	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	private final DiscogsApiClient discogsApiClient;

	@Autowired
	public RecordEndPoint(DiscogsApiClient discogsApiClient) {
		this.discogsApiClient = discogsApiClient;
	}

	@GetMapping
	public ReleaseModel getRecord(@RequestParam("recordid") String recordid) {

		LOGGER.info("Entered getRecord, and we call the client with id: " + recordid);

		ReleaseModel releaseModel = discogsApiClient.getRelease(recordid);
		if (releaseModel.getArtists() == null) {
			LOGGER.info("Hmm, no artist?");
		}
		return releaseModel;
	}

}