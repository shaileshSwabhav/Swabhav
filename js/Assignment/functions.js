function squaresOfNumber() {
    var element = document.getElementById('result');
    var arr = [1, 2, 3, 4, 5, 16, 7, 8, 9, 10];
    var j = 0, i = 0, count = 0;
    console.log(arr);

    while(i < arr.length) {

        var product = arr[i] * arr[i];
        
        if (product == arr[j]){
            count++;
            i++;
            j++;
            console.log("Present in array: " + product);
        } else if (j == arr.length) {
            j = 0;
            i++;
        } else {
            j++;
        }
        
    }
    console.log("Count: " + count);

    
}