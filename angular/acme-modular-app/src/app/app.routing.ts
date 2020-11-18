import {Routes } from "@angular/router";

import { WelcomeComponent } from "./welcome/welcome.component";

export const appRouteConfig: Routes = [
    { path: 'welcome', component: WelcomeComponent },
    { path: '', redirectTo: '/welcome', pathMatch: "full" },
    { path: '**', component: WelcomeComponent },

]