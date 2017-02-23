
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicInformationModel{

    @JsonProperty("labels")
    private List<BasicLabelModel> labels = null;
    @JsonProperty("formats")
    private List<FormatModel> formats = null;
    private String thumb;
    private String title;
    @JsonProperty("artists")
    private List<ArtistModel> artists = null;
    @JsonProperty("resource_url")
    private String resourceUrl;
    private Integer year;
    private Integer id;

    public List<BasicLabelModel> getLabels() {
        return labels;
    }

    public void setLabels(List<BasicLabelModel> labels) {
        this.labels = labels;
    }

    public List<FormatModel> getFormats() {
        return formats;
    }

    public void setFormats(List<FormatModel> formats) {
        this.formats = formats;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ArtistModel> getArtistModels() {
        return artists;
    }

    public void setArtistModels(List<ArtistModel> artist) {
        this.artists = artist;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
