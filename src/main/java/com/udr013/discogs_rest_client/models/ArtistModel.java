
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtistModel{

    private String join;
    private String name;
    private String anv;
    private String tracks;
    private String role;
    @JsonProperty("resource_url")
    private String resourceUrl;
    private Integer id;

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnv() {
        return anv;
    }

    public void setAnv(String anv) {
        this.anv = anv;
    }

    public String getTracks() {
        return tracks;
    }

    public void setTracks(String tracks) {
        this.tracks = tracks;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
