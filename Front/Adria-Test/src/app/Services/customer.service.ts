import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private url = "http://localhost:8888/CUSTOMER-SERVICE";

  constructor(private http: HttpClient) { }

  public getCustomers() {
    return this.http.get(`${this.url}`+"/customers");
  }
}
