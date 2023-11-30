function submitForm() {
    const cityName = document.getElementById('city').value;

    // Make an AJAX request to your RESTful API
    fetch('http://localhost:8080/WeatherTracker_war/services/weather?city=' + cityName)
        .then(response => response.json())
        .then(data => {
            // Redirect to another page and pass the data as a query parameter
            window.location.href = 'weatherResult.jsp?data=' + encodeURIComponent(JSON.stringify(data));
        })
        .catch(error => console.error('Error:', error));
}