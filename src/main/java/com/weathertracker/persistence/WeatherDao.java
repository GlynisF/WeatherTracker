package com.weathertracker.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.util.PropertiesLoader;
import com.weathertracker.weatherstack.Current;
import com.weathertracker.weatherstack.Request;
import com.weathertracker.weatherstack.Weather;
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
    private Request request;
    private final Logger logger = (Logger) LogManager.getLogger(this.getClass());


    /**
     * Instantiates a new Weather dao.
     */
    public WeatherDao() {
        properties = new Properties(loadProperties("/weatherapi.properties"));
    }

    /**
     * Gets response.
     *
     * @return the response
     * @throws IOException the io exception
     */
    Weather getResponse() throws IOException {
        String api = properties.getProperty("api.key.name");
        String apiKey = properties.getProperty("api.key");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://api.weatherstack.com/current?access_key=ea9292c054afbaf59487a08387645b47&query=Madison&units=f");
        String response = (target.request(MediaType.APPLICATION_JSON).get(String.class));
        ObjectMapper mapper = new ObjectMapper();

        //Forecast forecast = null;

        Weather weather= null;


        try {
            mapper.disable(DeserializationFeature
                    .FAIL_ON_UNKNOWN_PROPERTIES);
            weather = mapper.readValue(response, Weather.class);


        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            logger.debug(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return weather;
    }
}