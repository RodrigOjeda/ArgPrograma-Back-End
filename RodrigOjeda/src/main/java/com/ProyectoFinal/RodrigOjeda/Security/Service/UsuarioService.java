
package com.ProyectoFinal.RodrigOjeda.Security.Service;

import com.ProyectoFinal.RodrigOjeda.Security.Entity.Usuario;
import com.ProyectoFinal.RodrigOjeda.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
}
    public Boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public Boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
       }
}
