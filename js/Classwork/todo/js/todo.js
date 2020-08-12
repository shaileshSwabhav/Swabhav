const add = document.getElementById('task');
const div1 = document.createElement('div');
const div2 = document.createElement('div');
const p1 = document.createElement('p');
const p2 = document.createElement('p');

document.body.appendChild(div1);
div1.appendChild(p1);

document.body.appendChild(div2);
div2.appendChild(p2);

var i = 1;

window.onload = function(e) {

    p1.innerHTML = "Undone Task: <br>";
    div1.appendChild(p1);

    let localStorageIndex = 0;
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {

            const lbl = document.createElement('label');
            const chkBox = document.createElement('input'); 
            chkBox.setAttribute('type', 'checkbox');
            chkBox.setAttribute('id', localStorage.key(localStorageIndex));
            localStorageIndex++;
            chkBox.setAttribute('value', localStorage.getItem(key));

            lbl.innerHTML = localStorage.getItem(key);

            div1.appendChild(chkBox);
            div1.appendChild(lbl);
            div1.appendChild(document.createElement('br'));

            chkBox.addEventListener('change', function(e) {
                var date = new Date();
                var currentDate = (date.getDate() + "/"
                + (date.getMonth()+1)  + "/" 
                + date.getFullYear() + " @ "  
                + date.getHours() + ":"  
                + date.getMinutes() + ":" 
                + date.getSeconds());
            
                p2.innerHTML = "Done<br>";
                const donePara = document.createElement('p');
            
                console.log(e.currentTarget);
                donePara.innerHTML = e.currentTarget.value + " task completed at " + currentDate;
                localStorage.removeItem(e.currentTarget.id);

                div1.removeChild(e.currentTarget);
                div1.removeChild(lbl);
            
                div2.appendChild(donePara);
            });        
        }
    }
    
}

document.getElementById('addTask').addEventListener('click', function() {
    p1.innerHTML = "Undone Task: <br>";

    let taskNumber = 'Task ' + i;
    localStorage.setItem(taskNumber, add.value);

    const lbl = document.createElement('label');
    const chkBox = document.createElement('input'); 
    chkBox.setAttribute('type', 'checkbox');

    lbl.innerHTML = add.value;
    chkBox.setAttribute('id', taskNumber);
    chkBox.setAttribute('value', add.value);
    i++;

    div1.appendChild(chkBox);
    div1.appendChild(lbl);
    div1.appendChild(document.createElement('br'));

    chkBox.addEventListener('change', function(e) {
        var date = new Date();
        var currentDate = (date.getDate() + "/"
        + (date.getMonth()+1)  + "/" 
        + date.getFullYear() + " @ "  
        + date.getHours() + ":"  
        + date.getMinutes() + ":" 
        + date.getSeconds());
    
        p2.innerHTML = "Done<br>";
        const donePara = document.createElement('p');
        
        donePara.innerHTML = localStorage.getItem(e.currentTarget.id) + " task completed at " + currentDate;
        console.log(e.currentTarget.id);

        localStorage.removeItem(e.currentTarget.id);
    
        div1.removeChild(e.currentTarget);
        div1.removeChild(lbl);
    
        div2.appendChild(donePara);
    });
});




// function addTaskToDoneList(e) {

//     var date = new Date();
//     var currentDate = (date.getDate() + "/"
//     + (date.getMonth()+1)  + "/" 
//     + date.getFullYear() + " @ "  
//     + date.getHours() + ":"  
//     + date.getMinutes() + ":" 
//     + date.getSeconds());

//     p2.innerHTML = "Done<br>";
//     const donePara = document.createElement('p');

//     doneList.push(undoneList[undoneList.indexOf(e.currentTarget.value)]);
//     localStorage.removeItem('doneList', doneList);

//     donePara.innerHTML = e.currentTarget.id + " task completed at " + currentDate;
//     // console.log(e.currentTarget);
//     localStorage.removeItem(e.currentTarget.id);
//     let index = undoneList.indexOf(e.currentTarget.value);
//     undoneList.splice(index, 1);

//     div1.removeChild(e.currentTarget);
//     div1.removeChild(lbl);

//     div2.appendChild(donePara);
// }


