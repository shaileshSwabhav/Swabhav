var num1 = 7;
var num2 = 5;

function calc(callback) {
    console.log(callback());
}

var add = function(){
    return num1 + num2;
}

var sub = function(){
    return num1 - num2;
}

var mult = function(){
    return num1 * num2;
}
