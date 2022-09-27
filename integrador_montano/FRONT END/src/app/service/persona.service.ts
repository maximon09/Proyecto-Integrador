import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = 'https://backendbmm.herokuapp.com/personas/';

  constructor(private http: HttpClient) { }

  public getPersona(): Observable<Persona>{
    return this.http.get<Persona>(this.URL+'detail/1');
  }
  public detail(id: number): Observable<Persona> {
    return this.http.get<Persona>(this.URL + `detail/${id}`);
  }

  public save(persona: Persona): Observable<any> {
    return this.http.post<any>(this.URL + 'create', persona);
  }

  public update(id: number, persona: Persona): Observable<any> {
    return this.http.put<any>(this.URL + `update/${id}`, persona);
  }
}
