package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.ParametrosDTO;
import com.gestion.plus.commons.entities.ParametrosEntity;

@Mapper(componentModel = "spring")
public interface ParametrosMapper {
    
	ParametrosMapper INSTANCE = Mappers.getMapper(ParametrosMapper.class);
	
	ParametrosDTO entityToDto(ParametrosEntity entity);
	
	@InheritInverseConfiguration
	ParametrosEntity dtoToEntity(ParametrosDTO dto);
	
	List<ParametrosDTO> beanListToDtoList(List<ParametrosEntity> list);
}
