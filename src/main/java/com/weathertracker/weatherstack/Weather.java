package com.weathertracker.weatherstack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

	public Weather() {

	}

	@JsonProperty("request")
	private Request request;

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;



	public Request getRequest(){
		return request;
	}

	public void setCurrent(Current current){
		this.current = current;
	}

	public Current getCurrent(){
		return current;
	}

	public void setLocation(Location location){
		this.location = location;
	}

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