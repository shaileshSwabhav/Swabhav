var data = [
    {
        Name: "John Smith",
        Roll_No: 1,
        CGPA: 9.5
    },
    {
        Name: "Sally Smith",
        Roll_No: "2",
        CGPA: "8.6"
    },
    {
        Name: "Curtis Timson",
        Roll_No: "3",
        CGPA: "7.6"
    }
];

var students = angular.module("studentsInfo", []);

students.controller("studentsController", function($scope) {

    $scope.btn = function() {
        $scope.studentsData = data;
    }

});