import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-star-rating',
  templateUrl: './star-rating.component.html',
  styleUrls: ['./star-rating.component.css']
})
export class StarRatingComponent implements OnInit {

  rating;
  currentRating: number = 3.5;

  constructor() { }

  ngOnInit(): void {
    
  }

  onMouseOverHandler = function(event) {
    console.log("Mouseover: " + this.currentRating);
  }

}
