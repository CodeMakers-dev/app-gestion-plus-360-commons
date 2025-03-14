package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.ButtonMensajeDTO;
import com.gestion.plus.commons.entities.ButtonMensajeEntity;

@Mapper(componentModel = "spring")
public interface ButtonMensajeMapper {
	
	ButtonMensajeMapper INSTANCE = Mappers.getMapper(ButtonMensajeMapper.class);
	
	ButtonMensajeDTO entityToDto(ButtonMensajeEntity entity);
	
	@InheritInverseConfiguration
	ButtonMensajeEntity dtoToEntity(ButtonMensajeDTO dto);
	
	List<ButtonMensajeDTO> beanListToDtoList(List<ButtonMensajeEntity> list);

}
