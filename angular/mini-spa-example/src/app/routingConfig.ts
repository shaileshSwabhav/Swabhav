import { Routes } from "@angular/router";

import { HomeComponent } from "./home/home.component";
import { ServiceComponent } from "./service/service.component";
import { CareerComponent } from "./career/career.component";
import { AboutComponent } from "./about/about.component";

export const routeArgs: Routes = [

    { path: 'home', component: HomeComponent },
    { path: 'service', component: ServiceComponent },
    { path: 'career', component: CareerComponent },
    { path: 'about', component: AboutComponent },
    { path: '', redirectTo: '/home', pathMatch: 'full'},
    // { path: '**', component: PageNotFoundComponent}
];