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
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor 
@Table(name = "mensaje", schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class MensajeEntity implements Serializable{
	
	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
	@ManyToOne
	private UsuarioEntity usuario;
    
    @Basic(optional = false)
	@Column(name = "titulo")
	private String titulo;

	@Basic(optional = true)
	@Column(name = "descripcion")
	private String descripcion;
	
	@Basic(optional = false)
    @Column(name = "fecha_envio", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEnvio;
	
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
	@Column(name = "activo",nullable = false)
	private Boolean activo;
}
