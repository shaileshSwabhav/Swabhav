var worker;
function displayTime() {

    worker = new Worker("worker.js");
    
    worker.onmessage = function(e) {
        console.log(e.data);
    }
}

function displayHello() {
    if(worker == 'undefined') 
        worker.terminate();
    console.log('HELLO!!!');
}
