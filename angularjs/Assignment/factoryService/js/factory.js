var factoryApp = angular.module('factoryApp', []);

var buttonPressedCount = 0;

factoryApp.factory('countButtonsPressed', function() {

    var object = {};

    object.incrementCount = function(buttonPressedCount) {
        return buttonPressedCount += 1;
    }

    object.decrementCount = function(buttonPressedCount) {
        return buttonPressedCount -= 1;
    }

    object.currentCount = function() {
        return buttonPressedCount;
    }

    return object;

});


factoryApp.controller('factoryController1', function($scope, $rootScope, countButtonsPressed) {

    $scope.increment = function() {
        buttonPressedCount = countButtonsPressed.incrementCount(buttonPressedCount);
        console.log(buttonPressedCount);
        $rootScope.buttonPressedCount = buttonPressedCount;
    }

});
    
factoryApp.controller('factoryController2', function($scope, $rootScope, countButtonsPressed) {
    
    $scope.decrement = function() {
        buttonPressedCount = countButtonsPressed.decrementCount(buttonPressedCount);
        console.log(buttonPressedCount);
        $rootScope.buttonPressedCount = buttonPressedCount;
    }

});

factoryApp.controller('factoryController', function($rootScope) {
    
    $rootScope.buttonPressedCount = buttonPressedCount;
});