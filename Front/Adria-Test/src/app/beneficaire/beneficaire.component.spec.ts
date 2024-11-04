import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BeneficaireComponent } from './beneficaire.component';

describe('BeneficaireComponent', () => {
  let component: BeneficaireComponent;
  let fixture: ComponentFixture<BeneficaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BeneficaireComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BeneficaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
