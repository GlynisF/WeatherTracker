package com.weathertracker.persistence;

import com.weathertracker.weatherapi.Forecast;
import com.weathertracker.weatherapi.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDaoTest {

    @Test
    void getResponse() {
        Forecast forecast = new Forecast();
        Location location = new Location();

        System.out.println(forecast.getForecast());
    }
}