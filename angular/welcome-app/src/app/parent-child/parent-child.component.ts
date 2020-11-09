import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-child',
  templateUrl: './parent-child.component.html',
  styleUrls: ['./parent-child.component.css'],
})
export class ParentChildComponent implements OnInit {

  onColor;
  offColor;
  bgColor = "black";
  constructor() { }

  ngOnInit(): void {    
  }

  stateChangeHandler = function(event) {
    console.log(event);
    this.bgColor = event;
  }

}
