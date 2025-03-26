package com.gestion.plus.commons.maps;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.gestion.plus.commons.dtos.CommentPagoDTO;
import com.gestion.plus.commons.entities.CommentPagoEntity;

@Mapper(componentModel = "spring")
public interface CommentPagoMapper {
	
	CommentPagoMapper INSTANCE = Mappers.getMapper(CommentPagoMapper.class);
	
	CommentPagoDTO entityToDto(CommentPagoEntity entity);
	
	@InheritInverseConfiguration
	CommentPagoEntity dtoToEntity(CommentPagoDTO dto);
	
	List<CommentPagoDTO> beanListToDtoList(List<CommentPagoEntity> list);

}
