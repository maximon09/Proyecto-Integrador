
package com.portfolio.bmm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSkill;
    private String porcentajeSkill;
    private String imgSkill;
    
    //Constructor

    public Skills() {
    }

    public Skills(String nombreSkill, String porcentajeSkill, String imgSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
        this.imgSkill = imgSkill;
    }

    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(String porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }
    
}
