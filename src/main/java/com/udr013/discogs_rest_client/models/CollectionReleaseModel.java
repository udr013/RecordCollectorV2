
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionReleaseModel{


    private Integer collectionId;
    private Integer releaseId;
    private Integer rating;
    @JsonProperty("basic_information")
    private BasicInformationModel basicInformation;
    private String dateAdded;

    public Integer getCollectionId() {
        return collectionId;
    }


    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public BasicInformationModel getBasicInformation() {
        return basicInformation;
    }

    public void setBasicInformation(BasicInformationModel basicInformation) {
        this.basicInformation = basicInformation;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }


}
