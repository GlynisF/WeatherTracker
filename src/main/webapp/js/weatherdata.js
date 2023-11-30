// Retrieve the data from the query parameter
const queryString = window.location.search;
const urlParams = new URLSearchParams(queryString);
const jsonData = urlParams.get('data');

if (jsonData) {
    // Parse the JSON data and display it (adjust this based on your data structure)
    const data = JSON.parse(decodeURIComponent(jsonData));
    console.log('Weather data:', data);
    document.getElementById("city").innerHTML = "Location: " + data.location;
    document.getElementById("region").innerHTML = "Region: " + data.region;
    document.getElementById("country").innerHTML = "Country: " + data.country;
    document.getElementById("localTime").innerHTML = "Local Date & Time : " + data.localTime;
    document.getElementById("temperature").innerHTML = "Temperature: " + data.temperature + "°F";
    document.getElementById("feelsLike").innerHTML = "Feels like: " + data.feelsLike + "°F";
    document.getElementById("description").innerHTML = "Description: " + data.description;
    document.getElementById("humidity").innerHTML = "Humidity: " + data.humidity + "%";
    document.getElementById("windSpeed").innerHTML = "Wind Speed: " + data.windSpeed;
    document.getElementById("pressure").innerHTML = "Atmospheric Pressure : " + data.pressure + " hPa";
    document.getElementById("weatherH2").innerHTML += data.location;

} else {
    console.error('No data received.');
}