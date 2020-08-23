$(document).ready(function() {
    let priority = 0;
    const TASK = 0;
    const PRIORITY = 1;
    let x = 0;

    $('body').append('<div id="undone">');
    $('#undone').append('<ul id="undonePara">');

    // task from localstorage
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            let previousKey =  localStorage.getItem(key);
            key = key.split(',');
            displayTask(key, previousKey);
        }
    }
    $('#highPriority').change(function() {
        priority = $('#highPriority').val();
    });

    $('#lowPriority').change(function() {
        priority = $('#lowPriority').val();
    });

    // new task   
    $('#addTask').on('click', function() {
    const userTask = [($("#task").val()), priority];
       addTask(userTask);
    });


    function addTask(userTask) {
        const time = moment().format('MM D YYYY hh:mm:ss');
        localStorage.setItem(userTask, time);
        displayTask(userTask, time);
    }

    function displayTask(userTask, time) {

        let timeDifference = calculateTimeDifference(time);

        if(userTask[PRIORITY] == '1') {
            $('<li class="task" id="'+ userTask[TASK] +'"> ' + 
            userTask[TASK] + " task added at "+ time + " " + timeDifference + '</li>').prependTo('ul');
   
            $('#'+userTask[TASK]).append("<button id='btn' class='" + userTask[TASK] + "'>Remove Task</button>");

        } else if(userTask[PRIORITY] == '0') {
            $("#undonePara").append('<li class="task" id="'+ userTask[TASK] +'"> ' + 
            userTask[TASK] + " task added at "+ time + " " + timeDifference + '</li>');
            $('#'+userTask[TASK]).append("<button id='btn' class='" + userTask[TASK] + "'>Remove Task</button>");

        }
        
        //button event
        $('.'+userTask[TASK]).on('click', function(event) { 
            removeTask(event, userTask);
        });

    }

    function removeTask(event, userTask) {
 
        //remove from undone list
        if(confirm("Do you want to delete?")) {
            $("." + $(event.target).attr('class')).remove();
            $("#" + $(event.target).attr('class')).remove();
            localStorage.removeItem(userTask);
        }
    }

    function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
    }



});