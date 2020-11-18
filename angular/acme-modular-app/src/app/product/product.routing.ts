import { Routes } from "@angular/router";

import { ProductListComponent } from "./product-list/product-list.component";
import { ProductDetailsComponent } from './product-details/product-details.component';

export const productRoutesArgs: Routes = [
    { path: "productList", component: ProductListComponent },
    { path: "productDetails", component: ProductDetailsComponent }
]