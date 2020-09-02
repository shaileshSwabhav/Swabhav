$(document).ready(function() {

    $('#submit').on('click', function(){

        const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";
        let isMale;
        let studentName = $('#studentName').val();
        let rollno = $('#rollNo').val();
        let studentAge = $('#age').val();
        let studentEmail = $('#email').val();
        let dob = $('#date').val();
        let gender = $('#isMale').val();

        gender = ((gender == 'Male' ? true : false));

        let studentDetails = {
            rollNo: rollno,
            name: studentName,
            age: studentAge,
            email: studentEmail,
            date: dob,
            isMale: gender
        };

        $.ajax({
            method: 'post',
            url: url,
            data: studentDetails,
            dataType: 'json',
            success: function() {
                console.log("SUCCESS");
                alert("Student Details Added!!!")
            },
            error: function(err) {
                console.log(err);
            }
        });

    }); //end of button listner


});