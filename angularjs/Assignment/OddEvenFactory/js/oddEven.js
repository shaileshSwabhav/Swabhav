var oddEvenApp = angular.module('oddEvenApp', []);

oddEvenApp.factory('checkOddEven', function() {

    var obj = {};

    obj.checkNum = function(num) {
        if(num % 2 == 0) {
            return 'Even';
        } else {
            return 'Odd';
        }
    }

    return obj;
});

oddEvenApp.controller('oddEvenController', function($scope, checkOddEven) {

    $scope.result = true;

    $scope.checkOddEvenNumber = function() {
        $scope.result = false;
        $scope.numberResult = checkOddEven.checkNum($scope.oddEvenNum);
    }
});