import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProductDataService {

  constructor(private httpService: HttpClient) { }

  getProductList() {
    return this.httpService.get('/assets/json/products.json');
  }

}
