package com.weathertracker.persistence;

import com.weathertracker.weatherstack.Weather;

public interface WeatherInfoDAO {
    Weather getWeatherInfo(String city);
}
