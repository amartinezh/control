package com.ventura.control.domain.control;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "caja_menor", schema = "control")
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

	public CajaMenor() {
		// TODO Auto-generated constructor stub
	}

	public CajaMenor(int id, Dependencia dependencia, TipoTransaccion tipT,
			Date fecha, String nombre, String apellido, BigInteger valor,
			Date hora, String observaciones) {
		this.id = id;
		this.dependenciaId = dependencia;
		this.tipoTransaccionId = tipT;
		this.fecha = fecha;
		this.nombreCompleto = nombre;
		this.apellido = apellido;
		this.valor = valor;
		this.horaRegistro = hora;
		this.observaciones = observaciones;
		this.estado = "1";
	}

	public int getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public String getApellido() {
		return apellido;
	}

	public BigInteger getValor() {
		return valor;
	}

	public Date getHoraRegistro() {
		return horaRegistro;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public TipoTransaccion getTipoTransaccionId() {
		return tipoTransaccionId;
	}

	public Dependencia getDependenciaId() {
		return dependenciaId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setValor(BigInteger valor) {
		this.valor = valor;
	}

	public void setHoraRegistro(Date horaRegistro) {
		this.horaRegistro = horaRegistro;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setTipoTransaccionId(TipoTransaccion tipoTransaccionId) {
		this.tipoTransaccionId = tipoTransaccionId;
	}

	public void setDependenciaId(Dependencia dependenciaId) {
		this.dependenciaId = dependenciaId;
	}

}
