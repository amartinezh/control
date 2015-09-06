package com.ventura.control.domain.control;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "caja_menor", schema = "admin")
public class CajaMenor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3271096495914174914L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
	
	@Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
	@Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "valor")
    private BigInteger valor;
    @Column(name = "hora_registro")
    @Temporal(TemporalType.TIME)
    private Date horaRegistro;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "tipo_transaccion_id", referencedColumnName = "tipo_transaccion_id")
    @ManyToOne
    private TipoTransaccion tipoTransaccionId;
    @JoinColumn(name = "dependencia_id", referencedColumnName = "dependencia_id")
    @ManyToOne
    private Dependencia dependenciaId;

}
