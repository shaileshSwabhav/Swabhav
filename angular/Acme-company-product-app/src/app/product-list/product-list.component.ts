import { Component, OnInit } from '@angular/core';
import { ProductDataService } from '../product-data.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  btnValue = "Show Image";
  showImage = true;
  rating;
  products;
  productID: number;
  productName: string;

  constructor(private productList: ProductDataService) { }

  ngOnInit(): void {

    this.productList.getProductList()
    .subscribe(result => {
      this.products = result;
    })
    
  }

  showProductImage = function() {
    if(this.btnValue == "Show Image") {
      this.btnValue = "Hide Image";
      this.showImage = false;
    } else {
      this.btnValue = "Show Image";
      this.showImage = true;
    }
  }

  setProductID = function(productId) {
    localStorage.setItem('productID', productId);
  }

  searchProduct = function() {
    
    if(this.productName != "") {
      this.products = this.products.filter(res => {
        return res.productName.toLowerCase().match(this.productName.toLowerCase());
      })
    } else {
      this.ngOnInit();
    }



  }

}
