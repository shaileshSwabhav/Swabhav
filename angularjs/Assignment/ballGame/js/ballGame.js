var ballGameApp = angular.module('ballGameApp', []);

ballGameApp.controller('ballGameController', function($scope) {

    const startPoint = 1;
    const endPoint = 51;
    const randomBallNumber = Math.floor((Math.random() * 50) + 1);
    $scope.noOfAttempts = 4;
    $scope.IsVisible = true;

    console.log(randomBallNumber);

    $scope.range = function() {
        var input = []; 
            for (var i = startPoint; i < endPoint; i += 1) { 
                input.push(i); 
            } 
            return input;
    }

    $scope.checkButton = function(event) {

            if($scope.noOfAttempts-- != 0) {
                if(event.target.id == randomBallNumber) {
                    $('#'+event.target.id).css('backgroundColor', 'blue');
                    $scope.checkForResult(true);
                    return;

                } else if(event.target.id > randomBallNumber) {
                    $('#'+event.target.id).css('backgroundColor', 'green');

                } else if(event.target.id < randomBallNumber) {
                    $('#'+event.target.id).css('backgroundColor', 'red');
                }
            }

            if($scope.noOfAttempts <= 0) {
                $scope.checkForResult(false);
            }
    }

    $scope.checkForResult = function(result) {

            if(result == true) {
                $scope.gameResult = "WINNER!!!!";
            } else {
                $scope.gameResult = "Sorry You Lost the game. Correct ball was " + randomBallNumber;
            }
        $scope.IsVisible = false;    
    }

    $scope.reloadPage = function() {
        location.reload();
    }



});