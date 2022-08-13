
package com.portfolio.bmm.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String descripcionProyecto;
    @NotBlank
    private String imagenProyecto;
    
    //Constructor

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreProyecto, String descripcionProyecto, String imagenProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.imagenProyecto = imagenProyecto;
    }
    
    //Getter & Setter

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
