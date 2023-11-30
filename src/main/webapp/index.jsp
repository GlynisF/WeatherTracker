<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WeatherTracker App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2>WeatherTracker App</h2>

    <form id="cityForm" method="GET" action="http://localhost:8080/WeatherTracker_war/services/weather">
        <label for="city">City Name:</label>
        <input type="text" id="city" name="city" required>
        <button type="button" onclick="submitForm()">Get Weather</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
<script src="js/submitRedirect.js" type="text/javascript"></script>
</body>
</html>