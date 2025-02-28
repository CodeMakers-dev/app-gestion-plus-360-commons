package com.gestion.plus.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.VigenciaUsuarioEntity;

@Repository
public interface VigenciaUsuarioRepository extends JpaRepository<VigenciaUsuarioEntity, Integer>{
	         Optional<VigenciaUsuarioEntity> findByLlave(String llave);
	         Optional<VigenciaUsuarioEntity>  deleteByUsuarioId(Integer Id);
}
