function addNewStudent(studentInfo) {

        console.log($('#studentsData'));

        $('#studentsData').append('<tr id= "'+studentInfo.ID+'"><td>' +studentInfo.ID +'</td>' +
        '<td>' +studentInfo.name+'</td>'+
        '<td>' +studentInfo.age+'</td>'+
        '<td>' +studentInfo.gender+'</td>' +
        '<td><button id="'+studentInfo.ID+'" class="student">Delete</td></tr>'
        );

}

$(".student").on('click', function(event) {
        removeStudent(event.target.id);
        alert("Student deleted successfully")
});

function removeStudent(studentID) {
        $('#'+studentID).remove();
}
