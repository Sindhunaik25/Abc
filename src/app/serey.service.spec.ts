import { TestBed } from '@angular/core/testing';

import { SereyService } from './serey.service';

describe('SereyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SereyService = TestBed.get(SereyService);
    expect(service).toBeTruthy();
  });
});
