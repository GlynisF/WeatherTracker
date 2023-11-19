package com.weathertracker.controller;

import com.weathertracker.weatherstack.Current;
import com.weathertracker.weatherstack.Location;
import com.weathertracker.weatherstack.Weather;
import javafx.stage.Stage;

/**
 * The interface Weather tracker.
 */
public interface WeatherTracker {
    /**
     * Start.
     *
     * @param primaryStage the primary stage
     */
    void start(Stage primaryStage);

    /**
     * Format weather info string.
     *
     * @param weather the weather
     * @return the string
     */
    default String formatWeatherInfo(Weather weather) {
        Current current = weather.getCurrent();
        Location location = weather.getLocation();

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Temperature: ").append(current.getTemperature()).append("°F\n");
        stringBuilder.append("Feels like: ").append(current.getFeelslike()).append("°F\n");
        stringBuilder.append("Description: ").append(current.getWeatherDescriptions().get(0)).append("\n");
        stringBuilder.append("Humidity: ").append(current.getHumidity()).append(" %\n");
        stringBuilder.append("Atmospheric Pressure: ").append(current.getPressure()).append(" hPa\n");
        stringBuilder.append("Wind speed: ").append(current.getWindSpeed()).append(" mph\n");

        stringBuilder.append("Location: ").append(location.getName()).append("\n");
        stringBuilder.append("Country: ").append(location.getCountry()).append("\n");
        stringBuilder.append("Region: ").append(location.getRegion()).append("\n");
        stringBuilder.append("Local Time: ").append(location.getLocaltime()).append("\n");

        return stringBuilder.toString();
    }
}