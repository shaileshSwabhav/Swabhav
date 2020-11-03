var app1 = angular.module('app', ['app2', 'app3'])
.controller('contoller1', function($scope, $rootScope) {
    $scope.name = "sam";
    $rootScope.id = 101;
});

var app2 = angular.module('app2', [])
.controller('contoller2', function($scope) {
    $scope.name = 'tom';
});

var app3 = angular.module('app3', [])
.controller('contoller3', function($scope) {
    $scope.name = 'john';
});