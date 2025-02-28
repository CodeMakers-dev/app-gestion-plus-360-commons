package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.PaisCodeDTO;
import com.gestion.plus.commons.entities.PaisCodeEntity;

@Mapper(componentModel = "spring")
public interface PaisCodeMapper {
	
	    PaisCodeMapper INSTANCE = Mappers.getMapper(PaisCodeMapper.class);
		
		PaisCodeDTO entityToDto(PaisCodeEntity entity);
		
		@InheritInverseConfiguration
		PaisCodeEntity dtoToEntity(PaisCodeDTO dto);
		
		List<PaisCodeDTO> beanListToDtoList(List<PaisCodeEntity> list);

}
