$(document).ready(function() {

    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

    connectToApi(url, 'GET');

});

function displayStudentDetails(studentsDetails) {

    for(let i=0; i < studentsDetails.length; i++) {

        $('.students').append(
            '<tr><td>' + studentsDetails[i].id + '</td>' +
            '<td>' + studentsDetails[i].rollNo + '</td>' +
            '<td>' + studentsDetails[i].name + '</td>' +
            '<td>' + studentsDetails[i].age + '</td>' +
            '<td>' + studentsDetails[i].email + '</td>' +
            '<td>' + studentsDetails[i].date + '</td>' +
            '<td>' + (studentsDetails[i].isMale?"Male":"Female") + '</td>' +
            '<td><input type="button" id="'+studentsDetails[i].id+'" onclick="getStudentID(this.id)" value="Update" /></td>' +
            '<td><input type="button" id="'+studentsDetails[i].id+'" onclick="deleteStudentFromList(this.id)" value="Delete" /></td></tr>' 
        );

    }
}