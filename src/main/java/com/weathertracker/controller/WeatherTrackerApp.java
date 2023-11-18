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

public class WeatherTrackerApp extends Application implements WeatherTracker {

    private final WeatherDao weatherDao;

    public WeatherTrackerApp() {
        this.weatherDao = new WeatherDao();
    }

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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public String formatWeatherInfo(Weather weather) {
        return "Temperature: " + weather.getCurrent().getTemperature() + "°C\n"
                + "Description: " + weather.getCurrent().getWeatherDescriptions().get(0);
    }

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
