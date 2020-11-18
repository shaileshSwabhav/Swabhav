const add = document.getElementById('task');
const div1 = document.createElement('div');
const div2 = document.createElement('div');
const p1 = document.createElement('p');
const p2 = document.createElement('p');
const undoneListGroup1 = document.createElement('ul');
const doneListGroup1 = document.createElement('ul');

p1.setAttribute('class', 'display-4');
p2.setAttribute('class', 'display-4');

undoneListGroup1.setAttribute('class', 'list-group');
doneListGroup1.setAttribute('class', 'list-group');

div1.setAttribute('id', 'div1');
div2.setAttribute('id', 'div2');

document.getElementById('mainDiv').appendChild(div1);
div1.appendChild(p1);

document.getElementById('mainDiv').appendChild(div2);
div2.appendChild(p2);

document.getElementById('div1').appendChild(undoneListGroup1);
document.getElementById('div2').appendChild(doneListGroup1);

let i = 1;

window.onload = function() {

    div1.insertBefore(p1, undoneListGroup1);

    let localStorageIndex = 0;
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            addTaskInList(localStorage.getItem(key), localStorage.key(localStorageIndex));
            localStorageIndex++;
        }
    }
}

document.getElementById('addTask').addEventListener('click', function() {
    p1.innerHTML = "Undone Task: <br>";
    
    let taskNumber = 'Task' + i;
    localStorage.setItem(taskNumber, add.value);

    addTaskInList(add.value, taskNumber);
    i++;
});

function addTaskInList(taskName, taskNumber) {
    
    p1.innerHTML = "Undone Task: <br>";

    const chkBox = document.createElement('input'); 
    const liElements = document.createElement('li');

    chkBox.setAttribute('type', 'checkbox');
    chkBox.setAttribute('class', taskNumber);
    chkBox.setAttribute('value', taskName);

    liElements.setAttribute('class', 'list-group-item list-group-item-action list-group-item-info');
    liElements.setAttribute('id', taskNumber);
    // liElements.innerHTML = taskName;
    
    liElements.appendChild(chkBox);
    liElements.appendChild(document.createTextNode(taskName));
    undoneListGroup1.appendChild(liElements);

    chkBox.addEventListener('click', function(e) {
        removeListItem(e);
    });

}

function removeListItem(e) {
    console.log(e.currentTarget.className);
    console.log(document.getElementById(e.currentTarget.className));

    var date = new Date();
    var currentDate = (date.getDate() + "/"
    + (date.getMonth()+1)  + "/" 
    + date.getFullYear() + " @ "  
    + date.getHours() + ":"  
    + date.getMinutes() + ":" 
    + date.getSeconds());

    p2.innerHTML = "Compeleted Task:<br>";
    
    const doneList = document.createElement('li');
    doneList.setAttribute('class', 'list-group-item list-group-item-action list-group-item-danger');

    doneList.innerHTML = localStorage.getItem(e.currentTarget.className) + " task completed @ " + currentDate;

    doneListGroup1.appendChild(doneList);

    localStorage.removeItem(e.currentTarget.className);

    undoneListGroup1.removeChild(document.getElementById(e.currentTarget.className));
}

// const add=document.getElementById("task"),div1=document.createElement("div"),div2=document.createElement("div"),p1=document.createElement("p"),p2=document.createElement("p"),undoneListGroup1=document.createElement("ul"),doneListGroup1=document.createElement("ul");p1.setAttribute("class","display-4"),p2.setAttribute("class","display-4"),undoneListGroup1.setAttribute("class","list-group"),doneListGroup1.setAttribute("class","list-group"),div1.setAttribute("id","div1"),div2.setAttribute("id","div2"),document.getElementById("mainDiv").appendChild(div1),div1.appendChild(p1),document.getElementById("mainDiv").appendChild(div2),div2.appendChild(p2),document.getElementById("div1").appendChild(undoneListGroup1),document.getElementById("div2").appendChild(doneListGroup1);let i=1;function addTaskInList(e,t){p1.innerHTML="Undone Task: <br>";const n=document.createElement("input"),d=document.createElement("li");n.setAttribute("type","checkbox"),n.setAttribute("class",t),n.setAttribute("value",e),d.setAttribute("class","list-group-item list-group-item-action list-group-item-info"),d.setAttribute("id",t),d.appendChild(n),d.appendChild(document.createTextNode(e)),undoneListGroup1.appendChild(d),n.addEventListener("click",function(e){removeListItem(e)})}function removeListItem(e){console.log(e.currentTarget.className),console.log(document.getElementById(e.currentTarget.className));var t=new Date,n=t.getDate()+"/"+(t.getMonth()+1)+"/"+t.getFullYear()+" @ "+t.getHours()+":"+t.getMinutes()+":"+t.getSeconds();p2.innerHTML="Compeleted Task:<br>";const d=document.createElement("li");d.setAttribute("class","list-group-item list-group-item-action list-group-item-danger"),d.innerHTML=localStorage.getItem(e.currentTarget.className)+" task completed @ "+n,doneListGroup1.appendChild(d),localStorage.removeItem(e.currentTarget.className),undoneListGroup1.removeChild(document.getElementById(e.currentTarget.className))}window.onload=function(){div1.insertBefore(p1,undoneListGroup1);let e=0;for(var t in window.localStorage)window.localStorage.hasOwnProperty(t)&&(addTaskInList(localStorage.getItem(t),localStorage.key(e)),e++)},document.getElementById("addTask").addEventListener("click",function(){p1.innerHTML="Undone Task: <br>";let e="Task"+i;localStorage.setItem(e,add.value),addTaskInList(add.value,e),i++});