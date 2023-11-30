package com.weathertracker.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.persistence.WeatherDao;
import com.weathertracker.util.PropertiesLoader;
import com.weathertracker.weatherstack.Current;
import com.weathertracker.weatherstack.Location;
import com.weathertracker.weatherstack.Weather;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * The type Weather resource.
 */
@Path("/weather")
public class WeatherResource implements PropertiesLoader {

    private final WeatherDao dao = new WeatherDao();

    /**
     * Gets weather details.
     *
     * @param city the city
     * @return the weather details
     * @throws IOException the io exception
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Weather getWeatherDetails(String city) throws IOException {
        Weather weather = dao.getResponse(city);
        return weather;
    }

    /**
     * Gets weather.
     *
     * @param city the city
     * @return the weather
     * @throws IOException the io exception
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWeather(@QueryParam("city") String city) throws IOException {
        Weather weather = getWeatherDetails(city);
        Location location = weather.getLocation();
        Current current = weather.getCurrent();
        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("locationName", weather.getLocation().getName());
        jsonData.put("location", location.getName());
        jsonData.put("temperature", current.getTemperature());
        jsonData.put("feelsLike", current.getFeelslike());
        jsonData.put("description", current.getWeatherDescriptions().get(0));
        jsonData.put("humidity", current.getHumidity());
        jsonData.put("pressure", current.getPressure());
        jsonData.put("windSpeed", current.getWindSpeed());
        jsonData.put("country", location.getCountry());
        jsonData.put("region", location.getRegion());
        jsonData.put("localTime", location.getLocaltime());

        // Convert the Map to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return Response.ok(objectMapper.writeValueAsString(jsonData), MediaType.APPLICATION_JSON).build();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }


}