package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="control.minuta_minuta_id_seq")
	@SequenceGenerator(name="control.minuta_minuta_id_seq", sequenceName="control.minuta_minuta_id_seq", allocationSize=1)
	private int minuta_id;
	
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
    
    @Column(name = "hora_terminacion")
    private String hora_terminacion;
    
    @Column(name = "codigo_trabajador")
    private String codigo_trabajador;
    
    @Column(name = "observaciones")
    private String observaciones;
    
    @Column(name = "estado")
    private String estado;
    
    public Minuta() {
    }

    public Minuta(int minuta_id) {
        this.minuta_id = minuta_id;
    }

	public Minuta(int minuta_id, String placa, Dependencia dependencia_id,
			Area area_id, Actividad actividad_id, String hora_inicio, String hora_terminacion,
			String codigo_trabajador, String observaciones, String estado) {
		super();
		this.minuta_id = minuta_id;
		this.placa = placa;
		this.dependencia_id = dependencia_id;
		this.area_id = area_id;
		this.actividad_id = actividad_id;
		this.hora_sistema = getDate();
		this.hora_inicio = hora_inicio;
		this.hora_terminacion = hora_terminacion;
		this.codigo_trabajador = codigo_trabajador;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public int getMinuta_id() {
		return minuta_id;
	}

	public void setMinuta_id(int minuta_id) {
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
}
