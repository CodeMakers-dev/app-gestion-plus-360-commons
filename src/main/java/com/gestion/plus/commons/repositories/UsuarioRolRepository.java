package com.gestion.plus.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.UsuarioRolEntity;

@Repository 
public interface UsuarioRolRepository extends JpaRepository<UsuarioRolEntity, Integer>{

	Optional<UsuarioRolEntity> findByUsuarioId(Integer userId);
}
