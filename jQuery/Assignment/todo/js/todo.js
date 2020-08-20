$(document).ready(function() {
    const time = moment().format('MM D YYYY hh:mm:ss');
    var taskNumber = localStorage.length;
    $('body').append('<div id="undone">');
    $('#undone').append('<p id="undonePara">');

    $('#undonePara').text("Undone Task: ");

    // task from localstorage
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            displayTask(key, true);
        }
    }

    // new task   
    $('#addTask').on('click', function() {
        let classname = 'Task' + ++taskNumber;
        addTask(classname);
    });


    function addTask(classname) {
        // const time = moment().format('MM D YYYY hh:mm:ss');

        localStorage.setItem(($("#task").val()), time);
        displayTask(classname, false);
    }

    function displayTask(classname, isFromLocalstorage) {

        $('#undonePara').append('<br><br>');

        // console.log(currentDate);
        if(isFromLocalstorage == false) {
            let timeDifference = calculateTimeDifference(time);
            $("#undonePara").append('<label id="'+ classname +'"> ' + 
            $("#task").val() + " task added at "+ time + " " + timeDifference + '</label>');
            // $("#"+classname).text($("#task").val() + " task added at " + time + " " + timeDifference); 

        } else {
            let timeDifference = calculateTimeDifference(localStorage.getItem(classname));
            $("#undonePara").append('<label id="'+ classname +'"> '+ classname +
            " task added at " + localStorage.getItem(classname) + " " + timeDifference + '</label>');
        }
        // $('#undonePara').append("<input type='button' class='" + classname + "' value= 'Remove Task'>");
        $('#undonePara').append("<button class='" + classname + "'>Remove Task</button>");

        $('.'+classname).on('click', function(event) { 
            console.log('hello');
            removeTask(event);
        });

    }

    function removeTask(event) {
 
        //remove from undone list
        if(confirm("Do you want to delete?")) {
            $("." + $(event.target).attr('class')).remove();
            $("#" + $(event.target).attr('class')).remove();

            localStorage.removeItem($(event.target).attr('class'));
        }
    }

    function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
    }
});