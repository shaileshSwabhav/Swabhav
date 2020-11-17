import { NgModule } from '@angular/core';
import { RouterModule } from "@angular/router";

import { ProductListComponent } from './product-list/product-list.component';
import { SharedModule } from '../shared/shared.module';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { productRoutesArgs } from './product.routing';

@NgModule({
  declarations: [
    ProductListComponent, 
    ProductDetailsComponent
  ],
  imports: [
    RouterModule.forChild(productRoutesArgs),
    SharedModule,
  ],
  exports: [
    ProductListComponent, 
    ProductDetailsComponent
  ]
})
export class ProductModule { }
