
package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "want",
    "have"
})
public class Community {

    @JsonProperty("want")
    private Integer want;
    @JsonProperty("have")
    private Integer have;

    @JsonProperty("want")
    public Integer getWant() {
        return want;
    }

    @JsonProperty("want")
    public void setWant(Integer want) {
        this.want = want;
    }

    @JsonProperty("have")
    public Integer getHave() {
        return have;
    }

    @JsonProperty("have")
    public void setHave(Integer have) {
        this.have = have;
    }

}
