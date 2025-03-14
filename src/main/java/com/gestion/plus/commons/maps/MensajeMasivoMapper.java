package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.MensajeMasivoDTO;
import com.gestion.plus.commons.entities.MensajeMasivoEntity;

@Mapper(componentModel = "spring")
public interface MensajeMasivoMapper {
	
    MensajeMasivoMapper INSTANCE = Mappers.getMapper(MensajeMasivoMapper.class);
	
    MensajeMasivoDTO entityToDto(MensajeMasivoEntity entity);
	
	@InheritInverseConfiguration
	MensajeMasivoEntity dtoToEntity(MensajeMasivoDTO dto);
	
	List<MensajeMasivoDTO> beanListToDtoList(List<MensajeMasivoEntity> list);

}
