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
@Table(name = "turno", schema = "admin")
public class Turno implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7321586009954528702L;
	@Id
	@Column(name = "turno_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin.turno_id_turno_seq")
	@SequenceGenerator(name = "admin.turno_id_turno_seq", sequenceName = "admin.turno_id_turno_seq", allocationSize = 1)
	private int turno_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public Turno() {
		// TODO Auto-generated constructor stub
	}
	
	public Turno(int turno_id) {
		this.turno_id = turno_id;
	}

	public Turno(String descripcion) {
		this.descripcion = descripcion;
	}

	public Turno(int turno_id, String descripcion) {
		this.turno_id = turno_id;
		this.descripcion = descripcion;
	}

	public Turno(int turno_id, String descripcion, String estado) {
		this.turno_id = turno_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getTurno_id() {
		return turno_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setTurno_id(int turno_id) {
		this.turno_id = turno_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
