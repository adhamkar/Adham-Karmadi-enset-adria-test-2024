import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBeneficaireComponent } from './update-beneficaire.component';

describe('UpdateBeneficaireComponent', () => {
  let component: UpdateBeneficaireComponent;
  let fixture: ComponentFixture<UpdateBeneficaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdateBeneficaireComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdateBeneficaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
