var factoryApp = angular.module('factoryApp', []);

factoryApp.service('countButtonsPressed', function() {

    // var object = {};
    this.buttonPressedCount = 0;

    this.incrementCount = function() {
        return this.buttonPressedCount += 1;
    }

    this.decrementCount = function() {
        return this.buttonPressedCount -= 1;
    }

    this.currentCount = function() {
        return this.buttonPressedCount;
    }

    // return object;

});


factoryApp.controller('factoryController1', function($scope, $rootScope, countButtonsPressed) {

    $scope.increment = function() {
        $rootScope.buttonPressedCount = countButtonsPressed.incrementCount();

    }

});
    
factoryApp.controller('factoryController2', function($scope, $rootScope, countButtonsPressed) {
    
    $scope.decrement = function() {
        $rootScope.buttonPressedCount = countButtonsPressed.decrementCount();
    }

});

factoryApp.controller('factoryController', function($rootScope, countButtonsPressed) {
    
    $rootScope.buttonPressedCount = countButtonsPressed.currentCount();
});