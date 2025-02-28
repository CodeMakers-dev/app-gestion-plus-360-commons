package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.gestion.plus.commons.dtos.TipoPersonaDTO;
import com.gestion.plus.commons.entities.TipoPersonaEntity;

@Mapper(componentModel = "spring")
public interface TipoPersonaMapper {
    
	TipoPersonaMapper INSTANCE = Mappers.getMapper(TipoPersonaMapper.class);
	
	TipoPersonaDTO entityToDto(TipoPersonaEntity entity);
	
	@InheritInverseConfiguration
	TipoPersonaEntity dtoToEntity(TipoPersonaDTO dto);
	
	List<TipoPersonaDTO> beanListToDtoList(List<TipoPersonaEntity> list);

}
