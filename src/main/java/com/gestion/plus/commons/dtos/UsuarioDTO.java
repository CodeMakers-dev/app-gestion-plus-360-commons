package com.gestion.plus.commons.dtos;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import com.gestion.plus.commons.entities.PersonaEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String usuario;
	private String password;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private List<RolDTO> lstRol;
	private Boolean activo;
	private String token;
	private PersonaEntity persona;

}
