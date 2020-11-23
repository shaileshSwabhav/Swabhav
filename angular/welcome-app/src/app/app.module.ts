import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";

import { HelloComponent } from "./hello-component/hello-component";
// import { StarRatingComponent } from './star-rating/star-rating.component';
// import { StarComponent } from "./star-rating/star/star.component";

@NgModule({
  declarations: [
    HelloComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [HelloComponent]
})
export class AppModule { }