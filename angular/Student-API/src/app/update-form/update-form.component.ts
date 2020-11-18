import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from "@angular/forms";
import { Router } from '@angular/router';

import { StudentDTOService } from '../student-dto.service';

@Component({
  selector: 'app-update-form',
  templateUrl: './update-form.component.html',
  styleUrls: ['./update-form.component.css']
})
export class UpdateFormComponent implements OnInit {

  studentDetails= [];
  studentID;
  studentName: string;
  rollNo: number;
  age: number;
  email: string;
  date: string;
  gender;

  //reactive or model driven form
  updateStudentModel: FormGroup;

  constructor( private studentDto: StudentDTOService, private formBuilder: FormBuilder, private router: Router  ) {
    
    
    this.getStudentDetails();

    this.updateStudentModel = formBuilder.group({
      stdName: [this.studentName, Validators.required],
      stdRollNo: ['', Validators.required],
      stdAge: ['', Validators.required],
      stdEmail: ['', [Validators.required, Validators.email, 
                      Validators.pattern('^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$')]],
      stdDate: ['', Validators.required],
      stdGender: ['', Validators.required],
    });

  }

  ngOnInit(): void {
  }

  get f() { 
    return this.updateStudentModel.controls; 
  }

  get verifyEmail() {
    return this.updateStudentModel.get('stdEmail');
  }

  isValidInput(fieldName): boolean {
    return this.updateStudentModel.controls[fieldName].invalid &&
      (this.updateStudentModel.controls[fieldName].dirty || this.updateStudentModel.controls[fieldName].touched);
}

  getStudentDetails = function() {

    this.studentID = localStorage.getItem('studentID');
    localStorage.removeItem('studentID');

    this.studentDto.getStudentDetails(this.studentID)
    .subscribe(response => {

      this.studentName = response[0].name;
      this.rollNo = response[0].rollNo;
      this.age = response[0].age;
      this.email = response[0].email;
      this.date = response[0].date;
      this.gender = (response[0].isMale == true) ? "Male": "Female";

    }, 
    e => {
      console.log(e);  
    })
  }

  updateStudent(updateStudentModel: any) {
    console.log(updateStudentModel.controls.stdName.value);

    this.studentDto.updateExisitingStudent(this.studentID, {
      "rollNo": updateStudentModel.controls.stdRollNo.value,
      "name": updateStudentModel.controls.stdName.value,
      "age": updateStudentModel.controls.stdAge.value,
      "email": updateStudentModel.controls.stdEmail.value,
      "date": updateStudentModel.controls.stdDate.value,
      "isMale": updateStudentModel.controls.stdGender.value == "Male" ? true: false,
    })
    .subscribe(res => {

      setTimeout(() => {
        alert("Details successfully updated");
        this.router.navigateByUrl('');
      }, 100);

    },
    e => {
      console.log(e);
      
    })
    
  }

}
