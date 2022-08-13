package com.portfolio.bmm.Repository;

import com.portfolio.bmm.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
    public Optional<Proyecto> findByNombreProyecto(String nombreProyecto);
    public boolean existsByNombreProyecto(String nombreProyecto);
}
