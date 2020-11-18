$(document).ready(function() {
    const COUNTRYINDEX = 0;

    $('#btn').on('click', function() {
        let name = $('#userInput').val();

        if(name != null) {
            
            let url = `https://restcountries.eu/rest/v2/name/${name}?fullText=true`;

            fetch(url)
            .then(function(response) {
                return response.json();
            })
            .then(function(countryDetails) {
                displayCountryDetails(countryDetails);
            })
            .catch(function(er) {
                console.log(er);
            });

        } else {
            alert("Please enter a number to find it's trivia.");
        }
    });

    function displayCountryDetails(countryDetails) {
        console.log(countryDetails);

        let countryName = countryDetails[COUNTRYINDEX].name;
        let countryCapital = countryDetails[COUNTRYINDEX].capital;
        let countryFlag = countryDetails[COUNTRYINDEX].flag;

        $('.results').append(`<p>Country Name: ${countryName} </p>`);
        $('.results').append(`<p>Country Capital: ${countryCapital} </p>`);
        $('.results').append(`<p>Country Flag:</p><img width="20%" height="auto" src=${countryFlag}></img>`);    

    }
});