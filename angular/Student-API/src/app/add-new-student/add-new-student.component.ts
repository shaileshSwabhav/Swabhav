import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { StudentDTOService } from '../student-dto.service';

@Component({
  selector: 'app-add-new-student',
  templateUrl: './add-new-student.component.html',
  styleUrls: ['./add-new-student.component.css']
})
export class AddNewStudentComponent implements OnInit {

  constructor(private studentDto: StudentDTOService, private router: Router ) { }

  ngOnInit(): void {
  }

  addStudent = function(studentDetails) {
    console.log(studentDetails.form.controls.date.value);
    

    if(confirm("Are you sure?")) {

      this.studentDto.addNewStudent({
        "rollNo": studentDetails.form.controls.rollNo.value,
        "name": studentDetails.form.controls.name.value,
        "age": studentDetails.form.controls.age.value,
        "email": studentDetails.form.controls.email.value,
        "date": studentDetails.form.controls.date.value,
        "isMale": studentDetails.form.controls.gender.value == "Male" ? true: false,
      })
      .subscribe(res => {
        console.log(res);
        alert("Student successfully added!");
        this.router.navigateByUrl('/home');
      },
      e => {
        console.log(e);
      });
    }



  }

}
