package com.weathertracker.persistence;

import com.weathertracker.weatherapi.Forecast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDaoTest {

    @Test
    void getResponse() {
        Forecast forecast = new Forecast();

        System.out.println(forecast.getForecast());
    }
}