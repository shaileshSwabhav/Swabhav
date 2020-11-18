// var generateRandomNumber = function() {
//     return (Math.floor(Math.random()  * 50) + 1);
// }

// let count = 0;
// let randomNumber = generateRandomNumber();
// let isWin = false;
// let span = document.getElementById("attemptsLeft");
// console.log(randomNumber);

// (function() {
//     for(let i = 1; i <= 50; i++){
//         var btn = document.createElement('button');
//         btn.setAttribute('id', 'btn');
//         btn.setAttribute('value', i)
//         btn.style.backgroundColor = '#AFADAD';
//         btn.innerHTML = i;
//         // document.body.appendChild(btn);
//         document.getElementById('btnBalls').appendChild(btn);
//     }

//     var para = document.createElement('p');
//     document.body.appendChild(para);

//     var displayResult = document.createElement('span');
//     displayResult.setAttribute('id', 'result');

//     para.appendChild(displayResult);

// })();

// for(let i = 0; i < btn.length; i++) {

//     btn[i].addEventListener('click', function(e) {

//         count++;
//         if (count == 4) {
//             changeButtonColor(e);
//             if (e.currentTarget.value != randomNumber) {
//                 analyzeResult();
//             }
//         } else if (count < 4) {
//             changeButtonColor(e);
//         }

//         if(count <= 1) {
//             document.getElementById('introRules').remove();
//         }

//         span.innerHTML = (4 - count);
        
//     })
// }

// function changeButtonColor(e) {

//     if (e.currentTarget.value == randomNumber){
//         e.currentTarget.style.backgroundColor = "#0074FF";
//         isWin = true;
//         analyzeResult();
//     }
//     else if (e.currentTarget.value < randomNumber) {
//         alert("Attempts Left: " + (4 - count));
//         e.currentTarget.style.backgroundColor = "#335d2d";

//     } else if (e.currentTarget.value > randomNumber) {
//         alert("Attempts Left: " + (4 - count));
//         e.currentTarget.style.backgroundColor = "#ff414d";

//     }
// }

// function analyzeResult() {

//     let result = document.getElementById('result');
//     let reloadBtn = document.createElement('button');

//     result.setAttribute('class', 'font-weight-bold');

//     reloadBtn.setAttribute('id', 'reload');
//     reloadBtn.setAttribute('onclick', 'reload()');
//     reloadBtn.innerHTML = 'Play Again!';

//     if(isWin) {
//         reloadBtn.setAttribute('class', 'btn btn-success');
//         result.innerHTML = "Congratulations!!! You have won the game.";
        
//     } else {
//         reloadBtn.setAttribute('class', 'btn btn-danger');
//         result.innerHTML = "Sorry... You have lost the game. Correct Guess was ball number: " + randomNumber;
//         btn[randomNumber - 1].style.backgroundColor = '#0074FF';

//     }
//     document.body.appendChild(reloadBtn);

//     reloadBtn.onclick = function () {
//         setTimeout(function() {
//             location.reload();
//         }, 100);
//     }
// }

var generateRandomNumber=function(){return Math.floor(50*Math.random())+1};let count=0,randomNumber=generateRandomNumber(),isWin=!1,span=document.getElementById("attemptsLeft");console.log(randomNumber),function(){for(let e=1;e<=50;e++){var t=document.createElement("button");t.setAttribute("id","btn"),t.setAttribute("value",e),t.style.backgroundColor="#AFADAD",t.innerHTML=e,document.getElementById("btnBalls").appendChild(t)}var e=document.createElement("p");document.body.appendChild(e);var n=document.createElement("span");n.setAttribute("id","result"),e.appendChild(n)}();for(let t=0;t<btn.length;t++)btn[t].addEventListener("click",function(t){4==++count?(changeButtonColor(t),t.currentTarget.value!=randomNumber&&analyzeResult()):count<4&&changeButtonColor(t),count<=1&&document.getElementById("introRules").remove(),span.innerHTML=4-count});function changeButtonColor(t){t.currentTarget.value==randomNumber?(t.currentTarget.style.backgroundColor="#0074FF",isWin=!0,analyzeResult()):t.currentTarget.value<randomNumber?(alert("Attempts Left: "+(4-count)),t.currentTarget.style.backgroundColor="#335d2d"):t.currentTarget.value>randomNumber&&(alert("Attempts Left: "+(4-count)),t.currentTarget.style.backgroundColor="#ff414d")}function analyzeResult(){let t=document.getElementById("result"),e=document.createElement("button");t.setAttribute("class","font-weight-bold"),e.setAttribute("id","reload"),e.setAttribute("onclick","reload()"),e.innerHTML="Play Again!",isWin?(e.setAttribute("class","btn btn-success"),t.innerHTML="Congratulations!!! You have won the game."):(e.setAttribute("class","btn btn-danger"),t.innerHTML="Sorry... You have lost the game. Correct Guess was ball number: "+randomNumber,btn[randomNumber-1].style.backgroundColor="#0074FF"),document.body.appendChild(e),e.onclick=function(){setTimeout(function(){location.reload()},100)}}