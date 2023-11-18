package com.weathertracker.persistence;

import com.weathertracker.weatherstack.Weather;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeatherDaoTest {

    @Test
    void testGetResponse() {
        WeatherDao weatherDao = new WeatherDao();

        try {
            String city = "London";
            Weather weather = weatherDao.getResponse(city);

            // to ensure that the response is not null
            assertNotNull(weather);

            assertNotNull(weather.getRequest());
            assertNotNull(weather.getRequest().getUnit());
            assertNotNull(weather.getRequest().getQuery());
            assertNotNull(weather.getRequest().getLanguage());

            assertNotNull(weather.getCurrent());
            assertNotNull(weather.getCurrent().getTemperature());
            assertNotNull(weather.getCurrent().getWeatherDescriptions());

            assertNotNull(weather.getLocation());
            assertNotNull(weather.getLocation().getLocaltime());
            assertNotNull(weather.getLocation().getUtcOffset());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
