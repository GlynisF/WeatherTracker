package com.weathertracker.weatherapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HourItem{

	@JsonProperty("feelslike_c")
	private Object feelslikeC;

	@JsonProperty("feelslike_f")
	private Object feelslikeF;

	@JsonProperty("wind_degree")
	private int windDegree;

	@JsonProperty("windchill_f")
	private Object windchillF;

	@JsonProperty("windchill_c")
	private Object windchillC;

	@JsonProperty("temp_c")
	private Object tempC;

	@JsonProperty("temp_f")
	private Object tempF;

	@JsonProperty("cloud")
	private int cloud;

	@JsonProperty("wind_kph")
	private Object windKph;

	@JsonProperty("wind_mph")
	private Object windMph;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("dewpoint_f")
	private Object dewpointF;

	@JsonProperty("will_it_rain")
	private int willItRain;

	@JsonProperty("uv")
	private int uv;

	@JsonProperty("heatindex_f")
	private Object heatindexF;

	@JsonProperty("dewpoint_c")
	private Object dewpointC;

	@JsonProperty("is_day")
	private int isDay;

	@JsonProperty("precip_in")
	private int precipIn;

	@JsonProperty("heatindex_c")
	private Object heatindexC;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private Object gustMph;

	@JsonProperty("pressure_in")
	private Object pressureIn;

	@JsonProperty("chance_of_rain")
	private int chanceOfRain;

	@JsonProperty("gust_kph")
	private Object gustKph;

	@JsonProperty("precip_mm")
	private int precipMm;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("will_it_snow")
	private int willItSnow;

	@JsonProperty("vis_km")
	private int visKm;

	@JsonProperty("time_epoch")
	private int timeEpoch;

	@JsonProperty("time")
	private String time;

	@JsonProperty("chance_of_snow")
	private int chanceOfSnow;

	@JsonProperty("pressure_mb")
	private int pressureMb;

	@JsonProperty("vis_miles")
	private int visMiles;

	public void setFeelslikeC(Object feelslikeC){
		this.feelslikeC = feelslikeC;
	}

	public Object getFeelslikeC(){
		return feelslikeC;
	}

	public void setFeelslikeF(Object feelslikeF){
		this.feelslikeF = feelslikeF;
	}

	public Object getFeelslikeF(){
		return feelslikeF;
	}

	public void setWindDegree(int windDegree){
		this.windDegree = windDegree;
	}

	public int getWindDegree(){
		return windDegree;
	}

	public void setWindchillF(Object windchillF){
		this.windchillF = windchillF;
	}

	public Object getWindchillF(){
		return windchillF;
	}

	public void setWindchillC(Object windchillC){
		this.windchillC = windchillC;
	}

	public Object getWindchillC(){
		return windchillC;
	}

	public void setTempC(Object tempC){
		this.tempC = tempC;
	}

	public Object getTempC(){
		return tempC;
	}

	public void setTempF(Object tempF){
		this.tempF = tempF;
	}

	public Object getTempF(){
		return tempF;
	}

	public void setCloud(int cloud){
		this.cloud = cloud;
	}

	public int getCloud(){
		return cloud;
	}

	public void setWindKph(Object windKph){
		this.windKph = windKph;
	}

	public Object getWindKph(){
		return windKph;
	}

	public void setWindMph(Object windMph){
		this.windMph = windMph;
	}

	public Object getWindMph(){
		return windMph;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setDewpointF(Object dewpointF){
		this.dewpointF = dewpointF;
	}

	public Object getDewpointF(){
		return dewpointF;
	}

	public void setWillItRain(int willItRain){
		this.willItRain = willItRain;
	}

	public int getWillItRain(){
		return willItRain;
	}

	public void setUv(int uv){
		this.uv = uv;
	}

	public int getUv(){
		return uv;
	}

	public void setHeatindexF(Object heatindexF){
		this.heatindexF = heatindexF;
	}

	public Object getHeatindexF(){
		return heatindexF;
	}

	public void setDewpointC(Object dewpointC){
		this.dewpointC = dewpointC;
	}

	public Object getDewpointC(){
		return dewpointC;
	}

	public void setIsDay(int isDay){
		this.isDay = isDay;
	}

	public int getIsDay(){
		return isDay;
	}

	public void setPrecipIn(int precipIn){
		this.precipIn = precipIn;
	}

	public int getPrecipIn(){
		return precipIn;
	}

	public void setHeatindexC(Object heatindexC){
		this.heatindexC = heatindexC;
	}

	public Object getHeatindexC(){
		return heatindexC;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setGustMph(Object gustMph){
		this.gustMph = gustMph;
	}

	public Object getGustMph(){
		return gustMph;
	}

	public void setPressureIn(Object pressureIn){
		this.pressureIn = pressureIn;
	}

	public Object getPressureIn(){
		return pressureIn;
	}

	public void setChanceOfRain(int chanceOfRain){
		this.chanceOfRain = chanceOfRain;
	}

	public int getChanceOfRain(){
		return chanceOfRain;
	}

	public void setGustKph(Object gustKph){
		this.gustKph = gustKph;
	}

	public Object getGustKph(){
		return gustKph;
	}

	public void setPrecipMm(int precipMm){
		this.precipMm = precipMm;
	}

	public int getPrecipMm(){
		return precipMm;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}

	public Condition getCondition(){
		return condition;
	}

	public void setWillItSnow(int willItSnow){
		this.willItSnow = willItSnow;
	}

	public int getWillItSnow(){
		return willItSnow;
	}

	public void setVisKm(int visKm){
		this.visKm = visKm;
	}

	public int getVisKm(){
		return visKm;
	}

	public void setTimeEpoch(int timeEpoch){
		this.timeEpoch = timeEpoch;
	}

	public int getTimeEpoch(){
		return timeEpoch;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setChanceOfSnow(int chanceOfSnow){
		this.chanceOfSnow = chanceOfSnow;
	}

	public int getChanceOfSnow(){
		return chanceOfSnow;
	}

	public void setPressureMb(int pressureMb){
		this.pressureMb = pressureMb;
	}

	public int getPressureMb(){
		return pressureMb;
	}

	public void setVisMiles(int visMiles){
		this.visMiles = visMiles;
	}

	public int getVisMiles(){
		return visMiles;
	}

	@Override
 	public String toString(){
		return 
			"HourItem{" + 
			"feelslike_c = '" + feelslikeC + '\'' + 
			",feelslike_f = '" + feelslikeF + '\'' + 
			",wind_degree = '" + windDegree + '\'' + 
			",windchill_f = '" + windchillF + '\'' + 
			",windchill_c = '" + windchillC + '\'' + 
			",temp_c = '" + tempC + '\'' + 
			",temp_f = '" + tempF + '\'' + 
			",cloud = '" + cloud + '\'' + 
			",wind_kph = '" + windKph + '\'' + 
			",wind_mph = '" + windMph + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",dewpoint_f = '" + dewpointF + '\'' + 
			",will_it_rain = '" + willItRain + '\'' + 
			",uv = '" + uv + '\'' + 
			",heatindex_f = '" + heatindexF + '\'' + 
			",dewpoint_c = '" + dewpointC + '\'' + 
			",is_day = '" + isDay + '\'' + 
			",precip_in = '" + precipIn + '\'' + 
			",heatindex_c = '" + heatindexC + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",gust_mph = '" + gustMph + '\'' + 
			",pressure_in = '" + pressureIn + '\'' + 
			",chance_of_rain = '" + chanceOfRain + '\'' + 
			",gust_kph = '" + gustKph + '\'' + 
			",precip_mm = '" + precipMm + '\'' + 
			",condition = '" + condition + '\'' + 
			",will_it_snow = '" + willItSnow + '\'' + 
			",vis_km = '" + visKm + '\'' + 
			",time_epoch = '" + timeEpoch + '\'' + 
			",time = '" + time + '\'' + 
			",chance_of_snow = '" + chanceOfSnow + '\'' + 
			",pressure_mb = '" + pressureMb + '\'' + 
			",vis_miles = '" + visMiles + '\'' + 
			"}";
		}
}