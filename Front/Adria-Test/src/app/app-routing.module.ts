import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BeneficaireComponent} from "./beneficaire/beneficaire.component";

const routes: Routes = [

  {path:'beneficaire', component: BeneficaireComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
