package com.portfolio.bmm.Service;

import com.portfolio.bmm.Entity.Persona;
import com.portfolio.bmm.Repository.RPersona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    @Autowired
    RPersona rPersona;
    
    public List<Persona> list() {
        return rPersona.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return rPersona.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return rPersona.findByNombre(nombre);
    }

    public void save(Persona expe) {
        rPersona.save(expe);
    }
    
    public void delete(int id){
        rPersona.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rPersona.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rPersona.existsByNombre(nombre);
    }
}


