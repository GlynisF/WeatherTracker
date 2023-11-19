package com.weathertracker.weatherstack;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Location.
 */
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

	/**
	 * Set localtime.
	 *
	 * @param localtime the localtime
	 */
	public void setLocaltime(String localtime){
		this.localtime = localtime;
	}

	/**
	 * Get localtime string.
	 *
	 * @return the string
	 */
	public String getLocaltime(){
		return localtime;
	}

	/**
	 * Set utc offset.
	 *
	 * @param utcOffset the utc offset
	 */
	public void setUtcOffset(String utcOffset){
		this.utcOffset = utcOffset;
	}

	/**
	 * Get utc offset string.
	 *
	 * @return the string
	 */
	public String getUtcOffset(){
		return utcOffset;
	}

	/**
	 * Set country.
	 *
	 * @param country the country
	 */
	public void setCountry(String country){
		this.country = country;
	}

	/**
	 * Get country string.
	 *
	 * @return the string
	 */
	public String getCountry(){
		return country;
	}

	/**
	 * Set localtime epoch.
	 *
	 * @param localtimeEpoch the localtime epoch
	 */
	public void setLocaltimeEpoch(int localtimeEpoch){
		this.localtimeEpoch = localtimeEpoch;
	}

	/**
	 * Get localtime epoch int.
	 *
	 * @return the int
	 */
	public int getLocaltimeEpoch(){
		return localtimeEpoch;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set timezone id.
	 *
	 * @param timezoneId the timezone id
	 */
	public void setTimezoneId(String timezoneId){
		this.timezoneId = timezoneId;
	}

	/**
	 * Get timezone id string.
	 *
	 * @return the string
	 */
	public String getTimezoneId(){
		return timezoneId;
	}

	/**
	 * Set lon.
	 *
	 * @param lon the lon
	 */
	public void setLon(String lon){
		this.lon = lon;
	}

	/**
	 * Get lon string.
	 *
	 * @return the string
	 */
	public String getLon(){
		return lon;
	}

	/**
	 * Set region.
	 *
	 * @param region the region
	 */
	public void setRegion(String region){
		this.region = region;
	}

	/**
	 * Get region string.
	 *
	 * @return the string
	 */
	public String getRegion(){
		return region;
	}

	/**
	 * Set lat.
	 *
	 * @param lat the lat
	 */
	public void setLat(String lat){
		this.lat = lat;
	}

	/**
	 * Get lat string.
	 *
	 * @return the string
	 */
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