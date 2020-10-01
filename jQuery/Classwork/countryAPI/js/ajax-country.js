$(document).ready(function() {
    const COUNTRYINDEX = 0;

    $('#btn').on('click', function() {
        let name = $('#userInput').val();

        if(name != null) {
            
            let url = `https://restcountries.eu/rest/v2/name/${name}?fullText=true`;

            $.ajax({
                method: 'get',
                url: url,
                dataType: "json",
                success: function(countryDetails) {
                    displayCountryDetails(countryDetails);
                },
                error: function(er) {
                    console.log(er);
                }
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
        $('.results').append(`<p>Country Flag:</p><img width="25%" height="25%" src=${countryFlag}></img>`);     }
});