export class Persona {
    id?: number;
    nombre: string;
    descripcion: string;
    profesion: string;
    img: string;
    constructor(nombre: string, descripcion: string, img: string, profesion: string){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.profesion = profesion;
        this.img = img;
    }
}
