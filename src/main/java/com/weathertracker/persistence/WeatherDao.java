package com.weathertracker.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.util.PropertiesLoader;
import com.weathertracker.weatherstack.Location;
import com.weathertracker.weatherstack.Weather;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * The type Weather dao.
 */
public class WeatherDao implements PropertiesLoader {

    private final Properties properties;
    private final Logger logger = (Logger) LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Weather dao.
     */
    public WeatherDao() {
        properties = new Properties(loadProperties("/weatherstackApi.properties"));
    }


    /**
     * Gets response.
     *
     * @param city the city for which weather information is requested
     * @return the response
     * @throws IOException the io exception
     */
    public Weather getResponse(String city) throws IOException {
        String apiKey = properties.getProperty("api.key");
        Client client = ClientBuilder.newClient();
        // city parameter for the API request
        WebTarget target = client.target("http://api.weatherstack.com/current")
                .queryParam("access_key", apiKey)
                .queryParam("query", city)
                .queryParam("units", "f");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();

        Weather weather = null;

        try {
            // to handle unrecognized property exception
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

            weather = mapper.readValue(response, Weather.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            logger.debug(e);
        }
        return weather;
    }


}