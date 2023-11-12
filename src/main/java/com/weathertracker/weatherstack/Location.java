package com.weathertracker.weatherstack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("localtime")
	private String localtime;

	@JsonProperty("utc_offset")
	private String utcOffset;

	@JsonProperty("country")
	private String country;

	@JsonProperty("localtime_epoch")
	private int localtimeEpoch;

	@JsonProperty("name")
	private String name;

	@JsonProperty("timezone_id")
	private String timezoneId;

	@JsonProperty("lon")
	private String lon;

	@JsonProperty("region")
	private String region;

	@JsonProperty("lat")
	private String lat;

	public void setLocaltime(String localtime){
		this.localtime = localtime;
	}

	public String getLocaltime(){
		return localtime;
	}

	public void setUtcOffset(String utcOffset){
		this.utcOffset = utcOffset;
	}

	public String getUtcOffset(){
		return utcOffset;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLocaltimeEpoch(int localtimeEpoch){
		this.localtimeEpoch = localtimeEpoch;
	}

	public int getLocaltimeEpoch(){
		return localtimeEpoch;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTimezoneId(String timezoneId){
		this.timezoneId = timezoneId;
	}

	public String getTimezoneId(){
		return timezoneId;
	}

	public void setLon(String lon){
		this.lon = lon;
	}

	public String getLon(){
		return lon;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setLat(String lat){
		this.lat = lat;
	}

	public String getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"localtime = '" + localtime + '\'' + 
			",utc_offset = '" + utcOffset + '\'' + 
			",country = '" + country + '\'' + 
			",localtime_epoch = '" + localtimeEpoch + '\'' + 
			",name = '" + name + '\'' + 
			",timezone_id = '" + timezoneId + '\'' + 
			",lon = '" + lon + '\'' + 
			",region = '" + region + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}