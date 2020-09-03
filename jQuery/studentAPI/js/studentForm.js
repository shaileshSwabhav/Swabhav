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

        if($('#studentName').val() == "") {
            $('#studentName').after('<span id="fieldNotEntered"> Please enter student name</span>');
            $('span').css('color', 'red');

            return false;
        } else if($('#rollNo').val() == "") {
            $('#rollNo').after('<span id="fieldNotEntered"> Please enter students roll no</span>');
            $('span').css('color', 'red');

            return false;
        } else if($('#age').val() == "") {
            $('#age').after('<span id="fieldNotEntered"> Please enter students age</span>');
            $('span').css('color', 'red');

            return false;
        } else if($('#email').val() == "") {
            $('#email').after('<span id="fieldNotEntered"> Please enter students email</span>');
            $('span').css('color', 'red');

            return false;
        } else if($('#date').val() == "") {
            $('#date').after('<span id="fieldNotEntered"> Please enter students dob</span>');
            $('span').css('color', 'red');

            return false;
        } else {
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

            return true;
        }



    }); //end of button listner

});