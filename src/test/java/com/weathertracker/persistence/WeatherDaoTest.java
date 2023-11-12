package com.weathertracker.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.weatherstack.Current;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

import static com.mysql.cj.conf.PropertyKey.logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherDaoTest {
WeatherDao dao;

    @Test
    void getResponse() throws IOException {

        Client client = ClientBuilder.newClient();
        WebTarget target =

                client.target("http://api.weatherstack.com/current?access_key=ea9292c054afbaf59487a08387645b47&query=Madison,wi&units=f");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        // how we specify what we want to map and to where
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.disable(DeserializationFeature
                    .FAIL_ON_UNKNOWN_PROPERTIES);
            dao = mapper.readValue(response, WeatherDao.class);
            assertEquals("???", dao.getResponse().getLocation());
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    }