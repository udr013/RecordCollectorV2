
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingExtendedModel{

    public RatingModel getRating(){
        return rating;
    }

    public void setRating(RatingModel rating){
        this.rating = rating;
    }

    public Integer getReleaseId(){
        return releaseId;
    }

    public void setReleaseId(Integer releaseId){
        this.releaseId = releaseId;
    }

    @JsonProperty("rating")
    public RatingModel rating;
    @JsonProperty("release_id")
    public Integer releaseId;



}
