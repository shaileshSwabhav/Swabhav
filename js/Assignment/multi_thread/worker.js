// this.onmessage = function(e) {
//     // this.postMessage(e.data);
//     console.log(e.data);
// }

while(true) {
    const date = new Date();
    this.postMessage(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());   
        
}
