package com.gestion.plus.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.TipoPlanEntity;

@Repository 
public interface TipoPlanRepository extends JpaRepository<TipoPlanEntity, Integer> {

}
