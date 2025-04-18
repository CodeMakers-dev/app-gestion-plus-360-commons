package com.gestion.plus.commons.dtos;

import java.io.Serializable;
import java.util.Date;


import com.gestion.plus.commons.entities.UsuarioEntity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MensajeMasivoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

	private UsuarioEntity usuario;

	private String titulo;

	private String mensaje;

/*	private String templateName;

	private String languageCode;*/

	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;

	private Boolean activo;
}
