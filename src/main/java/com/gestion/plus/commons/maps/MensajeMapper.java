package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.gestion.plus.commons.dtos.MensajeDTO;
import com.gestion.plus.commons.entities.MensajeEntity;

@Mapper(componentModel = "spring")
public interface MensajeMapper {
    
	MensajeMapper INSTANCE = Mappers.getMapper(MensajeMapper.class);
	
	MensajeDTO entityToDto(MensajeEntity entity);
	
	@InheritInverseConfiguration
	MensajeEntity dtoToEntity(MensajeDTO dto);
	
	List<MensajeDTO> beanListToDtoList(List<MensajeEntity> list);
}
