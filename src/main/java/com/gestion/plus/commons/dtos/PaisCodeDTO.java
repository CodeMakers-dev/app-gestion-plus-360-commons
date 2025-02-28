package com.gestion.plus.commons.dtos;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaisCodeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;

	private PaisDTO pais;
	
	private String codigo;

	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;

	private Boolean activo;

}
