import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {

  constructor() { }

  log(text:any) {
    console.log('inside LoggerService ' + text);
    console.log(text);
    

  }
}
