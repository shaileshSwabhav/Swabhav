function createQuestions() {

    const questionDiv = document.createElement('div');
    questionDiv.setAttribute('id', 'question');

    const questionPara = document.createElement('p');
    questionPara.setAttribute('class', 'questionPara');

    const br = document.createElement('br');
    questionPara.appendChild(br);

    mainDiv.appendChild(questionDiv);

    questionPara.innerHTML = mcqQuestions[questionNumber].question;
    questionDiv.appendChild(questionPara);

    showOptions();

}