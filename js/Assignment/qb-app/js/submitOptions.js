function submitOptions() {
    const buttonsDiv = document.createElement('div');
    buttonsDiv.setAttribute('id', 'answerButtons');
    mainDiv.appendChild(buttonsDiv);
    
    const nextBtn = document.createElement('button');
    nextBtn.setAttribute('id', 'nextButton');
    nextBtn.innerHTML = "Next Question";

    const prevBtn = document.createElement('button');
    prevBtn.setAttribute('id', 'prevButton');
    prevBtn.innerHTML = "Previous Question";

    const submitTest = document.createElement('button');
    submitTest.setAttribute('id', 'submitTest');
    submitTest.innerHTML = "Submit Test";

    if (questionNumber > 0){
        buttonsDiv.appendChild(prevBtn);
    
        prevBtn.addEventListener('click', function(e) {
            document.getElementById('question').remove();
            document.getElementById('answers').remove();
            document.getElementById('answerButtons').remove();
            questionNumber--;
            createQuestions();
        });
    }
    
    if (questionNumber != (mcqQuestions.length - 1)) {

        buttonsDiv.appendChild(nextBtn);  
        nextBtn.addEventListener('click', function() {

            const finalAnswer = document.querySelectorAll('input[name="userAnswer"]');
            for (const ans of finalAnswer) {
                if (ans.checked) {
                    selectedValue = ans.value;
                    userEnterdAnswers['question' + (questionNumber + 1)] = ans.value;
                    break;
                }
            }

            document.getElementById('question').remove();
            document.getElementById('answers').remove();
            document.getElementById('answerButtons').remove();
            questionNumber++;
            createQuestions();
        });

    } else {
        buttonsDiv.appendChild(submitTest);
        submitTest.addEventListener('click', function() {

            const finalAnswer = document.querySelectorAll('input[name="userAnswer"]');
            let selectedValue;
            for (const ans of finalAnswer) {
                if (ans.checked) {
                    selectedValue = ans.value;
                    userEnterdAnswers['question' + (questionNumber + 1)] = ans.value;
                    break;
                }
            }
            document.getElementById('welcomeTag').remove();
            document.getElementById('question').remove();
            document.getElementById('answers').remove();
            document.getElementById('answerButtons').remove();

            drawChart();
        });

    }
}
