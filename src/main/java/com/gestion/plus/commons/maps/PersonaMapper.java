package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.PersonaDTO;
import com.gestion.plus.commons.entities.PersonaEntity;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);
	
	PersonaDTO entityToDto(PersonaEntity entity);
	
	@InheritInverseConfiguration
	PersonaEntity dtoToEntity(PersonaDTO dto);
	
	List<PersonaDTO> beanListToDtoList(List<PersonaEntity> list);
}
