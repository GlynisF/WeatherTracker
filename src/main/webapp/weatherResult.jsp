<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>WeatherTracker App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/weatherResults.css">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<h2 id="weatherH2">Weather in </h2>

<a href="index.jsp">
    <img src="images/home.png" alt="Link Image" style="width: 50px; height: 50px;">
</a>

<div id="weather-data">
    <span class="data-label">Location: </span>
    <p id="city" name="city"></p>
    <p id="region" ></p>
    <p id="country"></p>
    <p id="localTime"></p>
    <p id="temperature"></p>
    <p id="feelsLike"></p>
    <p id="description"></p>
    <p id="humidity"></p>
    <p id="windSpeed"></p>
    <p id="pressure"></p>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
<script src="js/weatherdata.js" type="text/javascript"></script>
</body>
</html>