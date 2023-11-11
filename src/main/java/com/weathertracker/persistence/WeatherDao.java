package com.weathertracker.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.util.PropertiesLoader;
import com.weathertracker.weatherapi.Day;
import com.weathertracker.weatherapi.Forecast;
import com.weathertracker.weatherapi.Location;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Properties;


/**
 * The type Weather dao.
 */
public class WeatherDao implements PropertiesLoader {

    private Properties properties;
    private final Logger logger = (Logger) LogManager.getLogger(this.getClass());


    /**
     * Instantiates a new Weather dao.
     */
    public WeatherDao() {
        properties = new Properties(loadProperties("/weatherapi.properties"));
        System.out.println("hello");

    }

    /**
     * Gets response.
     *
     * @return the response
     * @throws IOException the io exception
     */
    Location getResponse() throws IOException {
        String api = properties.getProperty("api.key.name");
        String apiKey = properties.getProperty("api.key");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.weatherapi.com/v1/forecast.json?&q=Madison");
        String response = target.request(MediaType.APPLICATION_JSON).header(api, apiKey).get(String.class);
        ObjectMapper mapper = new ObjectMapper();

        //Forecast forecast = null;
        Location location = new Location();

        System.out.println(location);
        try {
             location = mapper.readValue(response, Location.class); pull
        } catch (JsonProcessingException e) {
            logger.debug(e);
        }
        return location;
    }
};