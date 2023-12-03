<%--index.jsp--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>WeatherTracker App</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class="container">
    <h2>WeatherTracker App</h2>

    <form action="weather" method="get">
        <label for="city">Enter city name:</label>
        <input type="text" id="city" name="city" required>
        <button type="submit">Search</button>
    </form>
</div>
</body>
</html>
