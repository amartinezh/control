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
@Table(name = "tipo_transaccion", schema = "admin")
public class TipoTransaccion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8630587916851841843L;
	@Id
	@Column(name = "tipo_transaccion_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin.tipo_transaccion_tipo_transaccion_id_seq")
	@SequenceGenerator(name = "admin.tipo_transaccion_tipo_transaccion_id_seq", sequenceName = "admin.tipo_transaccion_tipo_transaccion_id_seq", allocationSize = 1)
	private int tipo_transaccion_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;

	public TipoTransaccion() {
		// TODO Auto-generated constructor stub
	}

	public TipoTransaccion(int tipo_transaccion_id) {
		this.tipo_transaccion_id = tipo_transaccion_id;
	}
	
	public TipoTransaccion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoTransaccion(int tipo_transaccion_id, String descripcion) {
		this.tipo_transaccion_id = tipo_transaccion_id;
		this.descripcion = descripcion;
	}

	public TipoTransaccion(int tipo_transaccion_id, String descripcion,
			String estado) {
		this.tipo_transaccion_id = tipo_transaccion_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getTipo_transaccion_id() {
		return tipo_transaccion_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setTipo_transaccion_id(int tipo_transaccion_id) {
		this.tipo_transaccion_id = tipo_transaccion_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
