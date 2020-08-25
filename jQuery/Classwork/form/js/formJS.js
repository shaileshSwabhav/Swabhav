$(document).ready(function() {


    $('#submit').on('click', function() {
        $('#wrongUsername').remove();
        $('#wrongPssd').remove();

        if ($('#userName').val() == "") {
            $('#userName').after('<span id="wrongUsername"> Please enter username</span>');
            $('span').css('color', 'red');

            return false;
        }
        if ($('#pssd').val() == "") {
            $('#pssd').after('<span id="wrongPssd"> Please enter password</span>');
            $('span').css('color', 'red');

            return false;
        }

        if($('#userName').val() != "" && $('#pssd').val() != "") {
            var name = $('#userName').val();
            
            $("body").append('<p>');
            $('p').text("Welcome " + name);          
            
            return true;
        }

    });
});