$(document).ready(function() {

    $('#submit').on('click', function(event) {

        event.preventDefault();
        
        var studentInfo = {
            ID: $('#studentId').val(),
            name: $('#studentName').val(),
            age: $('#studentAge').val(),
            gender: $('#gender').val(),
        };
        addNewStudent(studentInfo);
        alert("Student added successfully")

    });

    $('#update').on('click', function(event) {

        event.preventDefault();

        var input, table, tr, td, i;
        input = document.getElementById("studentId").value;
        table = document.getElementById("studentsData");
        tr = table.getElementsByTagName("tr");

        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[0];

            if (td) {

                txtValue = td.textContent || td.innerText;
                if (txtValue.indexOf(input) > -1) {

                    removeStudent($('#studentId').val());
                    alert("Student Removed Successfully")

                    var studentInfo = {
                        ID: $('#studentId').val(),
                        name: $('#studentName').val(),
                        age: $('#studentAge').val(),
                        gender: $('#gender').val(),
                    };
  
                  addNewStudent(studentInfo);
                  alert("Student updated successfully")

                } else {
                  alert("Student not found");
                }


            }    
        }
    });


});

// direct delete - ask using popup
// yes 
// vahape dala hu bt yaha pe daalna bhul gaya
// yes mam samjha
// ok