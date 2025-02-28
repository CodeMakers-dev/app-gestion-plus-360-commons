package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.DepartamentoDTO;
import com.gestion.plus.commons.entities.DepartamentoEntity;

@Mapper(componentModel = "spring")
public interface DepartamentoMapper {
	
    DepartamentoMapper INSTANCE = Mappers.getMapper(DepartamentoMapper.class);
	
	DepartamentoDTO entityToDto(DepartamentoEntity entity);
	
	@InheritInverseConfiguration
	DepartamentoEntity dtoToEntity(DepartamentoDTO dto);
	
	List<DepartamentoDTO> beanListToDtoList(List<DepartamentoEntity> list);

}
