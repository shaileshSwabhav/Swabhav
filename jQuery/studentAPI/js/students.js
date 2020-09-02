$(document).ready(function() {

    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

    $.ajax({
        method: 'get',
        url: url,
        dataType: 'json',
        success: function(studentsDetails) {
            displayStudentDetails(studentsDetails);
        },
        error: function(err) {
            console.log(err.statusText);
        }
    });

    function displayStudentDetails(studentsDetails) {
        // console.log(studentsDetails[0]);

        for(let i=0; i < studentsDetails.length; i++) {
            console.log(studentsDetails[i]);
            $('.students').append(
                '<tr><td>' + studentsDetails[i].id + '</td>' +
                '<td>' + studentsDetails[i].rollNo + '</td>' +
                '<td>' + studentsDetails[i].name + '</td>' +
                '<td>' + studentsDetails[i].age + '</td>' +
                '<td>' + studentsDetails[i].email + '</td>' +
                '<td>' + studentsDetails[i].date + '</td>' +
                '<td>' + studentsDetails[i].isMale + '</td></tr>'
            );
        }
    }

});