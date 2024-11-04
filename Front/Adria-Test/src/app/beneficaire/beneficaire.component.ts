import {Component, OnInit} from '@angular/core';
import {BillService} from "../Services/bill.service";
import {ActivatedRoute, Router} from "@angular/router";
import {ProdServiceService} from "../Services/prod.service";

@Component({
  selector: 'app-beneficaire',
  templateUrl: './beneficaire.component.html',
  styleUrl: './beneficaire.component.css'
})
export class BeneficaireComponent implements OnInit{
  beneficaires: any = {
    _embedded: {
      beneficaires: []
    }
  };
  customerId!: number;

  constructor(private service: ProdServiceService, private router: Router, private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.getBeneficaire();
  }
  public getBeneficaire(){
    this.service.getBeneficaire().subscribe(
      (data)=>{
        console.log(data);
        this.beneficaires = data;
      },
      (error)=>{
        console.log(error);
      }
    );
  }
}
