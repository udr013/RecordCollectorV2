
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

@JsonPropertyOrder({
    "thumb",
    "title",
    "uri",
    "resource_url",
    "type",
    "id",
    "style",
    "format",
    "country",
    "barcode",
    "community",
    "label",
    "catno",
    "year",
    "genre"
})
public class Result{

    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("title")
    private String title;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("resource_url")
    private String resourceUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("style")
    private List<String> style = null;
    @JsonProperty("format")
    private List<String> format = null;
    @JsonProperty("country")
    private String country;
    @JsonProperty("barcode")
    private List<String> barcode = null;
    @JsonProperty("community")
    private Community community;
    @JsonProperty("label")
    private List<String> label = null;
    @JsonProperty("catno")
    private String catno;
    @JsonProperty("year")
    private String year;
    @JsonProperty("genre")
    private List<String> genre = null;

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("resource_url")
    public String getResourceUrl() {
        return resourceUrl;
    }

    @JsonProperty("resource_url")
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("style")
    public List<String> getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(List<String> style) {
        this.style = style;
    }

    @JsonProperty("format")
    public List<String> getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(List<String> format) {
        this.format = format;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("barcode")
    public List<String> getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(List<String> barcode) {
        this.barcode = barcode;
    }

    @JsonProperty("community")
    public Community getCommunity() {
        return community;
    }

    @JsonProperty("community")
    public void setCommunity(Community community) {
        this.community = community;
    }

    @JsonProperty("label")
    public List<String> getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(List<String> label) {
        this.label = label;
    }

    @JsonProperty("catno")
    public String getCatno() {
        return catno;
    }

    @JsonProperty("catno")
    public void setCatno(String catno) {
        this.catno = catno;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("genre")
    public List<String> getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

}
