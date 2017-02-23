
package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resource_url",
    "id",
    "name"
})
public class Sublabel {

    @JsonProperty("resource_url")
    public String resourceUrl;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;

}
