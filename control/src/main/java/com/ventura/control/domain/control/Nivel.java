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
@Table(name="nivel", schema="admin")
public class Nivel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958570611606289360L;
	@Id
    @Column(name = "nivel_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.nivel_nivel_id_seq")
	@SequenceGenerator(name="admin.nivel_nivel_id_seq", sequenceName="admin.nivel_nivel_id_seq", allocationSize=1)
	private int nivel_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public Nivel() {
		// TODO Auto-generated constructor stub
	}
	
	public Nivel(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Nivel(int nivel_id) {
		this.nivel_id = nivel_id;
	}
	
	public Nivel(int nivel_id, String descripcion) {
		this.nivel_id = nivel_id;
		this.descripcion = descripcion;
	}
	
	public Nivel(int nivel_id, String descripcion, String estado) {
		this.nivel_id = nivel_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getNivel_id() {
		return nivel_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setNivel_id(int nivel_id) {
		this.nivel_id = nivel_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
