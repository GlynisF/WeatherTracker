package com.weathertracker.persistence;

import com.weathertracker.weatherapi.Weather;

public interface WeatherInfoDAO {
    Weather getWeatherInfo(String city);
}
