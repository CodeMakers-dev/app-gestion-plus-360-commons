package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.TipoDocumentoDTO;
import com.gestion.plus.commons.entities.TipoDocumentoEntity;



@Mapper(componentModel = "spring")
public interface TipoDocumentoMapper {
	
	TipoDocumentoMapper INSTANCE = Mappers.getMapper(TipoDocumentoMapper.class);
	
	TipoDocumentoDTO entityToDto(TipoDocumentoEntity entity);
	
	@InheritInverseConfiguration
	TipoDocumentoEntity dtoToEntity(TipoDocumentoDTO dto);
	
	List<TipoDocumentoDTO> beanListToDtoList(List<TipoDocumentoEntity> list);
}
