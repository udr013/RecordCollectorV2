
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterModel{

    private List<String> styles = null;
    private List<VideoModel> videos = null;
    private List<ArtistModel> artists = null;
    @JsonProperty("versions_url")
    private String versionsUrl;
    private Integer year;
    private List<ImageModel> images = null;
    private Integer id;
    private List<TracklistModel> tracklist = null;
    private List<String> genres = null;
    @JsonProperty("num_for_sale")
    private Integer numForSale;
    private String title;
    @JsonProperty("main_release")
    private Integer mainRelease;
    @JsonProperty("main_release_url")
    private String mainReleaseUrl;
    private String uri;
    @JsonProperty("resource_url")
    private String resourceUrl;
    @JsonProperty("lowest_price")
    private Double lowestPrice;
    @JsonProperty("data_quality")
    private String dataQuality;

    public List<String> getStyles() {
        return styles;
    }

    public void setStyles(List<String> styles) {
        this.styles = styles;
    }

    public List<VideoModel> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoModel> videos) {
        this.videos = videos;
    }

    public List<ArtistModel> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistModel> artists) {
        this.artists = artists;
    }

    public String getVersionsUrl() {
        return versionsUrl;
    }

    public void setVersionsUrl(String versionsUrl) {
        this.versionsUrl = versionsUrl;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<ImageModel> getImages() {
        return images;
    }

    public void setImages(List<ImageModel> images) {
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<TracklistModel> getTracklist() {
        return tracklist;
    }

    public void setTracklist(List<TracklistModel> tracklist) {
        this.tracklist = tracklist;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Integer getNumForSale() {
        return numForSale;
    }

    public void setNumForSale(Integer numForSale) {
        this.numForSale = numForSale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMainRelease() {
        return mainRelease;
    }

    public void setMainRelease(Integer mainRelease) {
        this.mainRelease = mainRelease;
    }

    public String getMainReleaseUrl() {
        return mainReleaseUrl;
    }

    public void setMainReleaseUrl(String mainReleaseUrl) {
        this.mainReleaseUrl = mainReleaseUrl;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public Double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public String getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(String dataQuality) {
        this.dataQuality = dataQuality;
    }
}
