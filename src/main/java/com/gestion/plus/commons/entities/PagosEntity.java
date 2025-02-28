package com.gestion.plus.commons.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@Table(name = "pagos", schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class PagosEntity implements Serializable {
	
	public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne
    private PersonaEntity persona;

    @JoinColumn(name = "id_tipo_plan", referencedColumnName = "id")
    @ManyToOne
    private TipoPlanEntity tipoPlan;

    @JoinColumn(name = "id_origen_pago", referencedColumnName = "id")
    @ManyToOne
    private OrigenPagoEntity origenPago;

    @JoinColumn(name = "id_destino_pago", referencedColumnName = "id")
    @ManyToOne
    private DestinoPagoEntity destinoPago;

    @Basic(optional = false)
    @Column(name = "valor_pago", precision = 10, scale = 2)
    private BigDecimal valorPago;

    @Column(name = "referencia")
    private String referencia;

    @Basic(optional = false)
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaPago;

    @Basic(optional = false)
    @Column(name = "vigencia_desde")
    @Temporal(TemporalType.DATE)
    private LocalDate vigenciaDesde;

    @Basic(optional = false)
    @Column(name = "vigencia_hasta")
    @Temporal(TemporalType.DATE)
    private LocalDate vigenciaHasta;

    @Column(name = "dias_vigencia")
    private Integer diasVigencia;

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
