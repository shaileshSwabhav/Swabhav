import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-star, [app-star]',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {

  @Input() rating;
  maxRating = 5;
  
  constructor() { }

  ngOnInit(): void {
    console.log(this.rating);
  }

}