package com.weathertracker.controller;


import com.weathertracker.util.PropertiesLoader;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Weather app.
 */
@ApplicationPath("/services")
@Produces("application/xml")
public class WeatherApp extends Application implements PropertiesLoader {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet set = new HashSet<Class<?>>();
            set.add(WeatherResource.class);

        return set;
    }
}