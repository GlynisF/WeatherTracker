package com.weathertracker.persistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.weathertracker.weatherstack.Location;
import com.weathertracker.weatherstack.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The type Weather dao test.
 */
public class WeatherDaoTest {
    private WeatherDao weatherDao;
    private Weather weather;

    @BeforeEach
    void weatherSetup() throws IOException {
        weatherDao = new WeatherDao();
    }

    /**
     * Test get response.
     */
    @Test
    void testGetResponse() {
        Weather weather = null;

        try {
            String city = "London";
            weather = weatherDao.getResponse(city);

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

    @Test
    void createLocationMap() {
        Location location = null;
        Map<String, Object> jsonMap = null;

        try {
            WeatherDao weatherDao = new WeatherDao();
            Weather weather = weatherDao.getResponse("Madison");
            location = weather.getLocation();

            // Serialize Location to JSON string
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(location);
            System.out.println("JSON String: " + jsonString);

            // Deserialize JSON string to Map
            TypeReference<Map<String, Object>> typeRef = new TypeReference<Map<String, Object>>() {};
            jsonMap = objectMapper.readValue(jsonString, typeRef);
            assertNotNull(jsonMap);

            assertTrue(jsonMap.containsKey("name"));
            assertTrue(jsonMap.containsKey("country"));
            // Add more assertions as per your needs
            System.out.println(jsonMap);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}