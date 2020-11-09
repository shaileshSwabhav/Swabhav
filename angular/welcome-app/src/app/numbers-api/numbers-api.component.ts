import { Component, OnInit } from '@angular/core';
import { NumbersApiService } from '../numbers-api-service.service';

@Component({
  selector: 'app-numbers-api',
  templateUrl: './numbers-api.component.html',
  styleUrls: ['./numbers-api.component.css']
})
export class NumbersApiComponent implements OnInit {

  constructor(private numbersService: NumbersApiService) { }

  numberInfo: string;
  ngOnInit(): void {

    this.numbersService.getNumberInfo(52)
    .subscribe(data => {
      this.numberInfo = data;
      console.log(data);
    }, 
    e => {
      this.numberInfo = e.error.text;
      console.log(e);
      
    })

  }

}
