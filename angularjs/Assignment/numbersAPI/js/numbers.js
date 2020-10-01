var numbersApiApp = angular.module('numbersapiApp', []);

numbersApiApp.controller('numbersapiController', function($scope, $http) {

    $scope.load = function() {
        for(var triviaInfo in window.localStorage) {
            if(window.localStorage.hasOwnProperty(triviaInfo)) {
                let trivia = localStorage.getItem(triviaInfo);
                triviaInfo = triviaInfo.split(',');

                $scope.taskFormatter(triviaInfo, trivia);
            }
        }
    }

    $scope.numbersTrivia = [];
    $scope.fetchTrivia = function() {

        $scope.triviaTime = moment().format('MM D YYYY hh:mm:ss');
        $scope.triviaInfo = [$scope.userInput, $scope.triviaTime];

        $http({
            method: 'get',
            url: 'http://numbersapi.com/' + $scope.userInput + '/trivia',
        }).then(function(response) {
            localStorage.setItem($scope.triviaInfo, response.data);
            $scope.taskFormatter($scope.triviaInfo, response.data);

        });
    }

    $scope.taskFormatter = function(triviaInfo, trivia) {

        $scope.numbersTrivia.push({
            'number': triviaInfo[0],
            'trivia': trivia,
            'triviaTime': calculateTimeDifference(triviaInfo[1]),
        });
    }

});

var calculateTimeDifference = function(time) {
    let taskAddedTime = moment(time);
    let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
    let compare = moment.duration(taskAddedTime.diff(currentTime));

    return compare.humanize(true);
}

