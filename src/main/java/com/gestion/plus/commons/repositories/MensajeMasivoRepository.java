package com.gestion.plus.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.MensajeMasivoEntity;

@Repository
public interface MensajeMasivoRepository extends JpaRepository<MensajeMasivoEntity, Integer>{

}
