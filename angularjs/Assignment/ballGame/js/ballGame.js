var ballGameApp = angular.module('ballGameApp', []);

ballGameApp.controller('ballGameController', function($scope) {

    const startPoint = 1;
    const endPoint = 51;
    const randomBallNumber = Math.floor((Math.random() * 50) + 1);
    $scope.noOfAttempts = 4;
    $scope.IsVisible = true;
    $scope.showRules = true;
    $scope.disableBtn = false;
    console.log(randomBallNumber);


    $scope.range = function() {
        
        var input = [];
        
        for (var i = startPoint; i < endPoint; i += 1) { 
            input.push(i); 
        } 
        return input;
    }

    $scope.checkButton = function(event) {

        $scope.showRules = false;

        if($scope.noOfAttempts-- != 0) {
            if(event.target.id == randomBallNumber) {
                $('#'+event.target.id).css('backgroundColor', '#1B4BFF');
                $scope.checkForResult(true);
                return;
            } else if(event.target.id > randomBallNumber) {
                $('#'+event.target.id).css('backgroundColor', '#28B463 ');
            } else if(event.target.id < randomBallNumber) {
                $('#'+event.target.id).css('backgroundColor', '#FF1B1B');
            }
        }

        alert('Attempts left: ' + $scope.noOfAttempts);

        if($scope.noOfAttempts <= 0) {
            $scope.checkForResult(false);
        }
    }

    $scope.checkForResult = function(result) {

            if(result == true) {
                $scope.gameResult = "WINNER!!!!";
                $scope.disableBtn = true;

            } else {
                $('#'+randomBallNumber).css('backgroundColor', '#1B4BFF');
                $scope.gameResult = "Sorry You Lost the game. Correct ball was " + randomBallNumber;
            }
        $scope.IsVisible = false;    
    }

    $scope.reloadPage = function() {

        location.reload();
    }



});
