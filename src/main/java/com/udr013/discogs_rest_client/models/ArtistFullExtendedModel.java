package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ArtistFullExtendedModel{

    private String profile;
    private String realname;
    @JsonProperty("releases_url")
    private String releasesUrl;
    public String name;
    private String uri;
    @JsonProperty("images")
    private List<ImageModel> images = null;
    @JsonProperty("resource_url")
    public String resourceUrl;
    @JsonProperty("aliases")
    private List<AliasModel> aliases = null;
    public Integer id;
    @JsonProperty("data_quality")
    private String dataQuality;
    private List<String> namevariations = null;

    public String getProfile(){
        return profile;
    }

    public void setProfile(String profile){
        this.profile = profile;
    }

    public String getRealname(){
        return realname;
    }

    public void setRealname(String realname){
        this.realname = realname;
    }

    public String getReleasesUrl(){
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl){
        this.releasesUrl = releasesUrl;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUri(){
        return uri;
    }

    public void setUri(String uri){
        this.uri = uri;
    }

    public List<ImageModel> getImages(){
        return images;
    }

    public void setImages(List<ImageModel> images){
        this.images = images;
    }

    public String getResourceUrl(){
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl){
        this.resourceUrl = resourceUrl;
    }

    public List<AliasModel> getAliases(){
        return aliases;
    }

    public void setAliases(List<AliasModel> aliases){
        this.aliases = aliases;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getDataQuality(){
        return dataQuality;
    }

    public void setDataQuality(String dataQuality){
        this.dataQuality = dataQuality;
    }

    public List<String> getNamevariations(){
        return namevariations;
    }

    public void setNamevariations(List<String> namevariations){
        this.namevariations = namevariations;
    }
}