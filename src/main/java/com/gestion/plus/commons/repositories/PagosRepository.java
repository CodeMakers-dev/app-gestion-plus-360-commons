package com.gestion.plus.commons.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.PagosEntity;
import com.gestion.plus.commons.entities.PersonaEntity;

@Repository
public interface PagosRepository extends JpaRepository<PagosEntity, Integer> {
	
	Optional<PagosEntity> findByPersona(PersonaEntity persona);

}
