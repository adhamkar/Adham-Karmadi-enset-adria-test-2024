import { Component, OnInit } from '@angular/core';
import { ProdServiceService } from '../Services/prod.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit {
  products: any = {
    _embedded: {
      products: []
    }
  };
  constructor(private service: ProdServiceService) { }
  ngOnInit(): void {
 //  this.getProducts();
  }

public getProducts(){
  this.service.getProducts().subscribe(
   (data)=>{
    console.log(data);
      this.products = data;
   },
    (error)=>{
      console.log(error);
    }
  );
}
}
