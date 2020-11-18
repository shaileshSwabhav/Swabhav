import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from "@angular/router";
import { HttpClientModule } from "@angular/common/http";

import { ProductModule } from "./product/product.module";

import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { appRouteConfig } from './app.routing';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    ProductModule,
    RouterModule.forRoot(appRouteConfig),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
