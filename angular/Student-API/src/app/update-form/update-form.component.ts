import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-form',
  templateUrl: './update-form.component.html',
  styleUrls: ['./update-form.component.css']
})
export class UpdateFormComponent implements OnInit {

  studentName: string;
  gender: string = "Male";

  constructor() { }

  ngOnInit(): void {
  }

}
