import { Routes } from "@angular/router";

import { WelcomeComponent } from "./welcome/welcome.component";
import { ProductListComponent } from "./product-list/product-list.component";
import { ProductDetailComponent } from "./product-detail/product-detail.component";
import { PagenotfoundComponent } from "./pagenotfound/pagenotfound.component";

export const routerArgs: Routes = [
    { path: 'welcome', component: WelcomeComponent },
    { path: 'productList', component: ProductListComponent },
    { path: 'productDetails', component: ProductDetailComponent },
    { path: '', redirectTo: '/welcome', pathMatch: 'full' },
    { path: '**', component: PagenotfoundComponent },
]