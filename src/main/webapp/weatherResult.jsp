<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>WeatherTracker App</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/weatherResults.css">
</head>
<body>
<h2>Weather in </h2>

<a href="http://localhost:8080">
    <img src="/resources/images/home.png" alt="Link Image" style="width: 50px; height: 50px;">
</a>

<div id="weather-data">
    <p>${location.name}: </p>
    <p>Temperature: ${current.temperature}°F</p>
    <p>Feels like: ${current.feelslike}°F</p>
    <p>Description: ${current.weatherDescriptions[0]}</p>
    <p>Humidity: ${current.humidity}%</p>
    <p>Atmospheric Pressure: ${current.pressure} hPa</p>
    <p>Wind speed: ${current.windSpeed} mph</p>

    <p>Country: ${location.country}</p>
    <p>Region: ${location.region}</p>
    <p>Local Time: ${location.localtime}</p>
</div>
</body>
</html>
