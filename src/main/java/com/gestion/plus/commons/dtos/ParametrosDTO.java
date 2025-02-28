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
public class ParametrosDTO implements Serializable{
	
	private Integer id;
	
    private String llave;
	
    private String valor;
	
    private String descripcion;
	
	private String usuarioCreacion;
	
	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;
	
	private Boolean activo;
}
