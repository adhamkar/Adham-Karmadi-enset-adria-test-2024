import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { BillService } from '../Services/bill.service';

@Component({
  selector: 'app-bills-details',
  templateUrl: './bills-details.component.html',
  styleUrl: './bills-details.component.css'
})
export class BillsDetailsComponent implements OnInit{
  billDetails: any = {
    _embedded: {
      bills: []
    }
  };
  billId!: number;

  constructor(private service: BillService, private router: Router, private route: ActivatedRoute) { 
  }

  ngOnInit(): void {
    this.billId = this.route.snapshot.params['id'];
   this.getBillDetails();
  }

  public getBillDetails(){
    this.service.getBills(this.billId).subscribe(
     (data)=>{
      console.log(data);
        this.billDetails = data;
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
