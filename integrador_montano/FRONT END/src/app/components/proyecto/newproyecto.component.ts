import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Proyecto } from 'src/app/model/proyecto';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-newproyecto',
  templateUrl: './newproyecto.component.html',
  styleUrls: ['./newproyecto.component.css']
})
export class NewproyectoComponent implements OnInit {
  nombreProyecto: string;
  descripcionProyecto: string;
  imagenProyecto: string;
  linkProyecto: string;

  constructor(private sProyecto: ProyectoService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const proyecto = new Proyecto(this.nombreProyecto, this.descripcionProyecto, this.imagenProyecto, this.linkProyecto);
    this.sProyecto.save(proyecto).subscribe(
      data => {
      alert("Proyecto añadido");
      this.router.navigate(['']);
    }, err => {
      alert("Falló");
      this.router.navigate([''])
    }
    )
}
}
