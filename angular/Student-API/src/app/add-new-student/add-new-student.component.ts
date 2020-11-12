import { Component, OnInit } from '@angular/core';

import { StudentDTOService } from '../student-dto.service';

@Component({
  selector: 'app-add-new-student',
  templateUrl: './add-new-student.component.html',
  styleUrls: ['./add-new-student.component.css']
})
export class AddNewStudentComponent implements OnInit {

  newStudentDetails = [];

  constructor(private studentDto: StudentDTOService) { }

  ngOnInit(): void {
  }

  addStudent = function(studentDetails) {
    console.log(studentDetails);

    if(confirm("Are you sure?")) {
      this.newStudentDetails.push({
        name: studentDetails.form.controls.name.value,
        rollNo: studentDetails.form.controls.rollNo.value,
        age: studentDetails.form.controls.age.value,
        date: studentDetails.form.controls.date.value,
        email: studentDetails.form.controls.email.value,
        gender: studentDetails.form.controls.gender.value == "Male" ? true: false,
      })
  
      this.studentDto.addNewStudent(this.newStudentDetails)
      .subscribe(res => {
        console.log(res);
        confirm("Student successfully added!");
      },
      e => {
        console.log(e);
      });
    }



  }

}
