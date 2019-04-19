import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SereyService {
  private baseUrl = "http://localhost:6543";
  
  constructor(private http:HttpClient) { }

  getAllusers(): Observable<Object>{
    return this.http.get(`${this.baseUrl}` + `/getAllPosts`);
  }

 /*  viewProduct(): Observable<Object> {
    console.log("view")
    return this.http.get(`${this.productBaseUrl}` + `/view`);
  
    } */
}
