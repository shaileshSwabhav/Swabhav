$(document).ready(function() {
    const time = moment().format('MM D YYYY hh:mm:ss');
    var taskNumber = localStorage.length;
    $('body').append('<div id="undone">');
    $('body').append('<div id="done">');
    $('#undone').append('<p id="undonePara">');
    $('#done').append('<p id="donePara">');

    $('#undonePara').text("Undone Task: ");

    // task from localstorage
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            // addTask(key, true);
            displayTask(key, true);

            //checkbox event
            $('.'+key).on('click', function(event) {
                removeTask(event);
            });
        }
    }

    // new task   
    $('#addTask').on('click', function() {
        let classname = 'Task' + ++taskNumber;
        addTask(classname);

        //checkbox event
        $('.'+classname).on('click', function(event) { 
            removeTask(event);
        });
    });


    function addTask(classname) {

        localStorage.setItem(($("#task").val()), time);
        displayTask(classname, false);
        // console.log(time);
    }

    function removeTask(event) {
 
        //remove from undone list
        if(confirm("Do you want to delete?")) {
            $("." + $(event.target).attr('class')).remove();
            $("#" + $(event.target).attr('class')).remove();

            localStorage.removeItem($(event.target).attr('class'));
        }
    }

    function displayTask(classname, isFromLocalstorage) {

        // console.log(moment().format('MM D YYYY, hh:mm:ss'));

        $('#undonePara').append('<br>');
        $("#undonePara").append('<label id="'+ classname +'">');
        $('#undonePara').append("<input type='button' class='" + classname + "' value= Remove Task>");

        // console.log(currentDate);
        if(isFromLocalstorage == false) {
            let taskAddedTime = moment(time);
            let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
            let compare = moment.duration(taskAddedTime.diff(currentTime));
            let timeDifference = compare.humanize(true);
            $("#"+classname).text($("#task").val() + " " + timeDifference); 

        } else {
            let taskAddedTime = moment(localStorage.getItem(classname));
            let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
            let compare = moment.duration(taskAddedTime.diff(currentTime));
            let timeDifference = compare.humanize(true);

            $("#"+classname).text(classname + " " + timeDifference);
        }
    }
});