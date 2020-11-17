import { Component, OnInit } from '@angular/core';
import { LoggerService } from '../logger.service';

import { MathService } from "../math.service";

@Component({
  selector: 'sw-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})
export class TwoWayComponent implements OnInit {

  firstName: string;
  lastName: string ;

  constructor(private math: MathService) { }

  ngOnInit(): void {

    let result = this.math.cubeEven(4);
    console.log(result);

  }

}
