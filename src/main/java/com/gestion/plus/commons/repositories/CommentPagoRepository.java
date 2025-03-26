package com.gestion.plus.commons.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.CommentPagoEntity;
import com.gestion.plus.commons.entities.PagosEntity;

@Repository
public interface CommentPagoRepository extends JpaRepository<CommentPagoEntity, Integer>{

	List<CommentPagoEntity> findByPagos(PagosEntity pago);
}
