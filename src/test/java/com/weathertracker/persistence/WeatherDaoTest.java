package com.weathertracker.persistence;

import com.weathertracker.persistence.WeatherDao;
import com.weathertracker.weatherstack.Weather;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeatherDaoTest {

    @Test
    void testGetResponse() {
        WeatherDao weatherDao = new WeatherDao();

        try {
            Weather weather = weatherDao.getResponse();

            // Ensure that the response is not null
            assertNotNull(weather);

            // Check some specific values (you might need to adjust them based on the actual response)
            assertEquals("City", weather.getRequest().getType());
            assertEquals("Madison, United States of America", weather.getRequest().getQuery());
            assertEquals("en", weather.getRequest().getLanguage());
            assertEquals("f", weather.getRequest().getUnit());

            assertEquals("Madison", weather.getLocation().getName());
            assertEquals("United States of America", weather.getLocation().getCountry());
            assertEquals("Wisconsin", weather.getLocation().getRegion());
            assertEquals("43.073", weather.getLocation().getLat());
            assertEquals("-89.401", weather.getLocation().getLon());
            assertEquals("America/Chicago", weather.getLocation().getTimezoneId());

            // Add more assertions for other current weather properties
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}
