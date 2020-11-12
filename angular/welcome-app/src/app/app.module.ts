import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";

import { StarRatingComponent } from './star-rating/star-rating.component';
import { StarComponent } from "./star-rating/star/star.component";

@NgModule({
  declarations: [
    StarRatingComponent,
    StarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [StarRatingComponent]
})
export class AppModule { }