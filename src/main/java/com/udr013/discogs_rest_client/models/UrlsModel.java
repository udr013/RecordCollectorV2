
package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class UrlsModel{


    private String next;
    private String prev;
    private String last;
    private String first;


    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev(){
        return prev;
    }

    public void setPrev(String prev){
        this.prev = prev;
    }

    public String getFirst(){
        return first;
    }

    public void setFirst(String first){
        this.first = first;
    }
}
