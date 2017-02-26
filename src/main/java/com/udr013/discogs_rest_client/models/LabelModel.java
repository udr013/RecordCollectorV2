
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelModel {

    @JsonProperty("profile")
    private String profile;
    @JsonProperty("releases_url")
    private String releasesUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("contact_info")
    private String contactInfo;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("sublabels")
    private List<Sublabel> sublabels = null;
    @JsonProperty("urls")
    private List<String> urls = null;
    @JsonProperty("images")
    private List<ImageModel> images = null;
    @JsonProperty("resource_url")
    private String resourceUrl;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("data_quality")
    private String dataQuality;

    public String getProfile(){
        return profile;
    }

    public void setProfile(String profile){
        this.profile = profile;
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

    public String getContactInfo(){
        return contactInfo;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    public String getUri(){
        return uri;
    }

    public void setUri(String uri){
        this.uri = uri;
    }

    public List<Sublabel> getSublabels(){
        return sublabels;
    }

    public void setSublabels(List<Sublabel> sublabels){
        this.sublabels = sublabels;
    }

    public List<String> getUrls(){
        return urls;
    }

    public void setUrls(List<String> urls){
        this.urls = urls;
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
}
