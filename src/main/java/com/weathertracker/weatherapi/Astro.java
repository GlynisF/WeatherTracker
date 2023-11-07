package com.weathertracker.weatherapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Astro{

	@JsonProperty("moonset")
	private String moonset;

	@JsonProperty("moon_illumination")
	private int moonIllumination;

	@JsonProperty("sunrise")
	private String sunrise;

	@JsonProperty("moon_phase")
	private String moonPhase;

	@JsonProperty("sunset")
	private String sunset;

	@JsonProperty("is_moon_up")
	private int isMoonUp;

	@JsonProperty("is_sun_up")
	private int isSunUp;

	@JsonProperty("moonrise")
	private String moonrise;

	public void setMoonset(String moonset){
		this.moonset = moonset;
	}

	public String getMoonset(){
		return moonset;
	}

	public void setMoonIllumination(int moonIllumination){
		this.moonIllumination = moonIllumination;
	}

	public int getMoonIllumination(){
		return moonIllumination;
	}

	public void setSunrise(String sunrise){
		this.sunrise = sunrise;
	}

	public String getSunrise(){
		return sunrise;
	}

	public void setMoonPhase(String moonPhase){
		this.moonPhase = moonPhase;
	}

	public String getMoonPhase(){
		return moonPhase;
	}

	public void setSunset(String sunset){
		this.sunset = sunset;
	}

	public String getSunset(){
		return sunset;
	}

	public void setIsMoonUp(int isMoonUp){
		this.isMoonUp = isMoonUp;
	}

	public int getIsMoonUp(){
		return isMoonUp;
	}

	public void setIsSunUp(int isSunUp){
		this.isSunUp = isSunUp;
	}

	public int getIsSunUp(){
		return isSunUp;
	}

	public void setMoonrise(String moonrise){
		this.moonrise = moonrise;
	}

	public String getMoonrise(){
		return moonrise;
	}

	@Override
 	public String toString(){
		return 
			"Astro{" + 
			"moonset = '" + moonset + '\'' + 
			",moon_illumination = '" + moonIllumination + '\'' + 
			",sunrise = '" + sunrise + '\'' + 
			",moon_phase = '" + moonPhase + '\'' + 
			",sunset = '" + sunset + '\'' + 
			",is_moon_up = '" + isMoonUp + '\'' + 
			",is_sun_up = '" + isSunUp + '\'' + 
			",moonrise = '" + moonrise + '\'' + 
			"}";
		}
}