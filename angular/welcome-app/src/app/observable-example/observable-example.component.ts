import { Component, OnInit } from '@angular/core';
import { MathObservableSeviceService } from "../math-observable-sevice.service";

@Component({
  selector: 'app-observable-example',
  templateUrl: './observable-example.component.html',
  styleUrls: ['./observable-example.component.css']
})
export class ObservableExampleComponent implements OnInit {

  squaredNum: number;
  constructor(private service: MathObservableSeviceService) { }

  ngOnInit(): void {

    this.service.getSquare(0)
    .subscribe(data => {
      this.squaredNum = data;
      console.log(data);
    },
    e => {
      console.log(e);
    });

    () => {
      console.log("completed");
      
    }
  }

}
