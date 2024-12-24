import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBeneficaireComponent } from './add-beneficaire.component';

describe('AddBeneficaireComponent', () => {
  let component: AddBeneficaireComponent;
  let fixture: ComponentFixture<AddBeneficaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddBeneficaireComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddBeneficaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
