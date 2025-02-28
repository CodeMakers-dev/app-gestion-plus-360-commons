package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.TipoPlanDTO;
import com.gestion.plus.commons.entities.TipoPlanEntity;

@Mapper(componentModel = "spring")
public interface TipoPlanMapper {

    TipoPlanMapper INSTANCE = Mappers.getMapper(TipoPlanMapper.class);
	
	TipoPlanDTO entityToDto(TipoPlanEntity entity);
	
	@InheritInverseConfiguration
	TipoPlanEntity dtoToEntity(TipoPlanDTO dto);
	
	List<TipoPlanDTO> beanListToDtoList(List<TipoPlanEntity> list);
}
