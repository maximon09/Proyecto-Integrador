import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditAcercaComponent } from './components/acerca-de/edit-acerca.component';
import { EditestudioComponent } from './components/educacion/editestudio.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { EditskillsComponent } from './components/hardysoft/editskills.component';
import { NewskillComponent } from './components/hardysoft/newskill.component';
import { HomeComponent } from './components/home/home.component';
import { LogInComponent } from './components/log-in/log-in.component';
import { EditproyectoComponent } from './components/proyecto/editproyecto.component';
import { NewproyectoComponent } from './components/proyecto/newproyecto.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LogInComponent },
  { path: 'nuevaexp', component: NewExperienciaComponent},
  { path: 'editexp/:id', component: EditExperienciaComponent},
  { path: 'nuevaedu', component: NeweducacionComponent },
  { path: 'editedu/:id', component: EditestudioComponent },
  { path: 'nuevaskill', component: NewskillComponent },
  { path: 'editskill/:id', component: EditskillsComponent},
  { path: 'nuevoproyecto', component: NewproyectoComponent},
  { path: 'editproyecto/:id', component: EditproyectoComponent},
  { path: 'editpersona/:id', component: EditAcercaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
