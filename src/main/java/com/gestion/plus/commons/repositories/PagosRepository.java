package com.gestion.plus.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.PagosEntity;

@Repository
public interface PagosRepository extends JpaRepository<PagosEntity, Integer> {

}
