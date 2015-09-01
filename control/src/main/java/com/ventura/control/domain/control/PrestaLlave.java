package com.ventura.control.domain.control;

import java.io.Serializable;
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
@Table(name = "presta_llave", schema = "control")
public class PrestaLlave implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1426103003088682370L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private int id;
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column(name = "hora")
	@Temporal(TemporalType.TIME)
	private Date hora;
	@Column(name = "nombre_completo")
	private String nombreCompleto;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "cantidad_llave")
	private int cantidadLlave;
	@Column(name = "quien_entrega")
	private String quienEntrega;
	@Column(name = "quien_recibe")
	private String quienRecibe;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "estado")
	private String estado;
	@JoinColumn(name = "dependencia_id", referencedColumnName = "dependencia_id")
	@ManyToOne
	private Dependencia dependenciaId;

	public PrestaLlave() {
	}

	public PrestaLlave(int id) {
		this.id = id;
	}

	public PrestaLlave(int id, String nombreCompleto, String apellido,
			int cantidadLlave, String quienEntrega, String quienRecibe,
			String observaciones) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.apellido = apellido;
		this.cantidadLlave = cantidadLlave;
		this.quienEntrega = quienEntrega;
		this.quienRecibe = quienRecibe;
		this.observaciones = observaciones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCantidadLlave() {
		return cantidadLlave;
	}

	public void setCantidadLlave(Integer cantidadLlave) {
		this.cantidadLlave = cantidadLlave;
	}

	public String getQuienEntrega() {
		return quienEntrega;
	}

	public void setQuienEntrega(String quienEntrega) {
		this.quienEntrega = quienEntrega;
	}

	public String getQuienRecibe() {
		return quienRecibe;
	}

	public void setQuienRecibe(String quienRecibe) {
		this.quienRecibe = quienRecibe;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Dependencia getDependenciaId() {
		return dependenciaId;
	}

	public void setDependenciaId(Dependencia dependenciaId) {
		this.dependenciaId = dependenciaId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += id;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof PrestaLlave)) {
			return false;
		}
		PrestaLlave other = (PrestaLlave) object;
		if (this.id != (other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "control.PrestaLlave[ id=" + id + " ]";
	}

}