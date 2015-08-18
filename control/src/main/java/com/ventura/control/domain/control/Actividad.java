package com.ventura.control.domain.control;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="actividad", schema="admin")
public class Actividad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8630587916851841843L;
	@Id
    @Column(name = "actividad_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.actividad_actividad_id_seq")
	@SequenceGenerator(name="admin.actividad_actividad_id_seq", sequenceName="admin.actividad_actividad_id_seq", allocationSize=1)
	private int actividad_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;
	
	public Actividad() {
		// TODO Auto-generated constructor stub
	}
	
	public Actividad(String descripcion) {
		this.descripcion = descripcion;	
	}
	
	public Actividad(int actividad_id) {
		this.actividad_id = actividad_id;
	}
	
	public Actividad(int actividad_id, String descripcion) {
		this.actividad_id = actividad_id;
		this.descripcion = descripcion;	
	}
	
	public Actividad(int actividad_id, String descripcion, String estado) {
		this.actividad_id = actividad_id;
		this.descripcion = descripcion;
		this.estado = estado;	
	}

	public int getActividad_id() {
		return actividad_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setActividad_id(int actividad_id) {
		this.actividad_id = actividad_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
