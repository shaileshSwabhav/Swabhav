import { Component, OnInit } from '@angular/core';

import { ProductDataService } from "../product-data.service";

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  products;
  productID;
  name;
  code;
  description;
  availability;
  price;
  imgUrl;
  rating;

  constructor(private _productList: ProductDataService) { }

  ngOnInit(): void { 

    this.productID = localStorage.getItem('productID');
    this.getProductDetails();
  }

  getProductDetails = function() {
   
    this._productList.getProductList()
    .subscribe(result => {
      for (let i = 0; i < result.length; i++) {
        if(result[i].productId == this.productID) {
          console.log(result[i]);
          this.products = result[i];
          this.name = result[i].productName;
          this.code = result[i].productCode;
          this.description = result[i].description;
          this.availability = result[i].releaseDate;
          this.price = result[i].price;
          this.imgUrl = result[i].imageUrl;
          this.rating = result[i].starRating;
          
        }
      }
    });    

  }

}
