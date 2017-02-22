
package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PaginationModel{

    @JsonProperty("per_page")
    private Integer perPage;
    private Integer pages;
    private Integer page;
    @JsonProperty("urls")
    private UrlsModel urlsModel;
    private Integer items;

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public UrlsModel getUrlsModel() {
        return urlsModel;
    }

    public void setUrlsModel(UrlsModel urlsModel) {
        this.urlsModel = urlsModel;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

}
