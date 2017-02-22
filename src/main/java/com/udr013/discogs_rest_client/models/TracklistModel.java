
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TracklistModel {

    private String duration;
    private String position;
    private String type;
    private List<ArtistModel> artistModels = null;
    private String title;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ArtistModel> getArtistModels() {
        return artistModels;
    }

    public void setArtistModels(List<ArtistModel> ArtistModels) {
        this.artistModels = ArtistModels;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
