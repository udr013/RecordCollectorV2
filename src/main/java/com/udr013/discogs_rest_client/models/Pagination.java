
package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "per_page",
    "pages",
    "page",
    "urlsModel",
    "items"
})
public class Pagination {

    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("urlsModel")
    private Urls urlsModel;
    @JsonProperty("items")
    private Integer items;

    @JsonProperty("per_page")
    public Integer getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("urlsModel")
    public Urls getUrlsModel() {
        return urlsModel;
    }

    @JsonProperty("urlsModel")
    public void setUrlsModel(Urls urlsModel) {
        this.urlsModel = urlsModel;
    }

    @JsonProperty("items")
    public Integer getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(Integer items) {
        this.items = items;
    }

}
