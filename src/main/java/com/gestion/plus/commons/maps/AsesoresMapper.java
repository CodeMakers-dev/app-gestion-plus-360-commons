package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.AsesoresDTO;
import com.gestion.plus.commons.entities.AsesoresEntity;

@Mapper(componentModel = "spring")
public interface AsesoresMapper {

	
	    AsesoresMapper INSTANCE = Mappers.getMapper(AsesoresMapper.class);
		
	    AsesoresDTO entityToDto(AsesoresEntity entity);
		
		@InheritInverseConfiguration
		AsesoresEntity dtoToEntity(AsesoresDTO dto);
		
		List<AsesoresDTO> beanListToDtoList(List<AsesoresEntity> list);
}
