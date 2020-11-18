import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NumbersApiService {

  private url = "http://numbersapi.com/";

  constructor(private http: HttpClient) { }

  private options = { headers: new HttpHeaders().set('Content-Type', 'text/plain'), 
                      responseType: 'text' as 'json' };

  getNumberInfo(num): Observable<string> {
    return this.http.get<string>( this.url + num, this.options );

  }
}
