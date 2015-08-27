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
@Table(name="centro_costo", schema="admin")
public class CentroCosto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3158570611606289360L;
	@Id
    @Column(name = "centro_costo_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.centro_costo_centro_costo_id_seq")
	@SequenceGenerator(name="admin.centro_costo_centro_costo_id_seq", sequenceName="admin.centro_costo_centro_costo_id_seq", allocationSize=1)
	private int centro_costo_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public CentroCosto() {
		// TODO Auto-generated constructor stub
	}
	
	public CentroCosto(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public CentroCosto(int centro_costo_id) {
		this.centro_costo_id = centro_costo_id;
	}
	
	public CentroCosto(int centro_costo_id, String descripcion) {
		this.centro_costo_id = centro_costo_id;
		this.descripcion = descripcion;
	}
	
	public CentroCosto(int centro_costo_id, String descripcion, String estado) {
		this.centro_costo_id = centro_costo_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getCentro_costo_id() {
		return centro_costo_id;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setCentro_costo_id(int centro_costo_id) {
		this.centro_costo_id = centro_costo_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
