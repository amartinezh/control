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
@Table(name = "control_bus", schema = "control")
public class ControlBus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2775108605096515932L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "control_bus_id")
    private int control_bus_id;
	@Column(name = "hora")
    private String hora;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "turno_id", referencedColumnName = "turno_id")
    @ManyToOne
    private Turno turnoId;
    @JoinColumn(name = "origen_id", referencedColumnName = "origen_id")
    @ManyToOne
    private Origen origenId;
    
	public int getControl_bus_id() {
		return control_bus_id;
	}
	public String getHora() {
		return hora;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public String getEstado() {
		return estado;
	}
	public Origen getOrigenId() {
		return origenId;
	}
	public Turno getTurnoId() {
		return turnoId;
	}
	
	public void setControl_bus_id(int control_bus_id) {
		this.control_bus_id = control_bus_id;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setOrigenId(Origen origenId) {
		this.origenId = origenId;
	}
	public void setTurnoId(Turno turnoId) {
		this.turnoId = turnoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + control_bus_id;
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((turnoId == null) ? 0 : turnoId.hashCode());
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
		ControlBus other = (ControlBus) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (control_bus_id != other.control_bus_id)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (turnoId == null) {
			if (other.turnoId != null)
				return false;
		} else if (!turnoId.equals(other.turnoId))
			return false;
		return true;
	}
	
	
    

}
