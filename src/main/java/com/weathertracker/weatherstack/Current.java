package com.weathertracker.weatherstack;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Current.
 */
public class Current{

	@JsonProperty("weather_descriptions")
	private List<String> weatherDescriptions;

	@JsonProperty("observation_time")
	private String observationTime;

	@JsonProperty("wind_degree")
	private int windDegree;

	@JsonProperty("visibility")
	private int visibility;

	@JsonProperty("weather_icons")
	private List<String> weatherIcons;

	@JsonProperty("feelslike")
	private int feelslike;

	@JsonProperty("is_day")
	private String isDay;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("pressure")
	private int pressure;

	@JsonProperty("cloudcover")
	private int cloudcover;

	@JsonProperty("precip")
	private int precip;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("temperature")
	private int temperature;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("wind_speed")
	private int windSpeed;

	@JsonProperty("weather_code")
	private int weatherCode;

	/**
	 * Instantiates a new Current.
	 */
// Default constructor
	public Current() {
		// Initialization, if needed
	}

	/**
	 * Instantiates a new Current.
	 *
	 * @param s            the s
	 * @param s1           the s 1
	 * @param number       the number
	 * @param number1      the number 1
	 * @param weatherIcons the weather icons
	 */
	public Current(String s, String s1, String number, String number1, String weatherIcons) {
	}

	/**
	 * Set weather descriptions.
	 *
	 * @param weatherDescriptions the weather descriptions
	 */
	public void setWeatherDescriptions(List<String> weatherDescriptions){
		this.weatherDescriptions = weatherDescriptions;
	}

	/**
	 * Get weather descriptions list.
	 *
	 * @return the list
	 */
	public List<String> getWeatherDescriptions(){
		return weatherDescriptions;
	}

	/**
	 * Set observation time.
	 *
	 * @param observationTime the observation time
	 */
	public void setObservationTime(String observationTime){
		this.observationTime = observationTime;
	}

	/**
	 * Get observation time string.
	 *
	 * @return the string
	 */
	public String getObservationTime(){
		return observationTime;
	}

	/**
	 * Set wind degree.
	 *
	 * @param windDegree the wind degree
	 */
	public void setWindDegree(int windDegree){
		this.windDegree = windDegree;
	}

	/**
	 * Get wind degree int.
	 *
	 * @return the int
	 */
	public int getWindDegree(){
		return windDegree;
	}

	/**
	 * Set visibility.
	 *
	 * @param visibility the visibility
	 */
	public void setVisibility(int visibility){
		this.visibility = visibility;
	}

	/**
	 * Get visibility int.
	 *
	 * @return the int
	 */
	public int getVisibility(){
		return visibility;
	}

	/**
	 * Set weather icons.
	 *
	 * @param weatherIcons the weather icons
	 */
	public void setWeatherIcons(List<String> weatherIcons){
		this.weatherIcons = weatherIcons;
	}

	/**
	 * Get weather icons list.
	 *
	 * @return the list
	 */
	public List<String> getWeatherIcons(){
		return weatherIcons;
	}

	/**
	 * Set feelslike.
	 *
	 * @param feelslike the feelslike
	 */
	public void setFeelslike(int feelslike){
		this.feelslike = feelslike;
	}

	/**
	 * Get feelslike int.
	 *
	 * @return the int
	 */
	public int getFeelslike(){
		return feelslike;
	}

	/**
	 * Set is day.
	 *
	 * @param isDay the is day
	 */
	public void setIsDay(String isDay){
		this.isDay = isDay;
	}

	/**
	 * Get is day string.
	 *
	 * @return the string
	 */
	public String getIsDay(){
		return isDay;
	}

	/**
	 * Set wind dir.
	 *
	 * @param windDir the wind dir
	 */
	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	/**
	 * Get wind dir string.
	 *
	 * @return the string
	 */
	public String getWindDir(){
		return windDir;
	}

	/**
	 * Set pressure.
	 *
	 * @param pressure the pressure
	 */
	public void setPressure(int pressure){
		this.pressure = pressure;
	}

	/**
	 * Get pressure int.
	 *
	 * @return the int
	 */
	public int getPressure(){
		return pressure;
	}

	/**
	 * Set cloudcover.
	 *
	 * @param cloudcover the cloudcover
	 */
	public void setCloudcover(int cloudcover){
		this.cloudcover = cloudcover;
	}

	/**
	 * Get cloudcover int.
	 *
	 * @return the int
	 */
	public int getCloudcover(){
		return cloudcover;
	}

	/**
	 * Set precip.
	 *
	 * @param precip the precip
	 */
	public void setPrecip(int precip){
		this.precip = precip;
	}

	/**
	 * Get precip int.
	 *
	 * @return the int
	 */
	public int getPrecip(){
		return precip;
	}

	/**
	 * Set uv index.
	 *
	 * @param uvIndex the uv index
	 */
	public void setUvIndex(int uvIndex){
		this.uvIndex = uvIndex;
	}

	/**
	 * Get uv index int.
	 *
	 * @return the int
	 */
	public int getUvIndex(){
		return uvIndex;
	}

	/**
	 * Set temperature.
	 *
	 * @param temperature the temperature
	 */
	public void setTemperature(int temperature){
		this.temperature = temperature;
	}

	/**
	 * Get temperature int.
	 *
	 * @return the int
	 */
	public int getTemperature(){
		return temperature;
	}

	/**
	 * Set humidity.
	 *
	 * @param humidity the humidity
	 */
	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	/**
	 * Get humidity int.
	 *
	 * @return the int
	 */
	public int getHumidity(){
		return humidity;
	}

	/**
	 * Set wind speed.
	 *
	 * @param windSpeed the wind speed
	 */
	public void setWindSpeed(int windSpeed){
		this.windSpeed = windSpeed;
	}

	/**
	 * Get wind speed int.
	 *
	 * @return the int
	 */
	public int getWindSpeed(){
		return windSpeed;
	}

	/**
	 * Set weather code.
	 *
	 * @param weatherCode the weather code
	 */
	public void setWeatherCode(int weatherCode){
		this.weatherCode = weatherCode;
	}

	/**
	 * Get weather code int.
	 *
	 * @return the int
	 */
	public int getWeatherCode(){
		return weatherCode;
	}

	@Override
 	public String toString(){
		return 
			"Current{" + 
			"weather_descriptions = '" + weatherDescriptions + '\'' + 
			",observation_time = '" + observationTime + '\'' + 
			",wind_degree = '" + windDegree + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",weather_icons = '" + weatherIcons + '\'' + 
			",feelslike = '" + feelslike + '\'' + 
			",is_day = '" + isDay + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",cloudcover = '" + cloudcover + '\'' + 
			",precip = '" + precip + '\'' + 
			",uv_index = '" + uvIndex + '\'' + 
			",temperature = '" + temperature + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			",weather_code = '" + weatherCode + '\'' + 
			"}";
		}
}