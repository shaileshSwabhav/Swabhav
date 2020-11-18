$(document).ready(function() {
    let inputAndTimeArr = [];
    let localStorageIndex = 0;
    let arr = [];

    for(var key in localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            arr = localStorage.key(localStorageIndex).split(',');
            let time = arr[1];
            localStorageIndex++;

            let trivia = localStorage.getItem(key).split('.').join('');

            displayTrivia(trivia, time);
        }
    }

    $('#btn').on('click', function() {
        let inputValue = $('#userInput').val();
        const time = moment().format('MM D YYYY hh:mm:ss');

        if(inputValue != null) {
            inputAndTimeArr = [inputValue, time];
            url = `http://numbersapi.com/${inputValue}/trivia`;

            fetch(url)
            .then(function(response) {
                return response.text();
            })
            .then(function(trivia) {
                displayTrivia(trivia.split('.').join(''), time);
                localStorage.setItem(inputAndTimeArr, trivia);
            });

        } else {
            alert("Please enter a number to find it's trivia.");
        }

    });

    function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));

        return compare.humanize(true);
    }

    function displayTrivia(trivia, time) {
        const timeDiff = calculateTimeDifference(time);

        $('.results').append("<p class='trivia'>" + trivia + "<span> searched at " +
            time + " " + timeDiff + "</span></p>");
    }

});