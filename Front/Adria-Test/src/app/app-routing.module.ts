import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BeneficaireComponent} from "./beneficaire/beneficaire.component";
import {HeroSectionComponent} from "./hero-section/hero-section.component";

const routes: Routes = [
  {path:'',component:HeroSectionComponent},
  {path:'beneficaire', component: BeneficaireComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
