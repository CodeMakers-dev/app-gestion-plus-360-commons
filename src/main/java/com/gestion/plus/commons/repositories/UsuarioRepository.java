package com.gestion.plus.commons.repositories;





import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.UsuarioEntity;



@Repository 
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>{
	Optional<UsuarioEntity> findByUsuarioAndPassword(String usuario, String password);
	Optional<UsuarioEntity> findByUsuario(String usuario);
	Optional<UsuarioEntity> findByPersonaId(Integer Id);
}
