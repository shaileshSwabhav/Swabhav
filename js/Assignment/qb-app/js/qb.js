let userName;
let questionNumber = 0;
let interval;

const mainDiv = document.createElement('div');
mainDiv.setAttribute('class', ' container-fluid mainDiv');

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
        option4: 'None',
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

let userEnterdAnswers = {};
const correctAnswers = {
                        question1: 'James Gosling',
                        question2: 'Use of pointers',
                        question3: 'Security',
                        question4: 'Member Function',
                        question5: 'int'
                    };


document.getElementById('startBtn').addEventListener('click', function() {
    console.log("Test Started");
    if(userTextBox.value == "") {
        alert("Please Enter your name.");
    } else {
        removeUserDetails();

        const time = document.createElement('h4');
        time.setAttribute('id', 'welcomeTag');
        mainDiv.appendChild(time);

        var fiveMinutes = 60 * 1 - 1,
            display = document.getElementById('welcomeTag');
        startTimer(fiveMinutes, display);

        createQuestions();
    }
});

function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    interval = setInterval(function () {
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = `${userName.toUpperCase()} time left for your test - ` + minutes + ":" + seconds;

        if (--timer < 0) {
            document.getElementById('welcomeTag').remove();
            document.getElementById('question').remove();
            document.getElementById('answers').remove();
            document.getElementById('answerButtons').remove();

            drawChart();

        }
    }, 1000);

}

