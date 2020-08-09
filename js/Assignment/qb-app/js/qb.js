let userName;
let questionNumber = 0;

const mainDiv = document.createElement('div');
mainDiv.setAttribute('class', 'mainDiv');

const mcqQuestions = [{
        question: "Question 1. Who is creator of Java Language?",
        option1: "James Gosling",
        option2: "Guido van Rossum",
        option3: "Brendan Eich",
        option4: "None Of the Above"
    },
    {
        question: 'Question 2. Which of the following is NOT a Java features?',
        option1: 'Dynamic',
        option2: 'Use of pointers',
        option3: 'OOP',
    },
    {
        question: "Question 3. Which of these is NOT a pillar of OOP?",
        option1: "Encapsulation",
        option2: "Inheritance",
        option3: "Polymorphism",
        option4: "Security"
    }, 
    {
        question: "Question 4. Which of these is property of a Class?",
        option1: "State",
        option2: "Behaviour",
        option3: "Member Function",
        option4: "None of the above"
    },
    {
        question: 'Question 5. What is the return type of the hashCode() method in the Object class?',
        option1: 'Object',
        option2: 'int',
        option3: 'long',
        option4: 'double',
    }

    ];

const userEnterdAnswers = {};
const correctAnswers = {
                        question1: 'James Gosling',
                        question2: 'Use of pointers',
                        question3: 'Security',
                        question4: 'Member Function',
                        question5: 'int'
                    };

function removeUserDetails() {
    const containerDiv = document.getElementById('container');
    const userlbl = document.getElementById('userLabel');  
    const userTxtBox = document.getElementById('userTextBox');
    const startBtn = document.getElementById('startBtn');

    userName = userTxtBox.value
    containerDiv.remove();
    userlbl.remove();
    userTxtBox.remove();
    startBtn.remove();

    document.body.appendChild(mainDiv);

}

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

document.getElementById('startBtn').addEventListener('click', function() {
    console.log("Test Started");
    if(userTextBox.value == "") {
        alert("Please Enter your name.");
    } else {
        removeUserDetails();
        const welcomeTag = document.createElement('h4');
        welcomeTag.setAttribute('class', 'welcomeTag');
        welcomeTag.setAttribute('id', 'welcomeTag');
        welcomeTag.innerHTML = "Welcome to the test " + userName;
    
        mainDiv.appendChild(welcomeTag);
    
        createQuestions();
    }
});

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

    result.innerHTML = `Your test result is ${rightAnswers} out of ${Object.keys(correctAnswers).length}`;

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