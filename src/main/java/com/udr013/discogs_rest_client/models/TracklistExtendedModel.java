
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TracklistExtendedModel extends TracklistModel{


    @JsonProperty("artists")
    private List<ArtistModel> artists = null;

    public List<ArtistModel> getArtistModels() {
        return artists;
    }

    public void setArtistModels(List<ArtistModel> Artists) {
        this.artists = Artists;
    }


}
