$(document).ready(function() {
    const taskNumber = localStorage.length;
    $('body').append('<div id="undone">');
    $('body').append('<div id="done">');
    $('#undone').append('<p id="undonePara">');
    $('#done').append('<p id="donePara">');

    $('#undonePara').text("Undone Task: ");

    // task from localstorage
    for(var key in window.localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            console.log(localStorage.getItem(key));

            $('#undonePara').append('<br>')
            $('#undonePara').append("<input type='checkbox' class='" + key + "' value= '"+localStorage.getItem(key)+"'>");
            $("#undonePara").append('<label id="'+ key +'">');

            $("#"+key).text(localStorage.getItem(key));

            //checkbox event
            $('.'+key).on('change', function(event) {
                checkboxEvent(event);
            });
        }
    }

    // new task   
    $('#addTask').on('click', function() {
        let task = $("#task").val();
        let classname = 'Task' + ++taskNumber;

        $('#undonePara').append('<br>')
        $('#undonePara').append("<input type='checkbox' class='" + classname + "' value= '"+task+"'>");
        $("#undonePara").append('<label id="'+ classname +'">');

        localStorage.setItem(classname, task);

        $("#"+classname).text($("#task").val());

        //checkbox event
        $('.'+classname).on('change', function(event) { 
            checkboxEvent(event);
        });
    });

    function checkboxEvent(event) {
        
        //current date
        var date = new Date();
        var currentDate = (date.getDate() + "/"
        + (date.getMonth()+1)  + "/" 
        + date.getFullYear() + " @ "  
        + date.getHours() + ":"  
        + date.getMinutes() + ":" 
        + date.getSeconds());

        var taskName = localStorage.getItem($(event.target).attr('class')) + currentDate;
        $('#donePara').text('Completed Task:');
        $('#done').append('<p id="' + $(event.target).attr('class') + '">' + taskName +'</p>');
        
        //remove from undone list
        $("." + $(event.target).attr('class')).remove();
        $("#" + $(event.target).attr('class')).remove();

        localStorage.removeItem($(event.target).attr('class'));

    }
});