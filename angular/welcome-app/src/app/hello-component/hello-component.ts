import { Component } from '@angular/core';

@Component({
  selector: 'app-hello-component',
  templateUrl: './hello-component.html',
  styleUrls: ['./hello-component.css']
})
export class HelloComponent {

  message; String;
  constructor() {
    this.message = "Welcome to angular 6 components"
  }
}
