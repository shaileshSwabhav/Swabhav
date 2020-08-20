$(document).ready(function() {
    var undoneList = [];

    var taskNumber = localStorage.length;
    $('body').append('<div id="undone">');
    $('body').append('<div id="done">');
    $('#undone').append('<p id="undonePara">');
    $('#done').append('<p id="donePara">');

    $('#undonePara').text("Undone Task: ");

    // task from localstorage
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            addTask(event, key, true);

            //checkbox event
            $('.'+key).on('click', function(event) {
                removeTask(event);
            });
        }
    }

    // new task   
    $('#addTask').on('click', function() {
        let classname = 'Task' + ++taskNumber;
        addTask(event, classname, false);

        //checkbox event
        $('.'+classname).on('click', function(event) { 
            removeTask(event);
        });
    });


    function addTask(event, classname, isFromLocalstorage) {

        $('#undonePara').append('<br>');
        $("#undonePara").append('<label id="'+ classname +'">');
        $('#undonePara').append("<input type='button' class='" + classname + "' value= Remove Task>");

        displayTask(classname, isFromLocalstorage);
    }

    function removeTask(event) {
 
        //remove from undone list
        $("." + $(event.target).attr('class')).remove();
        $("#" + $(event.target).attr('class')).remove();

        undoneList.splice(undoneList.indexOf(localStorage.getItem($(event.target).attr('class'))), 1);
        console.log(undoneList);
        localStorage.removeItem($(event.target).attr('class'));
    }

    function displayTask(classname, isFromLocalstorage) {

        var date = new Date();
        var currentDate = (date.getFullYear() + "-"
        + (date.getMonth()+1)  + "-" 
        + date.getDate());

        if(isFromLocalstorage == false) {
            undoneList.push(($("#task").val()));
            localStorage.setItem(classname, ($("#task").val()));
            $("#"+classname).text($("#task").val() + " " + moment().fromNow());    
        } else {
            undoneList.push(localStorage.getItem(classname));
            $("#"+classname).text(localStorage.getItem(classname) + " " + moment().fromNow());
        }
    }
});