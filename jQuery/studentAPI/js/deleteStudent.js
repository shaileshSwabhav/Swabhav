function deleteStudentFromList(studentID) {
    console.log(studentID);

    const url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + studentID;

    connectToApi(url, 'delete');

    setTimeout(function() {
        location.reload(true);
    }, 500);
}