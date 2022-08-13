package com.portfolio.bmm.Service;

import com.portfolio.bmm.Entity.Proyecto;
import com.portfolio.bmm.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Sproyecto {
    @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return rProyecto.findById(id);
    }
    
    public Optional<Proyecto> getByNmbreProyecto(String nombreProyecto){
        return rProyecto.findByNombreProyecto(nombreProyecto);
    }
    
    public void save(Proyecto proyecto){
        rProyecto.save(proyecto);
    }
    
    public void delete(int id){
        rProyecto.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyecto.existsById(id);
    }
    
    public boolean existsByNombreProyecto(String nombreProyecto){
        return rProyecto.existsByNombreProyecto(nombreProyecto);
    }
    
    public Object getByNombreProyecto(String nombreProyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
