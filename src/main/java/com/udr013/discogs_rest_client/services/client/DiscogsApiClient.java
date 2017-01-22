package com.udr013.discogs_rest_client.services.client;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.udr013.discogs_rest_client.models.ReleaseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;

import static org.apache.commons.lang3.StringUtils.substringBefore;


@Service
public class DiscogsApiClient {

	private static final String BASE_URL = "https://api.discogs.com/";
	private static final String RELEASES_URL = "releases";
	private static final String CONTENT_TYPE = "application/vnd.discogs.v2.discogs+json";

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static HttpHeaders defaultHeaders;


	static {
		defaultHeaders = new HttpHeaders();
		defaultHeaders.set(HttpHeaders.ACCEPT, CONTENT_TYPE);
		defaultHeaders.set("user-agent", "discogs_rest_client");
	}


	public ReleaseModel getRelease(String id) {
		RestTemplate restTemplate = new RestTemplate();
		String url = buildUrl(id);
		HttpEntity entity = new HttpEntity<>("parameters", defaultHeaders);
		System.out.println("######### Let's do the get request ##########");
		try {
		String response = restTemplate.exchange(url,
				HttpMethod.GET,entity,String.class).toString();
			System.out.println(response);
		ReleaseModel result = parseJsonpToJson(response);
			System.out.println(" result country:" + result.getCountry());
			return result;

	} catch (RestClientException re) {
		log.warn(String.format("Exception on url [%s]", url), re);

		throw re;
	}
	}

	private ReleaseModel parseJsonpToJson(String response) {
		ObjectMapper mapper = new ObjectMapper();
		String[] newString = response.split("[,]",2);
		String objectString =newString[1];
		String sss = substringBefore(objectString,",{Server=");
		System.out.println("objectstring: "+ sss);
		try {
			ReleaseModel releaseModel = mapper.readValue(sss, ReleaseModel.class);
			System.out.println("this country;" + releaseModel.getCountry());
			return releaseModel;
		}catch (IOException e){
			System.out.println("io exception");
			return new ReleaseModel();
		}

	}

	private String buildUrl(String releaseId) {
		String url = UriComponentsBuilder.fromHttpUrl(BASE_URL).path(RELEASES_URL).pathSegment(releaseId).build()
				.toString();
		log.info("This url was build: " + url);
		return url;
	}

}