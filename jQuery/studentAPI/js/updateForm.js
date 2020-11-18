$(document).ready(function() {

    $("#date").datepicker({ dateFormat: "dd-m-yy" });

    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + sessionStorage.getItem('studentApiKey')
    connectToApi(url, 'get');

    $('form').on('submit', function(event) {

        event.preventDefault();
        
        let updatedStudentDetails;
        let studentName;
        let rollno;
        let studentAge;
        let studentEmail;
        let dob;
        let gender;

        $('#fieldNotEntered').remove();

        if(vaildateFormDetails("studentName") &&
            (vaildateFormDetails("rollNo")) &&
            (vaildateFormDetails("age")) &&
            (vaildateFormDetails("email"))) {

            studentName = $('#studentName').val();
            rollno = $('#rollNo').val();
            studentAge = $('#age').val();
            studentEmail = $('#email').val();
            dob = $('#date').val();
            gender = $("input[type='radio']:checked").val();
            
            gender = ((gender == 'Male' ? true : false));

            updatedStudentDetails = {
                rollNo: rollno,
                name: studentName,
                age: studentAge,
                email: studentEmail,
                date: dob,
                isMale: gender
            };
    
            connectToApi(url, "PUT", updatedStudentDetails);
            return true;
        }

    });

});

function vaildateFormDetails(elementID) {

    if($('#' + elementID).val() == "") {
        $('#' + elementID).after('<span id="fieldNotEntered"> Please enter '+elementID+'</span>');
        $('span').css('color', 'red');

        return false;
    } else {
        return true;
    }
}

function displayStudentDetails(studentDetails) {

    $('#studentName').attr('value', studentDetails[0].name);
    $('#rollNo').attr('value', studentDetails[0].rollNo);
    $('#age').attr('value', studentDetails[0].age);
    $('#email').attr('value', studentDetails[0].email);
    $('#date').attr('value', studentDetails[0].date);
    if(studentDetails[0].isMale == true) {
        $('#male').prop('checked', true);
    } else {
        $('#female').prop('checked', true);
    }

}