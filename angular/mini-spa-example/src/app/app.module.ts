import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from "@angular/router";

import { routeArgs } from "./routingConfig";
import { AppComponent } from './app.component';
import { CareerComponent } from './career/career.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ServiceComponent } from './service/service.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    CareerComponent,
    HomeComponent,
    AboutComponent,
    ServiceComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routeArgs),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
