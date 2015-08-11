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
@Table(name = "tipo_producto", schema = "admin")
public class TipoProducto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5538683727394011830L;
	@Id
	@Column(name = "tipo_producto_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin.tipo_producto_tipo_producto_id_seq")
	@SequenceGenerator(name = "admin.tipo_producto_tipo_producto_id_seq", sequenceName = "admin.tipo_producto_tipo_producto_id_seq", allocationSize = 1)
	private int tipo_producto_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public TipoProducto() {
		// TODO Auto-generated constructor stub
	}

	public TipoProducto(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoProducto(int tipo_producto_id, String descripcion) {
		this.tipo_producto_id = tipo_producto_id;
		this.descripcion = descripcion;
	}

	public TipoProducto(int tipo_producto_id, String descripcion, String estado) {
		this.tipo_producto_id = tipo_producto_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getTipo_producto_id() {
		return tipo_producto_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setTipo_producto_id(int tipo_producto_id) {
		this.tipo_producto_id = tipo_producto_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
