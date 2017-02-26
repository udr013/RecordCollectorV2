
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageVersionModel{

    @JsonProperty("pagination")
    private PaginationModel paginationModel;
    private List<VersionModel> versions = null;

    public PaginationModel getPaginationModel() {
        return paginationModel;
    }

    public void setPaginationModel(PaginationModel paginationModel) {
        this.paginationModel = paginationModel;
    }

    public List<VersionModel> getVersions(){
        return versions;
    }

    public void setVersions(List<VersionModel> versions){
        this.versions = versions;
    }
}
