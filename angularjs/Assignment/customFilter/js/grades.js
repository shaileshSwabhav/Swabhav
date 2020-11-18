var filterApp = angular.module('customFilterApp', []);

filterApp.filter('cgpaToGrade', function() {
    return function(input) {

        switch (input) {
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';

            default:
                return  '-';
        }
    }
    
});

filterApp.controller('customFilterController1', function($scope) {

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