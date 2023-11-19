package com.weathertracker.controller;

import com.weathertracker.persistence.WeatherDao;
import com.weathertracker.weatherstack.Weather;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Weather tracker app.
 */
public class WeatherTrackerApp extends Application implements WeatherTracker {

    private final WeatherDao weatherDao;

    /**
     * Instantiates a new Weather tracker app.
     */
    public WeatherTrackerApp() {
        this.weatherDao = new WeatherDao();
    }

    /**
     * prompts user for input. user must enter a city name.
     * @param primaryStage the main stage for the application
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("WeatherTracker App");

        String cityName = getUserInputCityName();

        Label weatherLabel = new Label();

        try {
            Weather weather = weatherDao.getResponse(cityName);
            String weatherInfo = formatWeatherInfo(weather);
            weatherLabel.setText(weatherInfo);
        } catch (IOException e) {
            weatherLabel.setText("Failed to retrieve weather information.");
            e.printStackTrace();
        }

        VBox vbox = new VBox(weatherLabel);
        Scene scene = new Scene(vbox, 150, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
    * format output for weather info details
     * @param weather the Weather object type
    */
    @Override
    public String formatWeatherInfo(Weather weather) {
        return "Temperature: " + weather.getCurrent().getTemperature() + "°C\n"
                + "Description: " + weather.getCurrent().getWeatherDescriptions().get(0);
    }
    /**
     * sets details for the city name
     * @return the name of the city
     */
    private String getUserInputCityName() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("City Input");
        dialog.setHeaderText("Enter the city name:");
        dialog.setContentText("City:");

        // gets the response value.
        java.util.Optional<String> result = dialog.showAndWait();
        return result.orElse("Madison");  // it returns "Madison by default
        // if the user forgot to type the name of city"
    }
}