package com.ProyectoFinal.RodrigOjeda.Repository;

import com.ProyectoFinal.RodrigOjeda.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
