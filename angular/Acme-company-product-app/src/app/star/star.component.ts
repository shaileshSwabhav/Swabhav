import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-star-rating, [app-star-rating]',
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
