import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProdServiceService {

  private urlVir = "http://localhost:8888/VIREMENT-SERVICE";
  private urlBenif = "http://localhost:8888/BENEFICIAIRE-SERVICE";
  private url="http://localhost:8081/beneficaire-service"
  constructor(private http: HttpClient) { }


  getBeneficaire(){
    return this.http.get(`${this.urlBenif}`+"/beneficaires");
  }
  deleteBeneficaire(id:number){
    return this.http.delete(`${this.url}`+"/beneficaire/"+id);
  }
  addBenif(benif:any):Observable<any>{
    return this.http.post<any>(`${this.urlBenif}`+"/beneficaire",benif)
  }
  updatebenif(benif:any){
    return this.http.patch(`${this.urlBenif}`+"/beneficaire",benif)
  }
}
