package com.udr013.discogs_rest_client.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VersionModel{

	private String status;
	private String thumb;
	private String title;
	private String country;
	private String format;
	private String label;
	private String released;
	@JsonProperty("major_formats")
	private List<String> majorFormats = null;
	private String catno;
	@JsonProperty("resource_url")
	private String resourceUrl;
	private Integer id;

	public String getStatus(){
		return status;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getThumb(){
		return thumb;
	}

	public void setThumb(String thumb){
		this.thumb = thumb;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCountry(){
		return country;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getFormat(){
		return format;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getLabel(){
		return label;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getReleased(){
		return released;
	}

	public void setReleased(String released){
		this.released = released;
	}

	public List<String> getMajorFormats(){
		return majorFormats;
	}

	public void setMajorFormats(List<String> majorFormats){
		this.majorFormats = majorFormats;
	}

	public String getCatno(){
		return catno;
	}

	public void setCatno(String catno){
		this.catno = catno;
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
}
