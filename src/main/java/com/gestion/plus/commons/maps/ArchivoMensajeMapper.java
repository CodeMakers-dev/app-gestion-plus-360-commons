package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.ArchivoMensajeDTO;
import com.gestion.plus.commons.entities.ArchivoMensajeEntity;

@Mapper(componentModel = "spring")
public interface ArchivoMensajeMapper {
	
	ArchivoMensajeMapper INSTANCE = Mappers.getMapper(ArchivoMensajeMapper.class);
	
	ArchivoMensajeDTO entityToDto(ArchivoMensajeEntity entity);
	
	@InheritInverseConfiguration
	ArchivoMensajeEntity dtoToEntity(ArchivoMensajeDTO dto);
	
	List<ArchivoMensajeDTO> beanListToDtoList(List<ArchivoMensajeEntity> list);

}
