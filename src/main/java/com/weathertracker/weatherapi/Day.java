package com.weathertracker.weatherapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day{

	@JsonProperty("avgvis_km")
	private int avgvisKm;

	@JsonProperty("uv")
	private int uv;

	@JsonProperty("avgtemp_f")
	private Object avgtempF;

	@JsonProperty("avgtemp_c")
	private Object avgtempC;

	@JsonProperty("daily_chance_of_snow")
	private int dailyChanceOfSnow;

	@JsonProperty("maxtemp_c")
	private Object maxtempC;

	@JsonProperty("maxtemp_f")
	private Object maxtempF;

	@JsonProperty("mintemp_c")
	private Object mintempC;

	@JsonProperty("avgvis_miles")
	private int avgvisMiles;

	@JsonProperty("daily_will_it_rain")
	private int dailyWillItRain;

	@JsonProperty("mintemp_f")
	private int mintempF;

	@JsonProperty("totalprecip_in")
	private int totalprecipIn;

	@JsonProperty("totalsnow_cm")
	private int totalsnowCm;

	@JsonProperty("avghumidity")
	private int avghumidity;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("maxwind_kph")
	private Object maxwindKph;

	@JsonProperty("maxwind_mph")
	private Object maxwindMph;

	@JsonProperty("daily_chance_of_rain")
	private int dailyChanceOfRain;

	@JsonProperty("totalprecip_mm")
	private int totalprecipMm;

	@JsonProperty("daily_will_it_snow")
	private int dailyWillItSnow;

	public void setAvgvisKm(int avgvisKm){
		this.avgvisKm = avgvisKm;
	}

	public int getAvgvisKm(){
		return avgvisKm;
	}

	public void setUv(int uv){
		this.uv = uv;
	}

	public int getUv(){
		return uv;
	}

	public void setAvgtempF(Object avgtempF){
		this.avgtempF = avgtempF;
	}

	public Object getAvgtempF(){
		return avgtempF;
	}

	public void setAvgtempC(Object avgtempC){
		this.avgtempC = avgtempC;
	}

	public Object getAvgtempC(){
		return avgtempC;
	}

	public void setDailyChanceOfSnow(int dailyChanceOfSnow){
		this.dailyChanceOfSnow = dailyChanceOfSnow;
	}

	public int getDailyChanceOfSnow(){
		return dailyChanceOfSnow;
	}

	public void setMaxtempC(Object maxtempC){
		this.maxtempC = maxtempC;
	}

	public Object getMaxtempC(){
		return maxtempC;
	}

	public void setMaxtempF(Object maxtempF){
		this.maxtempF = maxtempF;
	}

	public Object getMaxtempF(){
		return maxtempF;
	}

	public void setMintempC(Object mintempC){
		this.mintempC = mintempC;
	}

	public Object getMintempC(){
		return mintempC;
	}

	public void setAvgvisMiles(int avgvisMiles){
		this.avgvisMiles = avgvisMiles;
	}

	public int getAvgvisMiles(){
		return avgvisMiles;
	}

	public void setDailyWillItRain(int dailyWillItRain){
		this.dailyWillItRain = dailyWillItRain;
	}

	public int getDailyWillItRain(){
		return dailyWillItRain;
	}

	public void setMintempF(int mintempF){
		this.mintempF = mintempF;
	}

	public int getMintempF(){
		return mintempF;
	}

	public void setTotalprecipIn(int totalprecipIn){
		this.totalprecipIn = totalprecipIn;
	}

	public int getTotalprecipIn(){
		return totalprecipIn;
	}

	public void setTotalsnowCm(int totalsnowCm){
		this.totalsnowCm = totalsnowCm;
	}

	public int getTotalsnowCm(){
		return totalsnowCm;
	}

	public void setAvghumidity(int avghumidity){
		this.avghumidity = avghumidity;
	}

	public int getAvghumidity(){
		return avghumidity;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}

	public Condition getCondition(){
		return condition;
	}

	public void setMaxwindKph(Object maxwindKph){
		this.maxwindKph = maxwindKph;
	}

	public Object getMaxwindKph(){
		return maxwindKph;
	}

	public void setMaxwindMph(Object maxwindMph){
		this.maxwindMph = maxwindMph;
	}

	public Object getMaxwindMph(){
		return maxwindMph;
	}

	public void setDailyChanceOfRain(int dailyChanceOfRain){
		this.dailyChanceOfRain = dailyChanceOfRain;
	}

	public int getDailyChanceOfRain(){
		return dailyChanceOfRain;
	}

	public void setTotalprecipMm(int totalprecipMm){
		this.totalprecipMm = totalprecipMm;
	}

	public int getTotalprecipMm(){
		return totalprecipMm;
	}

	public void setDailyWillItSnow(int dailyWillItSnow){
		this.dailyWillItSnow = dailyWillItSnow;
	}

	public int getDailyWillItSnow(){
		return dailyWillItSnow;
	}

	@Override
 	public String toString(){
		return 
			"Day{" + 
			"avgvis_km = '" + avgvisKm + '\'' + 
			",uv = '" + uv + '\'' + 
			",avgtemp_f = '" + avgtempF + '\'' + 
			",avgtemp_c = '" + avgtempC + '\'' + 
			",daily_chance_of_snow = '" + dailyChanceOfSnow + '\'' + 
			",maxtemp_c = '" + maxtempC + '\'' + 
			",maxtemp_f = '" + maxtempF + '\'' + 
			",mintemp_c = '" + mintempC + '\'' + 
			",avgvis_miles = '" + avgvisMiles + '\'' + 
			",daily_will_it_rain = '" + dailyWillItRain + '\'' + 
			",mintemp_f = '" + mintempF + '\'' + 
			",totalprecip_in = '" + totalprecipIn + '\'' + 
			",totalsnow_cm = '" + totalsnowCm + '\'' + 
			",avghumidity = '" + avghumidity + '\'' + 
			",condition = '" + condition + '\'' + 
			",maxwind_kph = '" + maxwindKph + '\'' + 
			",maxwind_mph = '" + maxwindMph + '\'' + 
			",daily_chance_of_rain = '" + dailyChanceOfRain + '\'' + 
			",totalprecip_mm = '" + totalprecipMm + '\'' + 
			",daily_will_it_snow = '" + dailyWillItSnow + '\'' + 
			"}";
		}
}