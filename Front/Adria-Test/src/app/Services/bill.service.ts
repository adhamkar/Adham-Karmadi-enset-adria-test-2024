import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class BillService {
  private url = "http://localhost:8888/BILLING-SERVICE";
  customerId!: number;

  constructor(private http: HttpClient,private activeroute: ActivatedRoute) {
    this.customerId = this.activeroute.snapshot.params['customerId'];

  }

  public getBills(id: number) {
    return this.http.get(`${this.url}`+"/bills/search/byCustomerId?projection=fullBill&customerId="+id);

}
}
