package com.weathertracker.weatherstack;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.QueryParam;

/**
 * The type Weather.
 */
public class Weather {

	/**
	 * Instantiates a new Weather.
	 */
	public Weather() {

	}


	@JsonProperty("request")
	private Request request;


	@JsonProperty("current")
	private Current current;


	@JsonProperty("location")
	private Location location;



	/**
	 * Get request request.
	 *
	 * @return the request
	 */
	public Request getRequest(){
		return request;
	}

	/**
	 * Set current.
	 *
	 * @param current the current
	 */
	public void setCurrent(Current current){
		this.current = current;
	}

	/**
	 * Get current current.
	 *
	 * @return the current
	 */
    @QueryParam("current")
	public Current getCurrent(){
		return current;
	}

	/**
	 * Set location.
	 *
	 * @param location the location
	 */
	public void setLocation(Location location){
		this.location = location;
	}

	/**
	 * Get location location.
	 *
	 * @return the location
	 */
	public Location getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"Weather{" + 
			"request = '" + request + '\'' + 
			",current = '" + current + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}