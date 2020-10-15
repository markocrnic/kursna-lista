import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpcallService {

  constructor(private http: HttpClient) { }

  // tslint:disable-next-line: typedef
  callList() {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };
    return this.http.get<any>(environment.nbsEndpoint, httpOptions);
  }
}
