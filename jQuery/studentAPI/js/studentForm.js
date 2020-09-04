$(document).ready(function() {

    $('form').on('submit', function(event) {

        event.preventDefault();
        
        let studentDetails;
        let studentName;
        let rollno;
        let studentAge;
        let studentEmail;
        let dob;
        let gender;

        const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

        $('#fieldNotEntered').remove();

        // vaildateFormDetails("studentName");

        if(vaildateFormDetails("studentName") &&
            (vaildateFormDetails("rollNo")) &&
            (vaildateFormDetails("age")) &&
            (vaildateFormDetails("email")) && 
            (vaildateFormDetails("date"))) {

            studentName = $('#studentName').val();
            rollno = $('#rollNo').val();
            studentAge = $('#age').val();
            studentEmail = $('#email').val();
            dob = $('#date').val();
            gender = $('#isMale').val();

            gender = ((gender == 'Male' ? true : false));

            studentDetails = {
                rollNo: rollno,
                name: studentName,
                age: studentAge,
                email: studentEmail,
                date: dob,
                isMale: gender
            };
    
            connectToApi(url, "POST", studentDetails);

            return true;
        }

    }); //end of button listner


});

function vaildateFormDetails(elementID) {

    if($('#' + elementID).val() == "") {
        $('#' + elementID).after('<span id="fieldNotEntered"> Please enter student name</span>');
        $('span').css('color', 'red');

        return false;
    } else {
        return true;
    }

}