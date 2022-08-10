import { Component, OnInit } from '@angular/core';
import { Skills } from 'src/app/model/skills';
import { SkillsService } from 'src/app/service/skills.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-hardysoft',
  templateUrl: './hardysoft.component.html',
  styleUrls: ['./hardysoft.component.css']
})
export class HardysoftComponent implements OnInit {
  skills: Skills[] = [];

  constructor(private skillS: SkillsService, private tokenService: TokenService) { }

  isLogged = false;
  ngOnInit(): void {
    this.cargarSkills();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarSkills(): void {
    this.skillS.lista().subscribe(data => { this.skills = data; })
  }

  delete(id?: number){
    if(id != undefined){
      this.skillS.delete(id).subscribe(data =>{
        this.cargarSkills();
      }, err =>{
        alert("NO se pudo borrar la habilidad");
      }
      )
    }
  }
}
