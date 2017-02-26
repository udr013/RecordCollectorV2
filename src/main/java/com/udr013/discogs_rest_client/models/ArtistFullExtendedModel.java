package com.udr013.discogs_rest_client.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class ArtistFullExtendedModel extends ArtistExtendedModel{

    private String realname;

    @JsonProperty("aliases")
    private List<AliasModel> aliases = null;

    public String getRealname(){
        return realname;
    }

    public void setRealname(String realname){
        this.realname = realname;
    }

    public List<AliasModel> getAliases(){
        return aliases;
    }

    public void setAliases(List<AliasModel> aliases){
        this.aliases = aliases;
    }
}