var randomNumber = function() {
    return (Math.floor(Math.random()  * 50) + 1);
}

let count = 0;
let guessNumber = randomNumber();
let isWin = false;
let span = document.getElementById("attemptsLeft");
console.log(guessNumber);

(function() {
    for(let i = 1; i <= 50; i++){
        var btn = document.createElement('button');
        btn.setAttribute('id', 'btn');
        btn.setAttribute('value', i)
        btn.style.backgroundColor = '#AFADAD';
        btn.innerHTML = i;
        document.body.appendChild(btn);

        if (i % 5 == 0) {
            var brk = document.createElement('br');
            document.body.appendChild(brk);
        }

    }

})();

for(let i = 0; i < btn.length; i++) {

    btn[i].addEventListener('click', function(e) {

        if (count == 3) {
            changeButtonColor(e);
            if (e.currentTarget.value != guessNumber) {
                analyzeResult();
            }
        } else if (count < 4) {
            changeButtonColor(e);
        }

        span.innerHTML = (4 - count);
    })
}

function changeButtonColor(e) {
    if (e.currentTarget.value == guessNumber){
        e.currentTarget.style.backgroundColor = "#0074FF";
        isWin = true;
        analyzeResult();
    }
    else if (e.currentTarget.value < guessNumber) {
        e.currentTarget.style.backgroundColor = "#17FF00";
        count++;
    } else if (e.currentTarget.value > guessNumber) {
        e.currentTarget.style.backgroundColor = "#FF0000";
        count++;
    }
}

function analyzeResult() {
    if(isWin) {
        setTimeout(function() {
            alert("Hurray!!!! You won the game.");
            location.reload();
        }, 300);
    } else {
        setTimeout(function() {
            alert("Sorry, you lost the game.");
            location.reload();
        }, 300);

    }
}

