import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BillService } from '../Services/bill.service';

@Component({
  selector: 'app-bills',
  templateUrl: './bills.component.html',
  styleUrl: './bills.component.css'
})
export class BillsComponent implements OnInit{
  bills: any = {
    _embedded: {
      bills: []
    }
  };
  customerId!: number;

  constructor(private service: BillService, private router: Router, private route: ActivatedRoute) { 
  }

  ngOnInit(): void {
    this.customerId = this.route.snapshot.params['customerId'];
   this.getBills();
  }

  public getBills(){
    this.service.getBills(this.customerId).subscribe(
     (data)=>{
      console.log(data);
        this.bills = data;
     },
      (error)=>{
        console.log(error); 
      }
    );
  }
  getDetails(b:any){
    this.router.navigateByUrl("/bill-details/"+b.id);
  }
}
