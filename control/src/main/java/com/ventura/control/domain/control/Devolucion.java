package com.ventura.control.domain.control;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="devolucion", schema="control")
public class Devolucion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2024196576848386112L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "devolucion_id")
    private int devolucionId;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "placa")
    private String placa;
    @Column(name = "conductor")
    private String conductor;
    @Column(name = "empresa_transporte")
    private String empresaTransporte;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "cajas")
    private String cajas;
    @Column(name = "unidad")
    private String unidad;
    @Column(name = "pacas")
    private String pacas;
    @Column(name = "elemento")
    private String elemento;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "motivo_devolucion_id", referencedColumnName = "motivo_devolucion_id")
    @ManyToOne
    private MotivoDevolucion motivoDevolucionId;

    public Devolucion() {
		// TODO Auto-generated constructor stub
	}

	public int getDevolucionId() {
		return devolucionId;
	}
	public String getFecha() {
		return fecha;
	}
	public String getPlaca() {
		return placa;
	}
	public String getConductor() {
		return conductor;
	}
	public String getEmpresaTransporte() {
		return empresaTransporte;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getCajas() {
		return cajas;
	}
	public String getUnidad() {
		return unidad;
	}
	public String getPacas() {
		return pacas;
	}
	public String getElemento() {
		return elemento;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public String getEstado() {
		return estado;
	}
	public MotivoDevolucion getMotivoDevolucionId() {
		return motivoDevolucionId;
	}
	public void setDevolucionId(int devolucionId) {
		this.devolucionId = devolucionId;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public void setEmpresaTransporte(String empresaTransporte) {
		this.empresaTransporte = empresaTransporte;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setCajas(String cajas) {
		this.cajas = cajas;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public void setPacas(String pacas) {
		this.pacas = pacas;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setMotivoDevolucionId(MotivoDevolucion motivoDevolucionId) {
		this.motivoDevolucionId = motivoDevolucionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cajas == null) ? 0 : cajas.hashCode());
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result
				+ ((conductor == null) ? 0 : conductor.hashCode());
		result = prime * result + devolucionId;
		result = prime * result + ((elemento == null) ? 0 : elemento.hashCode());
		result = prime
				* result
				+ ((empresaTransporte == null) ? 0 : empresaTransporte
						.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime
				* result
				+ ((motivoDevolucionId == null) ? 0 : motivoDevolucionId
						.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((pacas == null) ? 0 : pacas.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((unidad == null) ? 0 : unidad.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Devolucion other = (Devolucion) obj;
		if (cajas == null) {
			if (other.cajas != null)
				return false;
		} else if (!cajas.equals(other.cajas))
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (conductor == null) {
			if (other.conductor != null)
				return false;
		} else if (!conductor.equals(other.conductor))
			return false;
		if (devolucionId != other.devolucionId)
			return false;
		if (elemento == null) {
			if (other.elemento != null)
				return false;
		} else if (!elemento.equals(other.elemento))
			return false;
		if (empresaTransporte == null) {
			if (other.empresaTransporte != null)
				return false;
		} else if (!empresaTransporte.equals(other.empresaTransporte))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (motivoDevolucionId == null) {
			if (other.motivoDevolucionId != null)
				return false;
		} else if (!motivoDevolucionId.equals(other.motivoDevolucionId))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (pacas == null) {
			if (other.pacas != null)
				return false;
		} else if (!pacas.equals(other.pacas))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (unidad == null) {
			if (other.unidad != null)
				return false;
		} else if (!unidad.equals(other.unidad))
			return false;
		return true;
	}	
	
}
