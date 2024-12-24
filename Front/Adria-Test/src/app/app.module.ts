import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BeneficaireComponent } from './beneficaire/beneficaire.component';
import {HttpClientModule} from "@angular/common/http";
import { HeroSectionComponent } from './hero-section/hero-section.component';
import { UpdateBeneficaireComponent } from './update-beneficaire/update-beneficaire.component';
import { UpdateVirementComponent } from './update-virement/update-virement.component';
import { AddBeneficaireComponent } from './add-beneficaire/add-beneficaire.component';
import { AddVirementComponent } from './add-virement/add-virement.component';

@NgModule({
  declarations: [
    AppComponent,
    BeneficaireComponent,
    HeroSectionComponent,
    UpdateBeneficaireComponent,
    UpdateVirementComponent,
    AddBeneficaireComponent,
    AddVirementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
