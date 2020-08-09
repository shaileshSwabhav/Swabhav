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
            ['questions', 'Result'],
            ['Right Answers', rightAnswers],
            ['Wrong Answers', wrongAnswers],
            ['Not Answered', answersLeft]
        ]);
        
        var options = {'title':`Result Piechart`, 'width':550, 'height':400};
    
        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(charData, options);

        mainDiv.appendChild(result);

    }
}