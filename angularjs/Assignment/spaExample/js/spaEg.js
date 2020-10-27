var spaApp = angular.module('spa', []);

spaApp.controller('cntrl', function($scope, $window) {

    $window.addEventListener('hashchange', function() {
        //$rootScope.$broadcast('message', e.data);

        console.log("Page loaded from "+ $window.location.hash);

    });
});
