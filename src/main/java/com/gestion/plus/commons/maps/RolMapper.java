package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.RolDTO;
import com.gestion.plus.commons.entities.RolEntity;

@Mapper(componentModel = "spring")
public interface RolMapper {
    
	RolMapper INSTANCE = Mappers.getMapper(RolMapper.class);
	
	RolDTO entityToDto(RolEntity entity);
	
	@InheritInverseConfiguration
	RolEntity dtoToEntity(RolDTO dto);
	
	List<RolDTO> beanListToDtoList(List<RolEntity> list);

}
