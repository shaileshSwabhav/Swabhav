function drawChart() {
    let rightAnswers = 0;
    let wrongAnswers = 0;
    let answersLeft = Object.keys(correctAnswers).length - Object.keys(userEnterdAnswers).length;

    const piechartDiv = document.createElement('div');
    piechartDiv.setAttribute('id', 'piechart');
    mainDiv.appendChild(piechartDiv);

    const result = document.createElement('p');
    result.setAttribute('id', 'result');

    // calculating right and wrong answers
    for(ans in userEnterdAnswers) {
        if(correctAnswers[ans] == userEnterdAnswers[ans]) {
            rightAnswers++;
        } else {
            wrongAnswers++;
        }
    }

    result.innerHTML = `${userName} your test result is ${rightAnswers} out of ${Object.keys(correctAnswers).length}`;

    console.log(rightAnswers, wrongAnswers, answersLeft);

    // getting the piechart
    google.charts.load('current', {
        'packages': ['corechart']
    });
    google.charts.setOnLoadCallback(drawPieChart);

    function drawPieChart() {
        var charData = google.visualization.arrayToDataTable([
            ['Answers', 'Result'],
            ['Right Answers', rightAnswers],
            ['Wrong Answers', wrongAnswers],
            ['Not Answered', answersLeft]
        ]);
        
        var options = {'title':`Result Piechart`, 'width':550, 'height':400};
    
        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(charData, options);


        const playAgain = document.createElement('button');
        playAgain.innerHTML = "Play Again";
        playAgain.setAttribute('id', 'playAgain');

        mainDiv.appendChild(result);
        mainDiv.appendChild(playAgain);

        playAgain.addEventListener('click', function() {

            document.getElementById('piechart').remove();
            document.getElementById('result').remove();
            document.getElementById('playAgain').remove();
            

            const time = document.createElement('h4');
            time.setAttribute('id', 'welcomeTag');
            mainDiv.appendChild(time);
    
            var fiveMinutes = 60 * 1 - 1,
                display = document.getElementById('welcomeTag');
            startTimer(fiveMinutes, display);

            questionNumber = 0;
            createQuestions();
        });

    }
}