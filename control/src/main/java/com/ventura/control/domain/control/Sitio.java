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
@Table(name="sitio", schema="admin")
public class Sitio implements java.io.Serializable {

	private static final long serialVersionUID = 6632457384984220822L;
	/**
	 * 
	 */	
	@Id
    @Column(name = "sitio_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.sitio_sitio_id_seq")
	@SequenceGenerator(name="admin.sitio_sitio_id_seq", sequenceName="admin.sitio_sitio_id_seq", allocationSize=1)
	private int sitio_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;
	
	public Sitio() {
		// TODO Auto-generated constructor stub
	}
	
	public Sitio(String descripcion) {
		this.descripcion = descripcion;	
	}
	
	public Sitio(int sitio_id, String descripcion, String estado) {
		this.sitio_id = sitio_id;
		this.descripcion = descripcion;
		this.estado = estado;	
	}

	public int getSitio_id() {
		return sitio_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setSitio_id(int actividad_id) {
		this.sitio_id = actividad_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
