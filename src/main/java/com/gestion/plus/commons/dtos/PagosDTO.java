package com.gestion.plus.commons.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import com.gestion.plus.commons.entities.DestinoPagoEntity;
import com.gestion.plus.commons.entities.OrigenPagoEntity;
import com.gestion.plus.commons.entities.PersonaEntity;
import com.gestion.plus.commons.entities.TipoPlanEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagosDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private Integer id;

    private PersonaEntity persona;

    private TipoPlanEntity tipoPlan;

    private OrigenPagoEntity origenPago;

    private DestinoPagoEntity destinoPago;

    private BigDecimal valorPago;

    private String referencia;

    private LocalDate fechaPago;

    private LocalDate vigenciaDesde;

    private LocalDate vigenciaHasta;

    private Integer diasVigencia;

	private String usuarioCreacion;

	private Date fechaCreacion;

	private String usuarioModificacion;

	private Date fechaModificacion;

	private Boolean activo;
}
