const worker = new Worker("timePrinter.js");

worker.onmessage = function(e) {
    console.log(e.data);
}

document.getElementById('displayTime').addEventListener('click', function(e) {

        worker.postMessage(new Date().getSeconds());
});

document.getElementById('hello').addEventListener('click', function(e) {
    console.log('HELLO!!!');
});