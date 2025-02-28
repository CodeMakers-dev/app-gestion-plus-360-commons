package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.VigenciaUsuarioDTO;
import com.gestion.plus.commons.entities.VigenciaUsuarioEntity;

@Mapper(componentModel = "spring")
public interface VigenciaUsuarioMapper {
    
	VigenciaUsuarioMapper INSTANCE = Mappers.getMapper(VigenciaUsuarioMapper.class);
	
	VigenciaUsuarioDTO entityToDto(VigenciaUsuarioEntity entity);
	
	@InheritInverseConfiguration
	VigenciaUsuarioEntity dtoToEntity(VigenciaUsuarioDTO dto);
	
	List<VigenciaUsuarioDTO> beanListToDtoList(List<VigenciaUsuarioEntity> list); 
}
