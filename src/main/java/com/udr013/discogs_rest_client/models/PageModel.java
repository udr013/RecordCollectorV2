
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageModel{

    private PaginationModel paginationModel;
    @JsonProperty("results")
    private List<Result> results = null;

    public PaginationModel getPaginationModel() {
        return paginationModel;
    }

    public void setPaginationModel(PaginationModel paginationModel) {
        this.paginationModel = paginationModel;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
