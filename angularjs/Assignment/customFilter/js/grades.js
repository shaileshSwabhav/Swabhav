var filterApp = angular.module('customFilterApp', []);

filterApp.filter('cgpaToGrade', function() {
    var grade = function(input) {
        if(input == 9) {
            return 'A';
        } else if(input == 8) {
            return 'B';
        } else {
            return 'C';
        }
    }

    return grade;
});

filterApp.controller('customFilterController', function($scope) {

    $scope.students = [
        {
            'rollNo': 01,
            'name': 'sam',
            'cgpa': 9,
        },
        {
            'rollNo': 02,
            'name': 'tom',
            'cgpa': 7,
        },        
        {
            'rollNo': 03,
            'name': 'john',
            'cgpa': 8,
        },
    ];

});