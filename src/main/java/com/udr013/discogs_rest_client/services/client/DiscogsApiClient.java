package com.udr013.discogs_rest_client.services.client;


import com.udr013.discogs_rest_client.models.CollectionModel;
import com.udr013.discogs_rest_client.models.PageModel;
import com.udr013.discogs_rest_client.models.RatingExtendedModel;
import com.udr013.discogs_rest_client.models.ReleaseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class DiscogsApiClient {

	private static final String BASE_URL = "https://api.discogs.com/";
	private static final String SEARCH_URL = "/database/search";
	private static final String RELEASES_URL = "releases";
	private static final String RATING_URL = "/rating";
	private static final String COLLECTION_URL = "/users/{username}/collection";
	private static final String CONTENT_TYPE = "application/vnd.discogs.v2.discogs+json";
	private static final String USER_AGENT = "user-agent";
	private static final String USER_AGENT_NAME = "discogs_rest_client";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static HttpHeaders defaultHeaders;

	private HttpEntity entity = new HttpEntity<>("parameters", defaultHeaders);

	private RestTemplate restTemplate = new RestTemplate();

	static {
		defaultHeaders = new HttpHeaders();
		defaultHeaders.set(HttpHeaders.ACCEPT, CONTENT_TYPE);
		defaultHeaders.set(USER_AGENT, USER_AGENT_NAME);
	}

	public PageModel findReleaseBy(MultiValueMap<String, String> params) {

		String url = buildUrl(SEARCH_URL, params, null, null, null);
		PageModel response = restTemplate.exchange(url, HttpMethod.GET, entity, PageModel.class).getBody();

		return response;

	}

	public ReleaseModel getRelease(MultiValueMap<String, String> params, String recordId) {
//		String url = buildUrl(RELEASES_URL, params, recordId, null, null);
		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL).path(RELEASES_URL).queryParams(params).pathSegment(recordId).build().toString();
		ReleaseModel response = restTemplate.exchange(url, HttpMethod.GET, entity, ReleaseModel.class).getBody();

		return response;

	}

	public RatingExtendedModel getReleaseRating(String releaseId) {

		String url = buildUrl(RELEASES_URL, null, releaseId, null, null);
		RatingExtendedModel response = restTemplate.exchange(url, HttpMethod.GET, entity, RatingExtendedModel.class)
				.getBody();

		return response;

	}

	public CollectionModel getUserCollection(String username, MultiValueMap<String, String> queryparams) {
		// String url = buildUrl(COLLECTION_URL, queryparams, null, null, username);
		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL).queryParams(queryparams).path(COLLECTION_URL).buildAndExpand(username).toString();

		log.info("This url was build: " + url);
		CollectionModel response = restTemplate.exchange(url, HttpMethod.GET, entity, CollectionModel.class).getBody();

		return response;
	}

	private String buildUrl(String endpoint, MultiValueMap<String, String> params, String releaseId, String rating,
			String username) {

		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL).path(endpoint).build().toString();
		if (releaseId == null) {
			url = UriComponentsBuilder.fromHttpUrl(url).queryParams(params).build().toString();

		} else {
				url = UriComponentsBuilder.fromHttpUrl(url).pathSegment(releaseId).path(RATING_URL).build().toString();

		}

		log.info("This url was build: " + url);
		return url;

	}

	private void simulateSlowService() {
		try {
			long time = 1500L;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}
}