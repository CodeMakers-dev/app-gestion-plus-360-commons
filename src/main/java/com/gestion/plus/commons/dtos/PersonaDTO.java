package com.gestion.plus.commons.dtos;

import java.io.Serializable;
import java.util.Date;

import com.gestion.plus.commons.entities.CiudadEntity;
import com.gestion.plus.commons.entities.DepartamentoEntity;
import com.gestion.plus.commons.entities.PaisEntity;
import com.gestion.plus.commons.entities.TipoDocumentoEntity;
import com.gestion.plus.commons.entities.TipoPersonaEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	    private Integer id;

	    private TipoPersonaEntity tipoPersona;

	    private String nombre;

	    private TipoDocumentoEntity tipoDocumento;

	    private String numeroDocumento;

	    private PaisEntity pais;

	    private DepartamentoEntity departamento;

	    private CiudadEntity ciudad;

	    private String direccion;

	    private String actividadEconomica;

	    private String telefono;
	  
	    private String correo;
	    
	    private byte[] imagen;
	    
	    private String usuarioCreacion;

	    private Date fechaCreacion;

	    private String usuarioModificacion;

	    private Date fechaModificacion;

	    private Boolean activo;
	    
	    private RolDTO rol;

}
