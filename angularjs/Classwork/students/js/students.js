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
    },
    {
        Name: "Joel Smith",
        Roll_No: "4",
        CGPA: "6.6"
    },
    {
        Name: "James Timson",
        Roll_No: "5",
        CGPA: "7.3"
    }
];

var students = angular.module("studentsInfo", []);

students.controller("studentsController", function($scope) {

    // $scope.btn = function() {
        $scope.studentsData = data;
    // }

});