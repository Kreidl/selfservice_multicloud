import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AwshomeComponent } from './awshome.component';

describe('AwshomeComponent', () => {
  let component: AwshomeComponent;
  let fixture: ComponentFixture<AwshomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AwshomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AwshomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
