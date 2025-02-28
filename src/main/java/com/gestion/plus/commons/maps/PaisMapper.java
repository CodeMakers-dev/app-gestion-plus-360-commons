package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.PaisDTO;
import com.gestion.plus.commons.entities.PaisEntity;

@Mapper(componentModel = "spring")
public interface PaisMapper {
	
    PaisMapper INSTANCE = Mappers.getMapper(PaisMapper.class);
	
	PaisDTO entityToDto(PaisEntity entity);
	
	@InheritInverseConfiguration
	PaisEntity dtoToEntity(PaisDTO dto);
	
	List<PaisDTO> beanListToDtoList(List<PaisEntity> list);

}
