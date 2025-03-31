package com.gestion.plus.commons.repositories;





import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gestion.plus.commons.entities.RolEntity;



@Repository 
public interface RolRepository extends JpaRepository<RolEntity, Integer>{
	
	@Query(value = "SELECT R.id, R.nombre, R.descripcion, R.usuario_creacion, R.fecha_creacion, R.usuario_modificacion, R.fecha_modificacion, R.activo FROM seguridad.usuario_rol UR INNER JOIN seguridad.rol R ON UR.id_rol =R.id where UR.id_usuario = ?1", nativeQuery = true)
	List<RolEntity> findRolPorUsuario(Integer id_usuario);
	
	 Optional<RolEntity> findByNombre(String nombre);
}
