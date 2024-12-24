import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BeneficaireComponent} from "./beneficaire/beneficaire.component";
import {HeroSectionComponent} from "./hero-section/hero-section.component";
import {UpdateBeneficaireComponent} from "./update-beneficaire/update-beneficaire.component";
import {UpdateVirementComponent} from "./update-virement/update-virement.component";
import {AddBeneficaireComponent} from "./add-beneficaire/add-beneficaire.component";

const routes: Routes = [
  {path:'',component:HeroSectionComponent},
  {path:'beneficaire', component: BeneficaireComponent},
  { path: 'updateBenif/:id', component: UpdateBeneficaireComponent },
  { path: 'updateVir/:id', component: UpdateVirementComponent },
  {path:'addBenif',component:AddBeneficaireComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
