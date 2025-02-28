package com.gestion.plus.commons.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	private List<RolDTO> lstRol;
	private Date fechaModificacion;
	private Boolean activo;
	private String token;

}
