package com.gestion.plus.commons.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "persona", schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class PersonaEntity implements Serializable {
	  public static final long serialVersionUID = 1L;
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id")
	    private Integer id;

	    @ManyToOne
	    @JoinColumn(name = "id_tipo_persona", referencedColumnName = "id", nullable = false)
	    private TipoPersonaEntity tipoPersona;

	    @Basic(optional = false)
	    @Column(name = "nombre", length = 100, nullable = false)
	    private String nombre;

	    @ManyToOne
	    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id", nullable = false)
	    private TipoDocumentoEntity tipoDocumento;

	    @Basic(optional = false)
	    @Column(name = "numero_documento", length = 20, nullable = false, unique = true)
	    private String numeroDocumento;

	    @ManyToOne
	    @JoinColumn(name = "id_pais", referencedColumnName = "id", nullable = false)
	    private PaisEntity pais;

	    @ManyToOne
	    @JoinColumn(name = "id_departamento", referencedColumnName = "id", nullable = false)
	    private DepartamentoEntity departamento;

	    @ManyToOne
	    @JoinColumn(name = "id_ciudad", referencedColumnName = "id", nullable = false)
	    private CiudadEntity ciudad;

	    @Column(name = "direccion", length = 100)
	    private String direccion;

	    @Column(name = "actividad_economica", length = 100)
	    private String actividadEconomica;

	    @Column(name = "telefono", length = 20)
	    private String telefono;

	    @Basic(optional = false)
	    @Column(name = "correo", length = 100, nullable = false, unique = true)
	    private String correo;
	    
	    @Basic(optional = true)
	    @Column(name = "imagen")
	    private byte[] imagen;
	    
	    @Basic(optional = false)
	    @Column(name = "usuario_creacion", insertable = true, updatable = false)
	    @CreatedBy
	    private String usuarioCreacion;

	    @Basic(optional = false)
		@Column(name = "fecha_creacion", insertable = true, updatable = false)
		@Temporal(TemporalType.TIMESTAMP)
		@CreatedDate
		private Date fechaCreacion;

	    @Basic(optional = true)
	    @Column(name = "usuario_modificacion", updatable = true, insertable = false)
	    @LastModifiedBy
	    private String usuarioModificacion;

	    @Basic(optional = true)
	    @Column(name = "fecha_modificacion", updatable = true, insertable = false)
	    @Temporal(TemporalType.TIMESTAMP)
	    @LastModifiedDate
	    private Date fechaModificacion;

	    @Basic(optional = false)
	    @Column(name = "activo")
	    private Boolean activo = true;
	}
