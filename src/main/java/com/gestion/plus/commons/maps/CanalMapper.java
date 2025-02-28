package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.CanalDTO;
import com.gestion.plus.commons.entities.CanalEntity;

@Mapper(componentModel = "spring")
public interface CanalMapper {

    CanalMapper INSTANCE = Mappers.getMapper(CanalMapper.class);
	
	CanalDTO entityToDto(CanalEntity entity);
	
	@InheritInverseConfiguration
	CanalEntity dtoToEntity(CanalDTO dto);
	
	List<CanalDTO> beanListToDtoList(List<CanalEntity> list);
}
