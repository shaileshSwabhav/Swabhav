import { Component, OnInit } from '@angular/core';

import { StudentDTOService } from '../student-dto.service';

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent implements OnInit {

  studentDetails = [];

  constructor(private studentDto: StudentDTOService) { }

  ngOnInit(): void {

    this.studentDto.getStudentDetails()
    .subscribe(res => {
      this.studentDetails = res;
      for (let i = 0; i < this.studentDetails.length; i++) {
        this.studentDetails[i].isMale =  this.studentDetails[i].isMale == true? "Male": "Female";
      }
      console.log(this.studentDetails);
    }, 
    e => {
      console.log(e);
      
    })
  }

  deleteStudent = function(studentID) {

    if(confirm("Are you sure you want to delete student?")) {
      console.log(studentID);
      this.studentDto.deleteStuden(studentID)
      .subscribe(res=> {
        this.ngOnInit();
      })
    }
    
  }

}
