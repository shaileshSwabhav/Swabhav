var spaApp = angular.module('spa', ['ngRoute']);

spaApp.config(function($routeProvider) {

    $routeProvider
    .when('/', {
        templateUrl: "./spa-1.html",
        controller: 'spaController',
    })
    .when('#home', {
        templateUrl: "./spa-1/home.html",
        controller: 'spaController'
    })
    .when('#about', {
        templateUrl: "./spa-1/about.html/",
        controller: 'spaController'
    })
    .when('#career', {
        templateUrl: "./spa-1/career.html",
        controller: 'spaController'
    })
    .otherwise({
        redirectTo: '/'
    })
    
});

spaApp.controller('spaController', function($scope, $location) {
    console.log($location.path());
    console.log($location.hash());
});
