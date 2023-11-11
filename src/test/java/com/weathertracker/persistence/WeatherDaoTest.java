package com.weathertracker.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.weatherapi.Forecast;
import com.weathertracker.weatherapi.Location;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDaoTest {
    WeatherDao dao;

    @Test
    void getResponse() throws IOException {

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.weatherapi.com/v1/forecast.json?key=daea094fc2c042ec8b501117230711n&q=Madison");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        // how we specify what we want to map and to where
        ObjectMapper mapper = new ObjectMapper();
        dao = mapper.readValue(response, WeatherDao.class);
        assertEquals("Tatooine", dao.getResponse().getName());
    }

    }