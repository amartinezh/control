package com.ventura.control.domain.control;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "control_taxi", schema = "control")
public class ControlTaxi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4932858482298019612L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "control_taxi_id")
	private int controlTaxiId;
	@Column(name = "codigo_trabajador")
	private String codigoTrabajador;
	@Column(name = "hora_sistema")
	private String horaSistema;
	@Column(name = "hora_entrada")
	private String horaEntrada;
	@Column(name = "hora_salida")
	private String horaSalida;
	@Column(name = "nombre_conductor")
	private String nombreConductor;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "estado")
	private String estado;

	public ControlTaxi() {
		// TODO Auto-generated constructor stub
	}

	
	
	public ControlTaxi(int controlTaxiId) {		
		this.controlTaxiId = controlTaxiId;
	}



	public ControlTaxi(int controlTaxiId, String codigoTrabajador, String horaSistema,
			String horaEntrada, String horaSalida, String nombreConductor,
			String observaciones) {
		this.controlTaxiId = controlTaxiId;
		this.codigoTrabajador = codigoTrabajador;
		this.horaSistema =  getDate();
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.nombreConductor = nombreConductor;
		this.observaciones = observaciones;
		this.estado = "1";
	}

	public int getControlTaxiId() {
		return controlTaxiId;
	}

	public String getCodigoTrabajador() {
		return codigoTrabajador;
	}

	public String getHoraSistema() {
		return horaSistema;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public void setControlTaxiId(int controlTaxiId) {
		this.controlTaxiId = controlTaxiId;
	}

	public void setCodigoTrabajador(String codigoTrabajador) {
		this.codigoTrabajador = codigoTrabajador;
	}

	public void setHoraSistema(String horaSistema) {
		this.horaSistema = horaSistema;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	private String getDate(){
		Calendar fecha = Calendar.getInstance();
        int anno = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
		return dia+"/"+mes+"/"+anno+" "+hora+":"+minuto +":"+segundo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((horaEntrada == null) ? 0 : horaEntrada.hashCode());
		result = prime * result
				+ ((horaSalida == null) ? 0 : horaSalida.hashCode());
		result = prime * result
				+ ((horaSistema == null) ? 0 : horaSistema.hashCode());
		result = prime * result + controlTaxiId;
		result = prime * result
				+ ((nombreConductor == null) ? 0 : nombreConductor.hashCode());
		result = prime
				* result
				+ ((codigoTrabajador == null) ? 0 : codigoTrabajador.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
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
		ControlTaxi other = (ControlTaxi) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (horaEntrada == null) {
			if (other.horaEntrada != null)
				return false;
		} else if (!horaEntrada.equals(other.horaEntrada))
			return false;
		if (horaSalida == null) {
			if (other.horaSalida != null)
				return false;
		} else if (!horaSalida.equals(other.horaSalida))
			return false;
		if (horaSistema == null) {
			if (other.horaSistema != null)
				return false;
		} else if (!horaSistema.equals(other.horaSistema))
			return false;
		if (controlTaxiId != other.controlTaxiId)
			return false;
		if (nombreConductor == null) {
			if (other.nombreConductor != null)
				return false;
		} else if (!nombreConductor.equals(other.nombreConductor))
			return false;
		if (codigoTrabajador == null) {
			if (other.codigoTrabajador != null)
				return false;
		} else if (!codigoTrabajador.equals(other.codigoTrabajador))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		return true;
	}

}
