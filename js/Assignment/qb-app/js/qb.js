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
