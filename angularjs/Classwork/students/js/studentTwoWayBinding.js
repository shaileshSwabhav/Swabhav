var students = angular.module("studentsInfo", []);

students.controller("oneWayController", function($scope) {
    $scope.studentsData = [{
        Roll_No: 101,
        Name: "abc",
        CGPA: 7.5
    }];
});

students.controller("twoWayController", function($scope) {
    $scope.name = "";
    $scope.rollno="";
    $scope.cgpa="";
});

