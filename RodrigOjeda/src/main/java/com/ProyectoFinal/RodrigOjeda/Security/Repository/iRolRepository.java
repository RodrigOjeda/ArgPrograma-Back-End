
package com.ProyectoFinal.RodrigOjeda.Security.Repository;

import com.ProyectoFinal.RodrigOjeda.Security.Entity.Rol;
import com.ProyectoFinal.RodrigOjeda.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}