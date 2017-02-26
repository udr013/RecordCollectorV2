package com.udr013.discogs_rest_client.services.server;

import com.udr013.discogs_rest_client.models.ArtistFullExtendedModel;
import com.udr013.discogs_rest_client.models.CollectionModel;
import com.udr013.discogs_rest_client.models.LabelModel;
import com.udr013.discogs_rest_client.models.PageLabelModel;
import com.udr013.discogs_rest_client.models.PageModel;
import com.udr013.discogs_rest_client.models.RatingExtendedModel;
import com.udr013.discogs_rest_client.models.ReleaseModel;
import com.udr013.discogs_rest_client.services.client.DiscogsApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/record", produces = "application/json") // do not use consumes: body not null
public class RecordEndPoint {

	private static final String KEY = "key";
	private static final String SECRET = "secret";
	private static final String Q = "q";
	private static final String TYPE = "type";
	private static final String TITLE = "title";
	private static final String ARTIST = "artist";
	private static final String RELEASE_TITLE = "release_title";
	private static final String ANV = "anv";
	private static final String LABEL = "label";
	private static final String GENRE = "genre";
	private static final String STYLE = "style";
	private static final String COUNTRY = "country";
	private static final String YEAR = "year";
	private static final String FORMAT = "format";
	private static final String CATNO = "catno";
	private static final String BARCODE = "barcode";
	private static final String TRACK = "track";
	private static final String SUBMITTER = "submitter";
	private static final String CONTRIBUTOR = "contributor";
	private static final String PER_PAGE = "per_page";
	private static final String PAGE = "page";
	private static final String SORT = "sort";
	private static final String SORT_ORDER = "sort_order";
	private static final String CURR_ABBR = "curr_abbr";

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	private final DiscogsApiClient discogsApiClient;

	@Value("${discogs.key.value}")
	private String KEY_VALUE;
	@Value("${discogs.secret.value}")
	private String SECRET_VALUE;

	@Autowired
	public RecordEndPoint(DiscogsApiClient discogsApiClient) {
		this.discogsApiClient = discogsApiClient;
	}

	@GetMapping("/{recordid}")
	public ReleaseModel getRecord(@PathVariable("recordid") String recordid,
			@RequestParam(required = false, value = "curr_abbr") String curr_abbr) {

		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		if (curr_abbr != null)
			params.add(CURR_ABBR, curr_abbr);

		ReleaseModel releaseModel = discogsApiClient.getRelease(params, recordid);
		return releaseModel;
	}

	@GetMapping("/rating/{recordid}")
	public RatingExtendedModel getRecordRating(@PathVariable("recordid") String recordid) {

		RatingExtendedModel rating = discogsApiClient.getReleaseRating(recordid);
		return rating;
	}

	@GetMapping("/label/{labelid}")
	public LabelModel getLabel(@PathVariable("labelid") String labelid) {

		LabelModel rating = discogsApiClient.getLabel(labelid);
		return rating;
	}

	@GetMapping("/label/{labelid}/releases")
	public PageLabelModel getAllLabelReleases(@PathVariable("labelid") String labelid,
											  @RequestParam(required = false, value = "page") String page,
											  @RequestParam(required = false, value = "per_page") String per_page,
											  @RequestParam(required = false, value = "sort") String sort,
											  @RequestParam(required = false, value = "sort_order") String sort_order) {
		System.out.println("/labelReleaseModels");
		MultiValueMap<String, String> queryparams = buildPageSortParams(page, per_page, sort, sort_order);
		PageLabelModel rating = discogsApiClient.getAllLabelReleases(labelid, queryparams);
		return rating;
	}

	@GetMapping("/artist/{artistid}")
	public ArtistFullExtendedModel getArtist(@PathVariable("artistid") String labelid) {
		System.out.println("artist is called with id");
		ArtistFullExtendedModel rating = discogsApiClient.getArtist(labelid);
		return rating;
	}

	@GetMapping("/artist/{artistid}/releases")
	public PageLabelModel getAllArtistReleases(@PathVariable("artistid") String artistid,
			@RequestParam(required = false, value = "page") String page,
			@RequestParam(required = false, value = "per_page") String per_page,
			@RequestParam(required = false, value = "sort") String sort,
			@RequestParam(required = false, value = "sort_order") String sort_order) {

		MultiValueMap<String, String> queryparams = buildPageSortParams(page, per_page, sort, sort_order);

		PageLabelModel rating = discogsApiClient.getAllArtistReleases(artistid, queryparams);
		return rating;
	}

	@GetMapping("/users/{username}/collection/value")
	public CollectionModel getCollectionValue(@PathVariable("username") String username) {
		CollectionModel rating = discogsApiClient.getCollectionValue(username);
		return rating;
	}

