var app = angular.module("myapp", ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider
    
    .when("/bike", {
        templateUrl : "./bike.html",
        controller : "cntrl"
    })
    .when("/bajaj", {
      templateUrl : "./bajaj.html",
      controller : "cntrl1"
    })
    .when("/yamaha", {
      templateUrl : "./yamaha.html",
      controller : "cntrl2"
    })
    .when("/honda", {
      templateUrl : "./Honda.html",
      controller : "cntrl3"
    })
    .otherwise({
      redirectTo: './bike.html'
    })
  });

app.controller("cntrl", ['$scope', function($scope) {
    console.log("Bike.html");
}]);

app.controller("cntrl1", ['$scope', function($scope) {
  console.log("Bajaj.html");
  $scope.bikeLocation = "Bajaj Bikes";
}]);

app.controller("cntrl2", ['$scope', function($scope) {
  console.log("yamaha.html");
  $scope.bikeLocation = "Yamaha Bikes";

}]);

app.controller("cntrl3", ['$scope', function($scope) {
  console.log('Honde.html');
  $scope.bikeLocation = "Honda Bikes";
}]);