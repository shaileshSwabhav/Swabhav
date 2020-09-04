function getStudentID(studentID) {
    
    sessionStorage.setItem('studentApiKey', studentID);
    location.href = '../html/updateStudent.html';

}