package com.gestion.plus.commons.maps;

import java.util.List;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.OrigenPagoDTO;
import com.gestion.plus.commons.entities.OrigenPagoEntity;

@Mapper(componentModel = "spring")
public interface OrigenPagoMapper {
    
	OrigenPagoMapper INSTANCE = Mappers.getMapper(OrigenPagoMapper.class);
	
	OrigenPagoDTO entityToDto(OrigenPagoEntity entity);
	
	@InheritInverseConfiguration
	OrigenPagoEntity dtoToEntity(OrigenPagoDTO dto);
	
	List<OrigenPagoDTO> beanListToDtoList(List<OrigenPagoEntity> list);

}
