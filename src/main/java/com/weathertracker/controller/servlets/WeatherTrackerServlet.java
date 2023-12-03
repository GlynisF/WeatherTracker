package com.weathertracker.controller.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weathertracker.persistence.WeatherDao;
import com.weathertracker.weatherstack.Weather;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/weather")
public class WeatherTrackerServlet extends HttpServlet {

    private final org.apache.logging.log4j.core.Logger logger = (Logger) LogManager.getLogger(this.getClass());
    private WeatherDao weatherDao;

    @Override
    public void init() {
        this.weatherDao = new WeatherDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String city;

            if (req.getParameter("city") != null) {
                // to handle requests with the 'city' parameter
                city = req.getParameter("city");
            } else if (req.getPathInfo() != null) {
                // handle requests with the path parameter
                String[] pathParts = req.getPathInfo().split("/");
                if (pathParts.length > 1) {
                    city = pathParts[1];
                } else {
                    // if there is invalid URL format
                    resp.getWriter().write("Invalid URL format. Please provide a city name.");
                    resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    return;
                }
            } else {
                // if there is invalid URL format
                resp.getWriter().write("Invalid URL format. Please provide a city name.");
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                return;
            }

            Weather weather = weatherDao.getResponse(city);

            // here we convert the Weather object to JSON
            ObjectMapper mapper = new ObjectMapper();
            String weatherJson = mapper.writeValueAsString(weather);

            //  writes JSON
            resp.setContentType("application/json");
            resp.getWriter().write(weatherJson);
        } catch (IOException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // to reead the JSON
            ObjectMapper mapper = new ObjectMapper();
            Weather newWeather = mapper.readValue(req.getReader(), Weather.class);

            logger.info("Received new weather information: {}", newWeather);

            // Send a success response
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (IOException e) {
            // to andle invalid JSON
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            e.printStackTrace();
        }
    }


    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // maybe we could create  database to store information about the
        // weather and ind this case we can implement this method to delete it
    }

}

// old method for  sending it to jsp

//package com.weathertracker.controller.servlets;
//
//import com.weathertracker.controller.WeatherTracker;
//import com.weathertracker.persistence.WeatherDao;
//import com.weathertracker.weatherstack.Weather;
//import javafx.stage.Stage;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/weather")
//public class WeatherTrackerServlet extends HttpServlet implements WeatherTracker {
//
//    private WeatherDao weatherDao;
//
//    @Override
//    public void init() {
//        this.weatherDao = new WeatherDao();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try {
//            // city name from the request parameter
//            String city = req.getParameter("city");
//
//            // Call the method with the city name
//            Weather weather = weatherDao.getResponse(city);
//
//            // Setting attributes to pass data to JSP files
//            req.setAttribute("current", weather.getCurrent());
//            req.setAttribute("location", weather.getLocation());
//
//            // Forward to JSP to display
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/weatherResult.jsp");
//            dispatcher.forward(req, resp);
//        } catch (IOException e) {
//            resp.getWriter().write("Failed to retrieve weather information.");
//            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//
//    }
//}
