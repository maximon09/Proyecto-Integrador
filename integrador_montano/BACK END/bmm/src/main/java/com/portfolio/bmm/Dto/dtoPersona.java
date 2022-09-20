package com.portfolio.bmm.Dto;


public class dtoPersona {
    private String nombre;
    private String descripcion;
    private String profesion;
    private String img;
    
    //Constructor
    public dtoPersona() {
    }

    public dtoPersona(String nombre, String descripcion, String profesion, String img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.profesion = profesion;
        this.img = img;
    }
  
    //Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
