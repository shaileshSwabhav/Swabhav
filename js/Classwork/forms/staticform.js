const userName = document.getElementById('userName');
const pass = document.getElementById('password');
let p = document.createElement('p');
document.body.appendChild(p);

function validateForm() {
    let userError = document.getElementById('userNameError')
    let passError = document.getElementById('passwordError');

    if(userName.value == "") {
        userError.textContent = "Please enter this field";
        userError.style.color = 'red';
    } else {
        userError.textContent = "";
    }
    if (pass.value == "") {
        passError.textContent = "Please enter this field";
        passError.style.color = 'red';
    } else {
        passError.textContent = "";
    }

    if (userName.value != "" && pass.value != "") {
        p.innerHTML = "WELCOME " + userName.value;
    }

}
