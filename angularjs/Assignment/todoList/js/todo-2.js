// var todoApp = angular.module("todoList", []);

// todoApp.controller("todoListController", function($scope, $rootScope) {

//     var time;
//     $scope.updateBtn = true;
//     $scope.userTaskDescription = 'Enter your task here';

//     $scope.addTask = function() {
//         const time = moment().format('MM D YYYY hh:mm:ss');
//         localStorage.setItem($scope.userTaskDescription, time);
//         $rootScope.$emit("taskFormatter", $scope.userTaskDescription, time);    
//     }

//     $rootScope.$on("taskUpdater", function(event, task) {
//         $scope.taskUpdater(task);
//     });

//     $scope.taskUpdater = function(task) {
//         $scope.updateBtn = false;
//         $scope.userTaskDescription = task;
//         time = localStorage.getItem(task);
//         localStorage.removeItem(task);
//         $("."+task.split(' ').join('')).remove();

//     }

//     $scope.update = function() {
//         localStorage.setItem($scope.userTaskDescription, time);
//         $rootScope.$emit("taskFormatter", $scope.userTaskDescription, time);

//     }

// });

// todoApp.controller('taskController', function($scope, $rootScope) {
//     $scope.id = 0;
//     $scope.tasks = [];

//     $scope.load = function () {

//         // task from localstorage
//         for(var userTaskDescription in window.localStorage) {
//             if(window.localStorage.hasOwnProperty(userTaskDescription)) {
//                 let taskTime =  localStorage.getItem(userTaskDescription);

//                 $scope.taskFormatter(userTaskDescription, taskTime);
//             }
//         }      
//     }

//     $scope.updateTask = function(task) {
        
//         if(confirm("Do you want to update your task?")) {
//             $rootScope.$emit('taskUpdater', task);
//         }
//     }

//     $scope.removeTask = function(task) {
//         //remove from list
//         if(confirm("Do you want to delete?")) {
//             $("."+task.split(' ').join('')).remove();
//             localStorage.removeItem(task);
//         }
//     }

//     $rootScope.$on("taskFormatter", function(event, userTaskDescription, time) {
//         $scope.taskFormatter(userTaskDescription, time);
//     });

//     $scope.taskFormatter = function (userTask, time) {
//         $scope.tasks.push({
//             'id': $scope.id++,
//             'task': userTask,
//             'taskTime': time
//         });
//     }

//     $scope.checkBoxClick = function(event, taskid) {
        
//         if (event.target.checked) {
//             console.log("Checkbox checked");
//             $('#'+taskid).css('text-decoration', 'line-through');
//             $('.'+taskid).text(moment().format('MM D YYYY hh:mm:ss'));
            
//         } else {
//             console.log("Checkbox Not checked");
//             $('#'+taskid).css('text-decoration', 'none');

//         }
//     }

// });

var todoApp=angular.module("todoList",[]);todoApp.controller("todoListController", ['$scope', '$rootScope', function(t,o) {var e;t.updateBtn=!0,t.userTaskDescription="Enter your task here",t.addTask=function() { const e=moment().format("MM D YYYY hh:mm:ss");localStorage.setItem(t.userTaskDescription,e),o.$emit("taskFormatter",t.userTaskDescription,e)},o.$on("taskUpdater",function(o,e){t.taskUpdater(e)}),t.taskUpdater=function(o) {t.updateBtn=!1,t.userTaskDescription=o,e=localStorage.getItem(o),localStorage.removeItem(o),$("."+o.split(" ").join("")).remove()},t.update=function() {localStorage.setItem(t.userTaskDescription,e),o.$emit("taskFormatter",t.userTaskDescription,e)}}]),todoApp.controller("taskController", ['$scope', '$rootScope',function(t,o) {t.id=0,t.tasks=[],t.load=function(){for(var o in window.localStorage)if(window.localStorage.hasOwnProperty(o)){let e=localStorage.getItem(o);t.taskFormatter(o,e)}},t.updateTask=function(t){confirm("Do you want to update your task?")&&o.$emit("taskUpdater",t)},t.removeTask=function(t){confirm("Do you want to delete?")&&($("."+t.split(" ").join("")).remove(),localStorage.removeItem(t))},o.$on("taskFormatter",function(o,e,a){t.taskFormatter(e,a)}),t.taskFormatter=function(o,e){t.tasks.push({id:t.id++,task:o,taskTime:e})},t.checkBoxClick=function(t,o){t.target.checked?(console.log("Checkbox checked"),$("#"+o).css("text-decoration","line-through"),$("."+o).text(moment().format("MM D YYYY hh:mm:ss"))):(console.log("Checkbox Not checked"),$("#"+o).css("text-decoration","none"))}}]);

