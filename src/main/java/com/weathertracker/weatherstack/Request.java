package com.weathertracker.weatherstack;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Request.
 */
public class Request {

	/**
	 * Instantiates a new Request.
	 */
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

	/**
	 * Set unit.
	 *
	 * @param unit the unit
	 */
	public void setUnit(String unit){
		this.unit = unit;
	}

	/**
	 * Get unit string.
	 *
	 * @return the string
	 */
	public String getUnit(){
		return unit;
	}

	/**
	 * Set query.
	 *
	 * @param query the query
	 */
	public void setQuery(String query){
		this.query = query;
	}

	/**
	 * Get query string.
	 *
	 * @return the string
	 */
	public String getQuery(){
		return query;
	}

	/**
	 * Set language.
	 *
	 * @param language the language
	 */
	public void setLanguage(String language){
		this.language = language;
	}

	/**
	 * Get language string.
	 *
	 * @return the string
	 */
	public String getLanguage(){
		return language;
	}

	/**
	 * Set type.
	 *
	 * @param type the type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * Get type string.
	 *
	 * @return the string
	 */
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