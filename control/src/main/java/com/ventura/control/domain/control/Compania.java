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
@Table(name="compania", schema="admin")
public class Compania implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3386539700181062960L;
	@Id
    @Column(name = "compania_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.compania_id_compania_seq")
	@SequenceGenerator(name="admin.compania_id_compania_seq", sequenceName="admin.compania_id_compania_seq", allocationSize=1)
	private int compania_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;
	
	public Compania() {
		// TODO Auto-generated constructor stub
	}
	
	public Compania(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Compania(int compania_id, String descripcion) {
		this.compania_id = compania_id;
		this.descripcion = descripcion;	
	}
	
	public Compania(int compania_id, String descripcion, String estado) {
		this.compania_id = compania_id;
		this.descripcion = descripcion;
		this.estado = estado;	
	}
	
	public int getCompania_id() {
		return compania_id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setCompania_id(int compania_id) {
		this.compania_id = compania_id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
