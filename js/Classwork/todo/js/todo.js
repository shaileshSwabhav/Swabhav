let doneList = [];
let undoneList = [];

const add = document.getElementById('task');
const div1 = document.createElement('div');
const div2 = document.createElement('div');
const p1 = document.createElement('p');
const p2 = document.createElement('p');
const donePara = document.createElement('p');


document.body.appendChild(div1);
div1.appendChild(p1);

document.body.appendChild(div2);
div2.appendChild(p2);

function addToList() {

    p1.innerHTML = "Undone Task: <br>";
    undoneList.push(add.value);

    const lbl = document.createElement('label');

    const chkBox = document.createElement('input'); 
    chkBox.setAttribute('type', 'checkbox');

    lbl.innerHTML = add.value;
    chkBox.setAttribute('id', add.value);
    chkBox.setAttribute('value', add.value);

    chkBox.addEventListener('change', function(e){
        
        p2.innerHTML = "Done<br>";

        doneList.push(undoneList[undoneList.indexOf(e.currentTarget.value)]);
        let index = undoneList.indexOf(e.currentTarget.value);
        undoneList.splice(index, 1);

        lbl.style.textDecoration = 'line-through';
        donePara.innerHTML = doneList;

        div1.removeChild(e.currentTarget);
        div1.removeChild(lbl);
        console.log(e.currentTarget.id);

        div2.appendChild(donePara);
    });

    div1.appendChild(chkBox);
    div1.appendChild(lbl);
    div1.appendChild(document.createElement('br'));

}



