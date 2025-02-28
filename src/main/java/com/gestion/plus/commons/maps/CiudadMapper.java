package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.CiudadDTO;
import com.gestion.plus.commons.entities.CiudadEntity;

@Mapper(componentModel = "spring")
public interface CiudadMapper {

    CiudadMapper INSTANCE = Mappers.getMapper(CiudadMapper.class);
	
	CiudadDTO entityToDto(CiudadEntity entity);
	
	@InheritInverseConfiguration
	CiudadEntity dtoToEntity(CiudadDTO dto);
	
	List<CiudadDTO> beanListToDtoList(List<CiudadEntity> list);

}
