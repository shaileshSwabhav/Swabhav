var todoApp = angular.module("todoList", []);

$('#undone').append('<ul id="undonePara">');

todoApp.controller("todoListController", function($scope, $rootScope) {

    // $scope.priority = {taskPriority : 0}

    $scope.addTask = function() {
        const userTask = [$scope.userTaskDescription, $scope.priority.taskPriority];
        $scope.addTaskToLocalStorage(userTask);

    }

    $scope.addTaskToLocalStorage = function (userTaskDescription) {
        const time = moment().format('MM D YYYY hh:mm:ss');
        localStorage.setItem(userTaskDescription, time);
        $rootScope.$emit("displayTask", userTaskDescription, time);
    }

});

todoApp.controller('taskController', function($scope, $rootScope) {

    $scope.taskIndex = 0;
    $scope.priorityIndex = 1;

    $scope.load = function () {
        // task from localstorage
        for(var userTaskDescription in window.localStorage) {
            if(window.localStorage.hasOwnProperty(userTaskDescription)) {
                let taskTime =  localStorage.getItem(userTaskDescription);
                userTaskDescription = userTaskDescription.split(',');

                $scope.displayTask(userTaskDescription, taskTime);
            }
        }      
    }

    $rootScope.$on("displayTask", function(event, userTaskDescription, time) {
        $scope.displayTask(userTaskDescription, time);
    });

    $scope.calculateTimeDifference = function(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
    }

    $scope.removeTask = function (event, userTask) {
 
        //remove from undone list
        if(confirm("Do you want to delete?")) {
            $("." + $(event.target).attr('class')).remove();
            $("#" + $(event.target).attr('class')).remove();
            localStorage.removeItem(userTask);
        }
    }

    $scope.displayTask = function (userTask, time) {

        let timeDifference = $scope.calculateTimeDifference(time);

        $scope.userTaskName = userTask[$scope.taskIndex].split(' ').join('');
        
        if(userTask[$scope.priorityIndex] == '1') {
            $('<li class="taskClass" id="'+ userTaskName +'">' + 
            userTask[$scope.taskIndex] + '<span>' + " task added at "  + time + " " + timeDifference + '</span></li>').prependTo('ul');
            
            $('#'+userTaskName).append("<button id='btn' class='" + userTaskName + "'>Remove Task</button>");
    
        } else if(userTask[$scope.priorityIndex] == '0') {
            $("#undonePara").append('<li class="taskClass" id="'+ userTaskName +'">' + 
            userTask[$scope.taskIndex] + '<span>' + " task added at "  + time + " " + timeDifference + '</span></li>');
    
            $('#'+userTaskName).append("<button id='btn' class='" + userTaskName + "'>Remove Task</button>");
    
        }
    
        //button event
        $('.'+ userTaskName).on('click', function(event) {
            $scope.removeTask(event, userTask);
        });
    }


});


    