import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';

import { IStudentDTO } from "./IStudentDTO"; 

@Injectable({
  providedIn: 'root'
})
export class StudentDTOService {

  url = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

  constructor(private http: HttpClient) { }

  getStudentDetails(studentID?: number): Observable<IStudentDTO[]> {

    if(studentID == undefined) {
      return this.http.get<IStudentDTO[]>(this.url);
    } else {
      return this.http.get<IStudentDTO[]>(this.url + studentID);
    }

  }

  addNewStudent(studentDetails): Observable<IStudentDTO> {

    let studentJSON: string = JSON.stringify(studentDetails);
    let httpHeaders = new HttpHeaders( { 'Content-type': 'application/json; charset=utf-8'} );

    console.log(studentJSON);

    return this.http.post<IStudentDTO>(this.url, studentJSON, {'headers': httpHeaders} );

  }

  // updateExisitingStudent(studentID: number): Observable<IStudentDTO> {

  // } 

  deleteStuden(studentID: number): Observable<IStudentDTO> {
    console.log(studentID);
    
    return this.http.delete<IStudentDTO>(this.url + studentID);
  }

}
