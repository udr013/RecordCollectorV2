
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionModel {


    private PaginationModel pagination;
    private List<CollectionReleaseModel> releases = null;


    public PaginationModel getPagination() {
        return pagination;
    }


    public void setPagination(PaginationModel pagination) {
        this.pagination = pagination;
    }


    public List<CollectionReleaseModel> getReleases() {
        return releases;
    }


    public void setReleases(List<CollectionReleaseModel> releases) {
        this.releases = releases;
    }


}
