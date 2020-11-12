import { Component, OnInit } from '@angular/core';

import { NumbersApiService } from '../numbers-api-service.service';

import * as moment from 'moment';

@Component({
  selector: 'app-numbers-api',
  templateUrl: './numbers-api.component.html',
  styleUrls: ['./numbers-api.component.css']
})
export class NumbersApiComponent implements OnInit {

  constructor(private numbersService: NumbersApiService) { }

  displayInfo = [];

  ngOnInit(): void {

    for(var data in window.localStorage) {
      if(window.localStorage.hasOwnProperty(data)) {
        let time = localStorage.getItem(data);

        this.displayInfo.push({
          data: data,
          time: this.calculateRelativeTime(time)
        });
      }
    }

  }

  displayData = function(userInput) {    
    console.log(userInput);

    this.numbersService.getNumberInfo(userInput)
    .subscribe(data => {
      this.displayInfo.push({
        data: data,
        time: this.calculateRelativeTime(moment().format('DD-MM-YYYY hh:mm:ss'))
      });
      localStorage.setItem(data, moment().format('DD-MM-YYYY hh:mm:ss'))
    }, 
    e => {
      console.log(e);
      
    });
  }

  calculateRelativeTime = function(time) {
    let taskAddedTime = moment(time);
    let currentTime = moment(moment().format('DD-MM-YYYY hh:mm:ss'));
    let compare = moment.duration(taskAddedTime.diff(currentTime));
    return compare.humanize(true);
  }

}
