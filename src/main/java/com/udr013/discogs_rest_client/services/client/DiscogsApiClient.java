package com.udr013.discogs_rest_client.services.client;


import com.udr013.discogs_rest_client.models.ArtistFullExtendedModel;
import com.udr013.discogs_rest_client.models.CollectionModel;
import com.udr013.discogs_rest_client.models.LabelModel;
import com.udr013.discogs_rest_client.models.MasterModel;
import com.udr013.discogs_rest_client.models.PageLabelModel;
import com.udr013.discogs_rest_client.models.PageModel;
import com.udr013.discogs_rest_client.models.PageVersionModel;
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

	private static final String CONTENT_TYPE = "application/vnd.discogs.v2.discogs+json";
	private static final String USER_AGENT = "user-agent";
	private static final String USER_AGENT_NAME = "discogs_rest_client";

	private static final String BASE_URL = "https://api.discogs.com/";
	private static final String SEARCH_URL = "/database/search";
	private static final String RELEASES_PATH = "/releases/{releaseid}";
	private static final String RATING_URL = RELEASES_PATH + "/rating";
	private static final String ARTIST_PATH = "/artists/{artistid}";
	private static final String ARTIST_RELEASE_PATH = ARTIST_PATH + "/releases";
	private static final String COLLECTION_PATH = "/users/{username}/collection";
	private static final String COLLECTION_VALUE_PATH = COLLECTION_PATH + "/value";
	private static final String MASTER_PATH = "/masters/{master_id}";
	private static final String MASTER_VERSIONS_PATH = MASTER_PATH +"/versions";
	private static final String LABEL_PATH = "/labels/{labelid}";
	private static final String LABEL_RELEASE_PATH = LABEL_PATH + "/releases" ;

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static HttpHeaders defaultHeaders;

	private HttpEntity entity = new HttpEntity<>("parameters", defaultHeaders);

	private RestTemplate restTemplate = new RestTemplate();

	static {
		defaultHeaders = new HttpHeaders();
		defaultHeaders.set(HttpHeaders.ACCEPT, CONTENT_TYPE);
		defaultHeaders.set(USER_AGENT, USER_AGENT_NAME);
	}

	public PageModel search(MultiValueMap<String, String> params) {

		String url = buildUrl(SEARCH_URL, params, null);
		PageModel response = restTemplate.exchange(url, HttpMethod.GET, entity, PageModel.class).getBody();
		return response;

	}

	public ReleaseModel getRelease(MultiValueMap<String, String> params, String recordId) {

		String url = buildUrl(RELEASES_PATH, params, recordId);
		ReleaseModel response = restTemplate.exchange(url, HttpMethod.GET, entity, ReleaseModel.class).getBody();
		return response;

	}

	public RatingExtendedModel getReleaseRating(String releaseId) {

		String url = buildUrl(RATING_URL, null, releaseId);
		RatingExtendedModel response = restTemplate.exchange(url, HttpMethod.GET, entity, RatingExtendedModel.class).getBody();
		return response;

	}

	public ArtistFullExtendedModel getArtist(String artistid){

		String url = buildUrl(ARTIST_PATH, null, artistid);
		ArtistFullExtendedModel response = restTemplate.exchange(url, HttpMethod.GET, entity, ArtistFullExtendedModel.class).getBody();
		return response;

	}

	public PageLabelModel getAllArtistReleases(String artistid, MultiValueMap<String, String> params) {

		String url = buildUrl(ARTIST_RELEASE_PATH, params, artistid);
		PageLabelModel response = restTemplate.exchange(url, HttpMethod.GET, entity, PageLabelModel.class).getBody();
		return response;

	}

	public MasterModel getMaster(String masterid){

		String url = buildUrl(MASTER_PATH, null, masterid);
		MasterModel response = restTemplate.exchange(url, HttpMethod.GET, entity, MasterModel.class).getBody();
		return response;

	}

	public PageVersionModel getMasterVersions(String masterid, MultiValueMap<String, String> params) {

		String url = buildUrl(MASTER_VERSIONS_PATH, params, masterid);
		PageVersionModel response = restTemplate.exchange(url, HttpMethod.GET, entity, PageVersionModel.class).getBody();
		return response;

	}

	public LabelModel getLabel(String labelid){

		String url = buildUrl(LABEL_PATH, null, labelid);
		LabelModel response = restTemplate.exchange(url, HttpMethod.GET, entity, LabelModel.class).getBody();
		return response;

	}

	public PageLabelModel getAllLabelReleases(String labelid, MultiValueMap<String, String> params) {

		String url = buildUrl(LABEL_RELEASE_PATH, params, labelid);
		PageLabelModel response = restTemplate.exchange(url, HttpMethod.GET, entity, PageLabelModel.class).getBody();
		return response;

	}

	public CollectionModel getCollectionValue(String username){

		String url = buildUrl(COLLECTION_VALUE_PATH, null, username);
		CollectionModel response = restTemplate.exchange(url, HttpMethod.GET, entity, CollectionModel.class).getBody();
		return response;
	}

	public CollectionModel getUserCollection(String username, MultiValueMap<String, String> queryparams) {

		String url = buildUrl(COLLECTION_PATH, queryparams, username);
		CollectionModel response = restTemplate.exchange(url, HttpMethod.GET, entity, CollectionModel.class).getBody();
		return response;
	}

	private String buildUrl(String path, MultiValueMap<String, String> queryparams, String pathparam) {

		String url;
		if(queryparams != null){
			url = UriComponentsBuilder.fromHttpUrl(BASE_URL).queryParams(queryparams).path(path).buildAndExpand(pathparam).toString();
		}else{
			url = UriComponentsBuilder.fromHttpUrl(BASE_URL).path(path).buildAndExpand(pathparam).toString();
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