	@Cacheable("Coll_Cache")
	@GetMapping("/users/{username}/collection")
	public CollectionModel getUserCollection(@PathVariable("username") String username,
											 @RequestParam(required = false, value = "page") String page,
											 @RequestParam(required = false, value = "per_page") String per_page,
											 @RequestParam(required = false, value = "sort") String sort,
											 @RequestParam(required = false, value = "sort_order") String sort_order) {

		MultiValueMap<String, String> queryparams = buildPageSortParams(page, per_page, sort, sort_order);
		CollectionModel rating = discogsApiClient.getUserCollection(username, queryparams);
		return rating;
	}

	@GetMapping("/search")
	public PageModel getRecords(@RequestParam(required = false, value = "artistAlbumquery") String artistAlbumquery,
			@RequestParam(required = false, value = "query") String query,
			@RequestParam(required = false, value = "type") String type,
			@RequestParam(required = false, value = "title") String title,
			@RequestParam(required = false, value = "artist") String artist,
			@RequestParam(required = false, value = "release_title") String release_title,
			@RequestParam(required = false, value = "anv") String anv,
			@RequestParam(required = false, value = "label") String label,
			@RequestParam(required = false, value = "genre") String genre,
			@RequestParam(required = false, value = "style") String style,
			@RequestParam(required = false, value = "country") String country,
			@RequestParam(required = false, value = "year") String year,
			@RequestParam(required = false, value = "format") String format,
			@RequestParam(required = false, value = "catno") String catno,
			@RequestParam(required = false, value = "barcode") String barcode,
			@RequestParam(required = false, value = "track") String track,
			@RequestParam(required = false, value = "submitter") String submitter,
			@RequestParam(required = false, value = "contributor") String contributor,
			@RequestParam(required = false, value = "page") String page,
			@RequestParam(required = false, value = "per_page") String per_page,
			@RequestParam(required = false, value = "sort") String sort,
			@RequestParam(required = false, value = "sort_order") String sort_order) {

		MultiValueMap<String, String> queryparams = buildSearchQueryParams(artistAlbumquery, query, title, type, artist,
				release_title, anv, label, genre, style, country, year, format, catno, barcode, track, submitter,
				contributor, page, per_page, sort_order, sort);

		LOGGER.info("Entered getRecord, and we call the client with: " + queryparams.size() + "params");

		return discogsApiClient.search(queryparams);
	}

	private MultiValueMap<String, String> buildPageSortParams(String page, String per_page, String sort, String sort_order){

		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		params.add(KEY, KEY_VALUE);
		params.add(SECRET, SECRET_VALUE);
		if (page != null)
			params.add(PAGE, page);
		if (per_page != null)
			params.add(PER_PAGE, per_page);
		if (sort != null)
			params.add(SORT, sort);
		if (sort_order != null)
			params.add(SORT_ORDER, sort_order);

		return params;

	}

	private MultiValueMap<String, String> buildSearchQueryParams(String artistAlbumquery, String query, String type,
			String title, String artist, String release_title, String anv, String label, String genre, String style,
			String country, String year, String format, String catno, String barcode, String track, String submitter,
			String contributor, String page, String per_page, String sort, String sort_order) {

		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		params.add(KEY, KEY_VALUE);
		params.add(SECRET, SECRET_VALUE);
		if (query != null)
			params.add(Q, query);
		if (type != null)
			params.add(TYPE, type);
		if (artistAlbumquery != null)
			params.add(TITLE, title);
		if (artist != null)
			params.add(ARTIST, artist);
		if (release_title != null)
			params.add(RELEASE_TITLE, release_title);
		if (anv != null)
			params.add(ANV, anv);
		if (label != null)
			params.add(LABEL, label);
		if (genre != null)
			params.add(GENRE, genre);
		if (style != null)
			params.add(STYLE, style);
		if (country != null)
			params.add(COUNTRY, country);
		if (year != null)
			params.add(YEAR, year);
		if (format != null)
			params.add(FORMAT, format);
		if (catno != null)
			params.add(CATNO, catno);
		if (barcode != null)
			params.add(BARCODE, barcode);
		if (track != null)
			params.add(TRACK, track);
		if (submitter != null)
			params.add(SUBMITTER, submitter);
		if (contributor != null)
			params.add(CONTRIBUTOR, contributor);
		if (page != null)
			params.add(PAGE, page);
		if (per_page != null)
			params.add(PER_PAGE, per_page);
		if (sort != null)
			params.add(SORT, sort);
		if (sort_order != null)
			params.add(SORT_ORDER, sort_order);

		return params;
	}
}
