// var countriesApp = angular.module('countryApiApp', []);

// countriesApp.controller('countryApiController', ['$scope', "$http", function($scope, $http) {

//     $scope.countries =[];

//     $http({
//         method: 'get',
//         url: 'https://restcountries.eu/rest/v2/all',
//     }).then(function(response) {
//         $scope.countryInfoFormatter(response.data);
//     });

//     $scope.countryInfoFormatter = function(countryInfo) {

//         for (let i = 0; i < countryInfo.length; i++) {
//             $scope.countries.push({
//             'name': countryInfo[i].name,
//             'capital':countryInfo[i].capital,
//             'flag': countryInfo[i].flag,
//             });
//         }

//     }

// }]);

var countriesApp=angular.module("countryApiApp",[]);countriesApp.controller("countryApiController",["$scope","$http",function(t,n){t.countries=[],n({method:"get",url:"https://restcountries.eu/rest/v2/all"}).then(function(n){t.countryInfoFormatter(n.data)}),t.countryInfoFormatter=function(n){for(let o=0;o<n.length;o++)t.countries.push({name:n[o].name,capital:n[o].capital,flag:n[o].flag})}}]);