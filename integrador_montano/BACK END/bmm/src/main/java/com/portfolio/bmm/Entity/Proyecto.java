package com.portfolio.bmm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String imagenProyecto;

    //Constructor
    public Proyecto() {
    }

    public Proyecto(String nombreProyecto, String descripcionProyecto, String imagenProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.imagenProyecto = imagenProyecto;
    }

    //Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getImagenProyecto() {
        return imagenProyecto;
    }

    public void setImagenProyecto(String imagenProyecto) {
        this.imagenProyecto = imagenProyecto;
    }

}
