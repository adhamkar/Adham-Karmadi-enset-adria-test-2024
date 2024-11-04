import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProdServiceService {
  private url = "http://localhost:8888/INVENTORY-SERVICE";

  constructor(private http: HttpClient) { }

  public getProducts() {
    return this.http.get(`${this.url}`+"/products");
  }
}
