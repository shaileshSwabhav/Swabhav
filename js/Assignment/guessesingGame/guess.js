var generateRandomNumber = function() {
    return (Math.floor(Math.random()  * 50) + 1);
}

let count = 0;
let randomNumber = generateRandomNumber();
let isWin = false;
let span = document.getElementById("attemptsLeft");
console.log(randomNumber);

(function() {
    for(let i = 1; i <= 50; i++){
        var btn = document.createElement('button');
        btn.setAttribute('id', 'btn');
        btn.setAttribute('value', i)
        btn.style.backgroundColor = '#AFADAD';
        btn.innerHTML = i;
        document.body.appendChild(btn);

        if (i % 10 == 0) {
            var brk = document.createElement('br');
            document.body.appendChild(brk);
        }
    }

    var para = document.createElement('p');
    document.body.appendChild(para);
    var displayResult = document.createElement('span');
    displayResult.setAttribute('id', 'result');
    para.appendChild(displayResult);

})();

for(let i = 0; i < btn.length; i++) {

    btn[i].addEventListener('click', function(e) {

        count++;
        if (count == 4) {
            changeButtonColor(e);
            if (e.currentTarget.value != randomNumber) {
                analyzeResult();
            }
        } else if (count < 4) {
            changeButtonColor(e);
        }

        span.innerHTML = (4 - count);
    })
}

function changeButtonColor(e) {

    if (e.currentTarget.value == randomNumber){
        e.currentTarget.style.backgroundColor = "#0074FF";
        isWin = true;
        analyzeResult();
    }
    else if (e.currentTarget.value < randomNumber) {
        e.currentTarget.style.backgroundColor = "#17FF00";

    } else if (e.currentTarget.value > randomNumber) {
        e.currentTarget.style.backgroundColor = "#FF0000";

    }
}

function analyzeResult(e) {

    let result = document.getElementById('result');
    let reloadBtn = document.createElement('button');
    reloadBtn.setAttribute('id', 'reload');
    reloadBtn.setAttribute('onclick', 'reload()');
    reloadBtn.innerHTML = 'Reload';

    if(isWin) {
        result.innerHTML = "Congratulations!!! You have won the game.";
        
    } else {
        result.innerHTML = "Sorry... You have lost the game. <br>Correct Guess was ball number: " + randomNumber;
        btn[randomNumber - 1].style.backgroundColor = '#0074FF';

    }
    document.body.appendChild(reloadBtn);

    reloadBtn.onclick = function () {
        setTimeout(function() {
            location.reload();
        }, 100);
    }
}