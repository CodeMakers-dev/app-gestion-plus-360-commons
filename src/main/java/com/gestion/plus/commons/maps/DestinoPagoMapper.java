package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.gestion.plus.commons.dtos.DestinoPagoDTO;
import com.gestion.plus.commons.entities.DestinoPagoEntity;

@Mapper(componentModel = "spring")
public interface DestinoPagoMapper {
	
    DestinoPagoMapper INSTANCE = Mappers.getMapper(DestinoPagoMapper.class);
	
    DestinoPagoDTO entityToDto(DestinoPagoEntity entity);
	
	@InheritInverseConfiguration
	DestinoPagoEntity dtoToEntity(DestinoPagoDTO dto);
	
	List<DestinoPagoDTO> beanListToDtoList(List<DestinoPagoEntity> list);

}
