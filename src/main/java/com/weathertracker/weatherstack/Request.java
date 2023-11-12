package com.weathertracker.weatherstack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

	public Request() {

	}

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("query")
	private String query;

	@JsonProperty("language")
	private String language;

	@JsonProperty("type")
	private String type;

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setQuery(String query){
		this.query = query;
	}

	public String getQuery(){
		return query;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Request{" + 
			"unit = '" + unit + '\'' + 
			",query = '" + query + '\'' + 
			",language = '" + language + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}