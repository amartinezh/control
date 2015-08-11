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
@Table(name = "tipo_encomienda", schema = "admin")
public class TipoEncomienda implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1260229888799897028L;
	@Id
	@Column(name = "tipo_encomienda_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin.tipo_encomienda_tipo_encomienda_id_seq")
	@SequenceGenerator(name = "admin.tipo_encomienda_tipo_encomienda_id_seq", sequenceName = "admin.tipo_encomienda_tipo_encomienda_id_seq", allocationSize = 1)
	private int tipo_encomienda_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public TipoEncomienda() {
		// TODO Auto-generated constructor stub
	}

	public TipoEncomienda(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public TipoEncomienda(int tipo_encomienda_id, String descripcion) {
		this.tipo_encomienda_id = tipo_encomienda_id;
		this.descripcion = descripcion;
	}

	public TipoEncomienda(int tipo_encomienda_id, String descripcion, String estado) {
		this.tipo_encomienda_id = tipo_encomienda_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getTipo_encomienda_id() {
		return tipo_encomienda_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setTipo_encomienda_id(int tipo_encomienda_id) {
		this.tipo_encomienda_id = tipo_encomienda_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
