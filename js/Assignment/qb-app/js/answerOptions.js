function showOptions() {

    const answersDiv = document.createElement('div');
    answersDiv.setAttribute('id', 'answers');
    
    const radioOption1 = document.createElement('input');
    const radioOption2 = document.createElement('input');
    const radioOption3 = document.createElement('input');
    const radioOption4 = document.createElement('input');

    const answerLabel1 = document.createElement('label');
    const answerLabel2 = document.createElement('label');
    const answerLabel3 = document.createElement('label');
    const answerLabel4 = document.createElement('label');

    const availableAnswers = [answerLabel1, answerLabel2, answerLabel3, answerLabel4];
    const radioButtons = [radioOption1, radioOption2, radioOption3, radioOption4];

    mainDiv.append(answersDiv);

    let i = 0;
    for(ans in mcqQuestions[questionNumber]) {
        
        if (!mcqQuestions[questionNumber][ans].includes('Question')) {

            Object.assign(radioButtons[i], {
                type: 'radio', 
                name: 'userAnswer',
                value: mcqQuestions[questionNumber][ans],
                id: ans,
            });

            if(userEnterdAnswers.hasOwnProperty('question' + (questionNumber + 1))){
                if(radioButtons[i].value == userEnterdAnswers['question' + (questionNumber + 1)])
                    radioButtons[i].checked = true;
            }

            availableAnswers[i].setAttribute('for', ans);
            availableAnswers[i].setAttribute('class', 'answerLabels');
            availableAnswers[i].innerHTML = mcqQuestions[questionNumber][ans];

            answersDiv.appendChild(radioButtons[i]);
            answersDiv.appendChild(availableAnswers[i]);
            answersDiv.appendChild(document.createElement('br'));

            i++;
        }
        answersDiv.appendChild(document.createElement('br'));

    }

    submitOptions();

}
