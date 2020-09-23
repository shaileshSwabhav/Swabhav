var loginApp = angular.module('loginForm', []);

loginApp.controller('loginFormValidation', function($scope) {
    
    $scope.loginInfo = "";
    $scope.validateUsername = "Username is required.";
    $scope.passwordInfo = 'Password is required.';
    var specialChars = /[ `!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/;
    var alpha = /[a-zA-Z]/;
    var numeric = /[0-9]/;
    

    $scope.validateForm = function() {
        
        if(specialChars.test($scope.password) && alpha.test($scope.password) && 
        numeric.test($scope.password) && $scope.password.length >= 8) {

            $scope.userLoginform.password.$setValidity("password", true);
            $scope.passwordInfo = "";
            console.log('true');

            return true;
        } else {
            $scope.userLoginform.password.$setValidity("password", false);
            $scope.passwordInfo = 'Password should be alpha numeric and contain special characters.';
            console.log('false');

            return false;
        }

    }

    $scope.login = function() {

        $scope.loginInfo = "Login Successful";

    }

});