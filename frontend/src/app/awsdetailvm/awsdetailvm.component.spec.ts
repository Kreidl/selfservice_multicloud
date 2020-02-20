import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AwsdetailvmComponent } from './awsdetailvm.component';

describe('AwsdetailvmComponent', () => {
  let component: AwsdetailvmComponent;
  let fixture: ComponentFixture<AwsdetailvmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AwsdetailvmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AwsdetailvmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
