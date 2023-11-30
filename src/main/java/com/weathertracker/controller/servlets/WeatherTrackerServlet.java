package com.weathertracker.controller.servlets;

import com.weathertracker.controller.WeatherTracker;
import com.weathertracker.persistence.WeatherDao;
import com.weathertracker.weatherstack.Weather;
import javafx.stage.Stage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/weather-form")
public class WeatherTrackerServlet extends HttpServlet implements WeatherTracker {

    private WeatherDao weatherDao;

    @Override
    public void init() {
        this.weatherDao = new WeatherDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // city name from the request parameter
            String city = req.getParameter("city");

            // Call the method with the city name
            Weather weather = weatherDao.getResponse(city);

            // Setting attributes to pass data to JSP files
            req.setAttribute("current", weather.getCurrent());
            req.setAttribute("location", weather.getLocation());

            // Forward to JSP to display
            RequestDispatcher dispatcher = req.getRequestDispatcher("/weatherResult.jsp");
            dispatcher.forward(req, resp);
        } catch (IOException e) {
            resp.getWriter().write("Failed to retrieve weather information.");
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) {

    }
}