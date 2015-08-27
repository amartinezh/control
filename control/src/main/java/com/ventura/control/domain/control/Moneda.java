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
@Table(name="moneda", schema="admin")
public class Moneda implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958570611606289360L;
	@Id
    @Column(name = "moneda_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.moneda_moneda_id_seq")
	@SequenceGenerator(name="admin.moneda_moneda_id_seq", sequenceName="admin.moneda_moneda_id_seq", allocationSize=1)
	private int moneda_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public Moneda() {
		// TODO Auto-generated constructor stub
	}
	
	public Moneda(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Moneda(int moneda_id) {
		this.moneda_id = moneda_id;
	}
	
	public Moneda(int moneda_id, String descripcion) {
		this.moneda_id = moneda_id;
		this.descripcion = descripcion;
	}
	
	public Moneda(int moneda_id, String descripcion, String estado) {
		this.moneda_id = moneda_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getMoneda_id() {
		return moneda_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setMoneda_id(int moneda_id) {
		this.moneda_id = moneda_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
