// var ballGameApp = angular.module('ballGameApp', []);

// ballGameApp.controller('ballGameController', ['$scope', function($scope) {

//     const startPoint = 1;
//     const endPoint = 51;
//     const randomBallNumber = Math.floor((Math.random() * 50) + 1);
//     $scope.noOfAttempts = 4;
//     $scope.IsVisible = true;
//     $scope.showRules = true;
//     $scope.disableBtn = false;
//     console.log(randomBallNumber);


//     $scope.range = function() {
        
//         var input = [];
        
//         for (var i = startPoint; i < endPoint; i += 1) { 
//             input.push(i); 
//         } 
//         return input;
//     }

//     $scope.checkButton = function(event) {

//         $scope.showRules = false;

//         if($scope.noOfAttempts-- != 0) {
//             if(event.target.id == randomBallNumber) {
//                 $('#'+event.target.id).css('backgroundColor', '#1B4BFF');
//                 $scope.checkForResult(true);
//                 return;
//             } else if(event.target.id > randomBallNumber) {
//                 $('#'+event.target.id).css('backgroundColor', '#28B463 ');
//             } else if(event.target.id < randomBallNumber) {
//                 $('#'+event.target.id).css('backgroundColor', '#FF1B1B');
//             }
//         }

//         alert('Attempts left: ' + $scope.noOfAttempts);

//         if($scope.noOfAttempts <= 0) {
//             $scope.checkForResult(false);
//         }
//     }

//     $scope.checkForResult = function(result) {

//             if(result == true) {
//                 $scope.gameResult = "WINNER!!!!";
//                 $scope.disableBtn = true;

//             } else {
//                 $('#'+randomBallNumber).css('backgroundColor', '#1B4BFF');
//                 $scope.gameResult = "Sorry You Lost the game. Correct ball was " + randomBallNumber;
//             }
//         $scope.IsVisible = false;    
//     }

//     $scope.reloadPage = function() {

//         location.reload();
//     }



// }]);

var ballGameApp=angular.module("ballGameApp",[]);ballGameApp.controller("ballGameController",["$scope",function(t){const o=Math.floor(50*Math.random()+1);t.noOfAttempts=4,t.IsVisible=!0,t.showRules=!0,t.disableBtn=!1,console.log(o),t.range=function(){for(var t=[],o=1;o<51;o+=1)t.push(o);return t},t.checkButton=function(e){if(t.showRules=!1,0!=t.noOfAttempts--){if(e.target.id==o)return $("#"+e.target.id).css("backgroundColor","#1B4BFF"),void t.checkForResult(!0);e.target.id>o?$("#"+e.target.id).css("backgroundColor","#28B463 "):e.target.id<o&&$("#"+e.target.id).css("backgroundColor","#FF1B1B")}alert("Attempts left: "+t.noOfAttempts),t.noOfAttempts<=0&&t.checkForResult(!1)},t.checkForResult=function(e){1==e?(t.gameResult="WINNER!!!!",t.disableBtn=!0):($("#"+o).css("backgroundColor","#1B4BFF"),t.gameResult="Sorry You Lost the game. Correct ball was "+o),t.IsVisible=!1},t.reloadPage=function(){location.reload()}}]);