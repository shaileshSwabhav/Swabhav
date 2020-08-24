const add = document.getElementById('task');
const div1 = document.createElement('div');
const div2 = document.createElement('div');
const p1 = document.createElement('p');
const p2 = document.createElement('p');

div1.setAttribute('id', 'div1');
div2.setAttribute('id', 'div2');

document.body.appendChild(div1);
div1.appendChild(p1);

document.body.appendChild(div2);
div2.appendChild(p2);

let i = 1;

window.onload = function() {

    p1.innerHTML = "Undone Task: <br>";
    div1.appendChild(p1);

    let localStorageIndex = 0;
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            addTask(localStorage.getItem(key), localStorage.key(localStorageIndex));
            localStorageIndex++;
        }
    }
}

document.getElementById('addTask').addEventListener('click', function() {
    p1.innerHTML = "Undone Task: <br>";

    let taskNumber = 'Task ' + i;
    localStorage.setItem(taskNumber, add.value);

    addTask(add.value, taskNumber);
    i++;
});


function addTask(taskName, taskNumber) {

    const lbl = document.createElement('label');
    const chkBox = document.createElement('input'); 
    lbl.setAttribute('id', taskNumber);
    chkBox.setAttribute('type', 'checkbox');

    lbl.innerHTML = taskName;
    chkBox.setAttribute('class', taskNumber);
    chkBox.setAttribute('value', taskName);

    document.getElementById('div1').appendChild(chkBox);
    document.getElementById('div1').appendChild(lbl);
    document.getElementById('div1').appendChild(document.createElement('br'));

    chkBox.addEventListener('change', function(e) {
        checkboxEvent(e);
    }); 
}

function checkboxEvent(e) {
    var date = new Date();
    var currentDate = (date.getDate() + "/"
    + (date.getMonth()+1)  + "/" 
    + date.getFullYear() + " @ "  
    + date.getHours() + ":"  
    + date.getMinutes() + ":" 
    + date.getSeconds());

    p2.innerHTML = "Done<br>";
    const donePara = document.createElement('p');
    
    donePara.innerHTML = localStorage.getItem(e.currentTarget.className) + " task completed at " + currentDate;

    localStorage.removeItem(e.currentTarget.className);
    
    document.getElementById('div1').removeChild(e.currentTarget);
    document.getElementById('div1').removeChild(document.getElementById(e.currentTarget.className));

    div2.appendChild(donePara);
}