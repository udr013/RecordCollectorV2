
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class LabelModel {

    @JsonProperty("profile")
    public String profile;
    @JsonProperty("releases_url")
    public String releasesUrl;
    @JsonProperty("name")
    public String name;
    @JsonProperty("contact_info")
    public String contactInfo;
    @JsonProperty("uri")
    public String uri;
    @JsonProperty("sublabels")
    public List<Sublabel> sublabels = null;
    @JsonProperty("urls")
    public List<String> urls = null;
    @JsonProperty("images")
    public List<ImageModel> images = null;
    @JsonProperty("resource_url")
    public String resourceUrl;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("data_quality")
    public String dataQuality;

}
