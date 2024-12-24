import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateVirementComponent } from './update-virement.component';

describe('UpdateVirementComponent', () => {
  let component: UpdateVirementComponent;
  let fixture: ComponentFixture<UpdateVirementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdateVirementComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdateVirementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
