var connectToApi = function (url, method, data) {

    $.ajax({
        method: method,
        url: url,
        data: data,
        success: function(studentsDetails) {

            if (method.toLowerCase() == 'post') {
                alert("Student successfully added");
            } else if (method.toLowerCase() == 'get') {
                displayStudentDetails(studentsDetails);
            } else if (method.toLowerCase() == 'put') {
                alert("Student data updated successfully");
                location.href = '../html/studentsList.html';
            } else if(method.toLowerCase() == 'delete') {
                alert('Student data successfully deleted');
            }
        },
        error: function(err) {
            alert(err.statusText);
        }
    });
}