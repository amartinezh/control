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
@Table(name = "origen", schema = "admin")
public class Origen implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4602987823063270903L;
	@Id
	@Column(name = "origen_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin.origen_id_origen_seq")
	@SequenceGenerator(name = "admin.origen_id_origen_seq", sequenceName = "admin.origen_id_origen_seq", allocationSize = 1)
	private int origen_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public Origen() {
		// TODO Auto-generated constructor stub
	}
	
	public Origen(int origen_id) {
		this.origen_id = origen_id;
	}

	public Origen(String descripcion) {
		this.descripcion = descripcion;
	}

	public Origen(int origen_id, String descripcion) {
		this.origen_id = origen_id;
		this.descripcion = descripcion;
	}

	public Origen(int origen_id, String descripcion, String estado) {
		this.origen_id = origen_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getOrigen_id() {
		return origen_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setOrigen_id(int origen_id) {
		this.origen_id = origen_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
