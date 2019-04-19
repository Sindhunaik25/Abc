import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrendingpostsComponent } from './trendingposts.component';

describe('TrendingpostsComponent', () => {
  let component: TrendingpostsComponent;
  let fixture: ComponentFixture<TrendingpostsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrendingpostsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrendingpostsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
