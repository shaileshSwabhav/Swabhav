var students = angular.module("studentsInfo", []);

students.controller("studentsController", function($scope) {
    $scope.studentsData = [{
        Roll_No: 101,
        Name: "abc",
        CGPA: 7.5
    }];
});