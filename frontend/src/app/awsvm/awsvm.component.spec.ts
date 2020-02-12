import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AwsvmComponent } from './awsvm.component';

describe('AwsvmComponent', () => {
  let component: AwsvmComponent;
  let fixture: ComponentFixture<AwsvmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AwsvmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AwsvmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
