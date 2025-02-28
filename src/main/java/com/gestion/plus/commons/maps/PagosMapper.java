package com.gestion.plus.commons.maps;

import java.util.List;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.PagosDTO;
import com.gestion.plus.commons.entities.PagosEntity;

@Mapper(componentModel = "spring")
public interface PagosMapper {
    
	PagosMapper INSTANCE = Mappers.getMapper(PagosMapper.class);
	
	PagosDTO entityToDto(PagosEntity entity);
	
	@InheritInverseConfiguration
	PagosEntity dtoToEntity(PagosDTO dto);
	
	List<PagosDTO> beanListToDtoList(List<PagosEntity> list);
}
