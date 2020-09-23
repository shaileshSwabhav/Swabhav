var sliderApp = angular.module('slider', []);

sliderApp.controller('silderController', function($scope) {

    $scope.sliderValue = 10;

    $scope.createButtons = function(sliderValue) {
        var input = []; 
            for (var i = 1; i <= sliderValue; i += 1) { 
                input.push(i); 
            } 
            return input;
    }
});