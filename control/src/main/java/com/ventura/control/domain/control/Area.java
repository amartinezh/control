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
@Table(name="area", schema="admin")
public class Area implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958570611606289360L;
	@Id
    @Column(name = "area_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.area_area_id_seq")
	@SequenceGenerator(name="admin.area_area_id_seq", sequenceName="admin.area_area_id_seq", allocationSize=1)
	private int area_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public Area() {
		// TODO Auto-generated constructor stub
	}
	
	public Area(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Area(int area_id) {
		this.area_id = area_id;
	}
	
	public Area(int area_id, String descripcion) {
		this.area_id = area_id;
		this.descripcion = descripcion;
	}
	
	public Area(int area_id, String descripcion, String estado) {
		this.area_id = area_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getArea_id() {
		return area_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
