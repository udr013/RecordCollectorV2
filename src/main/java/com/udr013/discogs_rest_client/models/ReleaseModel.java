package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseModel extends BaseReleaseModel {

    @JsonProperty("data_quality")
    private String dataQuality;

    private CommunityModel community;

    private List<CompanyModel> companies;

    private String country;

    @JsonProperty("date_added")
    private Date dateAdded;

    @JsonProperty("date_changed")
    private Date dateChanged;

    @JsonProperty("estimated_weight")
    private double estimatedWeight;

    @JsonProperty("extraartists")
    private List<ArtistModel> extraArtists;

    @JsonProperty("format_quantity")
    private int formatQuantity;

    private List<String> genres;

    private List<String> styles;

    private List<IdentifierModel> identifiers;

    private List<ImageModel> images;

    @JsonProperty("lowest_price")
    private Double lowestPrice;

    @JsonProperty("master_id")
    private int masterId;

    @JsonProperty("master_url")
    private String masterUrl;

    private String notes;

    @JsonProperty("num_for_sale")
    private int numForSale;

    private String released;

    @JsonProperty("released_formatted")
    private String releasedFormatted;

    private List<String> series;

    private String status;

    private List<TracklistModel> tracklist;

    private String uri;

    private List<VideoModel> videos;

    public String getDataQuality() {
        return dataQuality;
    }

    public void setDataQuality(String dataQuality) {
        this.dataQuality = dataQuality;
    }

    public CommunityModel getCommunity() {
        return community;
    }

    public void setCommunity(CommunityModel community) {
        this.community = community;
    }

    public List<CompanyModel> getCompanies() {
        return companies;
    }

    public void setCompanies(List<CompanyModel> companies) {
        this.companies = companies;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public double getEstimatedWeight() {
        return estimatedWeight;
    }

    public void setEstimatedWeight(double estimatedWeight) {
        this.estimatedWeight = estimatedWeight;
    }

    public List<ArtistModel> getExtraArtists() {
        return extraArtists;
    }

    public void setExtraArtists(List<ArtistModel> extraArtists) {
        this.extraArtists = extraArtists;
    }

    public int getFormatQuantity() {
        return formatQuantity;
    }

    public void setFormatQuantity(int formatQuantity) {
        this.formatQuantity = formatQuantity;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getStyles() {
        return styles;
    }

    public void setStyles(List<String> styles) {
        this.styles = styles;
    }

    public List<IdentifierModel> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<IdentifierModel> identifiers) {
        this.identifiers = identifiers;
    }

    public List<ImageModel> getImages() {
        return images;
    }

    public void setImages(List<ImageModel> images) {
        this.images = images;
    }

    public Double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public int getMasterId() {
        return masterId;
    }

    public void setMasterId(int masterId) {
        this.masterId = masterId;
    }

    public String getMasterUrl() {
        return masterUrl;
    }

    public void setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getNumForSale() {
        return numForSale;
    }

    public void setNumForSale(int numForSale) {
        this.numForSale = numForSale;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getReleasedFormatted() {
        return releasedFormatted;
    }

    public void setReleasedFormatted(String releasedFormatted) {
        this.releasedFormatted = releasedFormatted;
    }

    public List<String> getSeries() {
        return series;
    }

    public void setSeries(List<String> series) {
        this.series = series;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TracklistModel> getTracklist() {
        return tracklist;
    }

    public void setTracklist(List<TracklistModel> tracklist) {
        this.tracklist = tracklist;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<VideoModel> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoModel> videos) {
        this.videos = videos;
    }
}