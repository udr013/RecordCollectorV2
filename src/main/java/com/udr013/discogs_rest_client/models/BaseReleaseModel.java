package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseReleaseModel {

		protected long id;

		@JsonProperty("resource_url")
		protected String resourceUrl;

		private String title;

		private List<ArtistModel> artists;

		private List<CompanyModel> labels;
		private List<FormatModel> formats;

		@JsonProperty("thumb")
		private String thumbnail;

		private Integer year;

		public long getId() {
			return id;
		}

		public String getResourceUrl() {
			return resourceUrl;
		}

		public String getTitle() {
			return title;
		}

		public List<ArtistModel> getArtists() {
			return artists;
		}

		public List<CompanyModel> getLabels() {
			return labels;
		}

		public List<FormatModel> getFormats() {
			return formats;
		}

		public String getThumbnail() {
			return thumbnail;
		}

		public Integer getYear() {
			return year;
		}
}
