var oddEvenApp = angular.module('oddEvenApp', []);

oddEvenApp.factory('checkOddEven', function() {

    var obj = {};

    obj.checkNum = function(num) {
        if(num % 2 == 0) {
            return 'Even';
        } else {
            // return 'Odd';
            return this.checkPrime(num);
        }
    }

    obj.checkPrime = function(num) {
        var flag ;

            for(i = 2; i <= num - 1; i++){
                if (num % i == 0) { 
                    flag = false; 
                    break; 
                } else {
                    flag = true;
                }
            }
                  
            if (flag == true){
                return "Prime";
            }
            else{
                return "Not Prime";
            } 
    }

    return obj;
});

oddEvenApp.controller('oddEvenController', function($scope, checkOddEven) {

    $scope.result = true;

    $scope.checkOddEvenNumber = function() {
        $scope.result = false;
        $scope.numberResult = checkOddEven.checkNum($scope.oddEvenNum);
        $scope.primeResult = checkOddEven.checkPrime($scope.oddEvenNum);
    }
});