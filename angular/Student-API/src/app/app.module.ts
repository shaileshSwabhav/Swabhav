import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from "@angular/router";
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from "@angular/forms";
import { ReactiveFormsModule } from "@angular/forms";

import { routeArgs } from "./routeConfig";
import { AppComponent } from './app.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { UpdateFormComponent } from './update-form/update-form.component';
import { AddNewStudentComponent } from './add-new-student/add-new-student.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentDetailsComponent,
    UpdateFormComponent,
    AddNewStudentComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routeArgs),
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
