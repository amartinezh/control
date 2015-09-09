package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "minuta", schema = "control")
public class Minuta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1920772279254725879L;
	
	@Id
    @Column(name = "minuta_id")
    private String minuta_id;
	
    @Column(name = "placa")
    private String placa;
    
    @JoinColumn(name = "dependencia_id", referencedColumnName = "dependencia_id")
	@ManyToOne
	private Dependencia dependencia_id;
    
    @JoinColumn(name = "area_id", referencedColumnName = "area_id")
	@ManyToOne
	private Area area_id;
	
    @JoinColumn(name = "actividad_id", referencedColumnName = "actividad_id")
	@ManyToOne
	private Actividad actividad_id;
    
    @Column(name = "hora_sistema")
    private String hora_sistema;
    
    @Column(name = "hora_inicio")
    private String hora_inicio;
    @Lob
    @Column(name = "hora_terminacion")
    private String hora_terminacion;
    @Lob
    @Column(name = "codigo_trabajador")
    private String codigo_trabajador;
    
    @Column(name = "observaciones")
    private String observaciones;
    
    @Column(name = "estado")
    private String estado;
    
    public Minuta() {
    }

    public Minuta(String minuta_id) {
        this.minuta_id = minuta_id;
    }

	public Minuta(String minuta_id, String placa, Dependencia dependencia_id,
			Area area_id, Actividad actividad_id, String hora_sistema,
			String hora_inicio, String hora_terminacion,
			String codigo_trabajador, String observaciones, String estado) {
		super();
		this.minuta_id = minuta_id;
		this.placa = placa;
		this.dependencia_id = dependencia_id;
		this.area_id = area_id;
		this.actividad_id = actividad_id;
		this.hora_sistema = hora_sistema;
		this.hora_inicio = hora_inicio;
		this.hora_terminacion = hora_terminacion;
		this.codigo_trabajador = codigo_trabajador;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public String getMinuta_id() {
		return minuta_id;
	}

	public void setMinuta_id(String minuta_id) {
		this.minuta_id = minuta_id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Dependencia getDependencia_id() {
		return dependencia_id;
	}

	public void setDependencia_id(Dependencia dependencia_id) {
		this.dependencia_id = dependencia_id;
	}

	public Area getArea_id() {
		return area_id;
	}

	public void setArea_id(Area area_id) {
		this.area_id = area_id;
	}

	public Actividad getActividad_id() {
		return actividad_id;
	}

	public void setActividad_id(Actividad actividad_id) {
		this.actividad_id = actividad_id;
	}

	public String getHora_sistema() {
		return hora_sistema;
	}

	public void setHora_sistema(String hora_sistema) {
		this.hora_sistema = hora_sistema;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_terminacion() {
		return hora_terminacion;
	}

	public void setHora_terminacion(String hora_terminacion) {
		this.hora_terminacion = hora_terminacion;
	}

	public String getCodigo_trabajador() {
		return codigo_trabajador;
	}

	public void setCodigo_trabajador(String codigo_trabajador) {
		this.codigo_trabajador = codigo_trabajador;
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

	@Override
	public String toString() {
		return "Minuta [minuta_id=" + minuta_id + ", placa=" + placa
				+ ", dependencia_id=" + dependencia_id + ", area_id=" + area_id
				+ ", actividad_id=" + actividad_id + ", hora_sistema="
				+ hora_sistema + ", hora_inicio=" + hora_inicio
				+ ", hora_terminacion=" + hora_terminacion
				+ ", codigo_trabajador=" + codigo_trabajador
				+ ", observaciones=" + observaciones + ", estado=" + estado
				+ "]";
	}
    
    
}
