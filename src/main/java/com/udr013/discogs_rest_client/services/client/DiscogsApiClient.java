package com.udr013.discogs_rest_client.services.client;


import com.udr013.discogs_rest_client.models.Bla;
import com.udr013.discogs_rest_client.models.ReleaseModel;
import com.udr013.discogs_rest_client.models.Result;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class DiscogsApiClient {

	private static final String BASE_URL = "https://api.discogs.com/";
	private static final String SEARCH_URL = "/database/search";
	private static final String RELEASES_URL = "releases";
	private static final String CONTENT_TYPE = "application/vnd.discogs.v2.discogs+json";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static HttpHeaders defaultHeaders;

	private HttpEntity entity = new HttpEntity<>("parameters", defaultHeaders);

	private RestTemplate restTemplate = new RestTemplate();

	static {
		defaultHeaders = new HttpHeaders();
		defaultHeaders.set(HttpHeaders.ACCEPT, CONTENT_TYPE);
		defaultHeaders.set("user-agent", "discogs_rest_client");
		defaultHeaders.set("Authorization", "LdWzPkVhbDOqKdugvHFGiCfdMwZckWpGOCKWKqBaJcWHYhnWyxHS");
	}

	public ReleaseModel getRelease(String id) {

		String url = buildUrl(id);
		log.info("######### GetRelease request started ##########");
		try {
			ReleaseModel response = restTemplate.exchange(url, HttpMethod.GET, entity, ReleaseModel.class).getBody();
			log.info("Response was successfully returned for: [{}]",response.getId());
			return response;

		} catch (RestClientException re) {
			log.warn(String.format("Exception on url [%s]", url), re);

			throw re;
		}
	}

	public List<Result> getArtistReleases(String artist){
		System.out.println(" We got :"+ artist.length());

			String url = UriComponentsBuilder.fromHttpUrl(BASE_URL).path(SEARCH_URL)
				.queryParam("q",artist)
				.queryParam("key", "LdWzPkVhbDOqKdugvHFG")
				.queryParam("secret", "iCfdMwZckWpGOCKWKqBaJcWHYhnWyxHS")
				.build().toString();
			List<Result> response = restTemplate.exchange(url,
					HttpMethod
							.GET, entity,
					Bla.class).getBody().getResults();
			return response;

	}


	private String buildUrl(String releaseId) {
		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL).path(RELEASES_URL).pathSegment(releaseId).build()
				.toString();
		log.info("This url was build: " + url);
		return url;
	}

}