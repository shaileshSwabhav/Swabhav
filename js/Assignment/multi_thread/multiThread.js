var worker;
function displayTime() {

    if (typeof(worker) == "undefined") {
        worker = new Worker("worker.js");
    }
    
    worker.onmessage = function(e) {
        console.log(e.data);
    }
    
    var date = new Date();
    worker.postMessage(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());

}

function displayHello() {
    console.log('HELLO!!!');
}
