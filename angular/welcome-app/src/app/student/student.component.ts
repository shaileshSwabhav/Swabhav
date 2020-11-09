import { Component, OnInit } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'sw-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})

export class StudentComponent implements OnInit {

  public student: { id: number; name: string; cgpa: number; };
  public students = [];
  public isActive = false;
  imgLoc = '../../assets/img/studentProfilePic.jpg';
  width = 10 + 'em';
  height = 10 + 'em';
  constructor() {

  }

  ngOnInit(): void {

    this.studentInfo({
      id: 101,
      name: "sam",
      cgpa: 7.3
  });
    
  this.studentsData([
      {
          id: 101,
          name: "sam",
          cgpa: 7.1
      },
      {
          id: 102,
          name: "tom",
          cgpa: 7.5
      },    
      {
          id: 103,
          name: "ben",
          cgpa: 6.2
      },
  ])

  }

  studentInfo(std: IStudent) {

    this.student = {
      id: std.id,
      name: std.name,
      cgpa: std.cgpa,
    }
    console.log(this.student);
  }

  loadstudents() {
    this.isActive = (this.isActive ? false: true);

  }
  
  studentsData(std : IStudent[]) {
    
    for(let s of std) {
      this.students.push({
        id: s.id,
        name: s.name,
        cgpa:s.cgpa,
      })
    }
    
    
  }

}
