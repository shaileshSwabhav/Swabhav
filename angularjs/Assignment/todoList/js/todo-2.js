var todoApp = angular.module("todoList", []);

todoApp.controller("todoListController", function($scope, $rootScope) {

    $scope.addTask = function() {
        // $scope.tasks.push($scope.userTaskDescription);
        const time = moment().format('MM D YYYY hh:mm:ss');
        localStorage.setItem($scope.userTaskDescription, time);
        $rootScope.$emit("taskFormatter", $scope.userTaskDescription, time);    }

});

todoApp.controller('taskController', function($scope, $rootScope) {
    $scope.id = 0;
    $scope.tasks = [];

    $scope.load = function () {

        // task from localstorage
        for(var userTaskDescription in window.localStorage) {
            if(window.localStorage.hasOwnProperty(userTaskDescription)) {
                let taskTime =  localStorage.getItem(userTaskDescription);

                $scope.taskFormatter(userTaskDescription, taskTime);

            }
        }      
    }

    $scope.removeTask = function (task) {

        //remove from list
        if(confirm("Do you want to delete?")) {
            $("."+task).remove();
            localStorage.removeItem(task);
        }
    }

    $rootScope.$on("taskFormatter", function(event, userTaskDescription, time) {
        $scope.taskFormatter(userTaskDescription, time);
    });

    $scope.taskFormatter = function (userTask, time) {
        $scope.tasks.push({
            'id': $scope.id++,
            'task': userTask,
            'taskTime': time
        });
    }

    $scope.checkBoxClick = function(event, taskid) {
        
        if (event.target.checked) {
            console.log("Checkbox checked");
            $('#'+taskid).css('text-decoration', 'line-through');
            $('.'+taskid).text(moment().format('MM D YYYY hh:mm:ss'));
            
        } else {
            console.log("Checkbox Not checked");
            $('#'+taskid).css('text-decoration', 'none');

        }
    }

});