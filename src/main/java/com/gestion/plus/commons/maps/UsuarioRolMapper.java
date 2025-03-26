package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.UsuarioRolDTO;
import com.gestion.plus.commons.entities.UsuarioRolEntity;

@Mapper(componentModel = "spring")
public interface UsuarioRolMapper {

	UsuarioRolMapper INSTANCE = Mappers.getMapper(UsuarioRolMapper.class);
	
	UsuarioRolDTO entityToDto(UsuarioRolEntity entity);
	
	@InheritInverseConfiguration
	UsuarioRolEntity dtoToEntity(UsuarioRolDTO dto);
	
	List<UsuarioRolDTO> beanListToDtoList(List<UsuarioRolEntity> list);
}
