package com.gestion.plus.commons.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.MensajeEntity;
import com.gestion.plus.commons.entities.UsuarioEntity;

@Repository
public interface MensajeRepository extends JpaRepository<MensajeEntity, Integer>{
	
	List<MensajeEntity> findByUsuario(UsuarioEntity usuario);
	Optional<MensajeEntity>deleteByUsuarioId(Integer Id);
}
