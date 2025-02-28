package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.UsuarioDTO;
import com.gestion.plus.commons.entities.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface UsuarioMapper{
    
	UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
	
	UsuarioDTO entityToDto(UsuarioEntity entity);
	
	@InheritInverseConfiguration
	UsuarioEntity dtoToEntity(UsuarioDTO dto);
	
	List<UsuarioDTO> beanListToDtoList(List<UsuarioEntity> list);
}
