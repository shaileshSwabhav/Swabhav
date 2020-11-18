$(document).ready(function() {

    $('#submit').on('click', function() {
        if ($('#userName').val() == "") {
            $('#userName').after('<span>    Please enter username</span>');
        }
        if ($('#pssd').val() == "") {
            $('#pssd').after('<span>    Please enter password</span>');
        }

        if($('#userName').val() != "" && $('#pssd').val() != "") {
            var name = $('#userName').val();

            $("body").append('<p>');
            $('p').text("Welcome " + name);
        }

        $('span').css('color', 'red');

    });
});