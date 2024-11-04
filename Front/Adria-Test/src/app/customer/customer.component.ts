import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../Services/customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent implements OnInit{


  customers: any = {
    _embedded: {
      customers: []
    }
  };
  constructor(private service: CustomerService, private router: Router) { }

  ngOnInit(): void {
   this.getProducts();
  }

  public getProducts(){
    this.service.getCustomers().subscribe(
     (data)=>{
      console.log(data);
        this.customers = data;
     },
      (error)=>{
        console.log(error); 
      }
    );
  }
  getBills(c: any) {
         this.router.navigateByUrl("/bills/"+c.id);
        }
}
