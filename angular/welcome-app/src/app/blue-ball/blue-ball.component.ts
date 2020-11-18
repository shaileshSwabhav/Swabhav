import { Component, OnInit } from '@angular/core';

import { IBall } from "./IBall";

@Component({
  selector: 'sw-blue-ball',
  templateUrl: './blue-ball.component.html',
  styleUrls: ['./blue-ball.component.css']
})

export class BlueBallComponent implements OnInit {

  minBalls: number;
  maxBalls: number;
  attempts: number = 3;
  randomGeneratedNumber: number;
  gameRunning = false;
  result:string;
  ball: IBall[] = [];

  constructor() { }

  ngOnInit(): void {
    
  }

  startGame() {
    this.gameRunning = true;
    this.generateBalls();
    this.generateRandomNumber();
    console.log(this.randomGeneratedNumber);

  }

  generateRandomNumber() {
    this.randomGeneratedNumber = Math.floor(Math.random() * this.maxBalls + this.minBalls);
  }

  generateBalls() {
    this.maxBalls = 50;
    this.minBalls = 1;

    for(let i=this.minBalls; i <= this.maxBalls; i++) {
      this.ball.push({
        id: i,
        bgColor: 'grey',
        currentColor: ' grey',
        disabled: false,
      });
    }
    
  }

  checkGameResult(id) {
    console.log(id);

    if (id == this.randomGeneratedNumber) {
      this.ball[id-1].currentColor = 'blue';
      this.result = "Congrats! You have won the game"
      this.endGame();
    }


    if( this.ball[id-1].id < this.randomGeneratedNumber && this.attempts-- != 0 ) {
      this.ball[id-1].currentColor = 'red';
    } else if( this.ball[id-1].id > this.randomGeneratedNumber && this.attempts-- != 0 ) {
      this.ball[id-1].currentColor = 'green';
    }    

    if(this.attempts == 0) {
      this.result = "Sorry! You have lost the game"
      this.endGame();
    }
    
  }

  endGame() {

    for(let i=this.minBalls; i <= this.maxBalls; i++) {      
      this.ball[i-1].disabled = true;
    }
  }

}
