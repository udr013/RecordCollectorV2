
package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WantedModel{


    private Integer want;
    private Integer have;

    public Integer getWant() {
        return want;
    }

    public void setWant(Integer want) {
        this.want = want;
    }

    public Integer getHave() {
        return have;
    }

    public void setHave(Integer have) {
        this.have = have;
    }

}
