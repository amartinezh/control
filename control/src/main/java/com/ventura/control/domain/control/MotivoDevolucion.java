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
@Table(name="motivo_devolucion", schema="admin")
public class MotivoDevolucion implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4401990661882305536L;
	@Id
    @Column(name = "motivo_devolucion_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.motivo_devolucion_motivo_devolucion_id_seq")
	@SequenceGenerator(name="admin.motivo_devolucion_motivo_devolucion_id_seq", sequenceName="admin.motivo_devolucion_motivo_devolucion_id_seq", allocationSize=1)
	private int motivo_devolucion_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;
	
	public MotivoDevolucion() {
		// TODO Auto-generated constructor stub
	}
	
	public MotivoDevolucion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public MotivoDevolucion(int motivo_devolucion_id, String descripcion) {
		this.motivo_devolucion_id = motivo_devolucion_id;
		this.descripcion = descripcion;	
	}
	
	public MotivoDevolucion(int motivo_devolucion_id, String descripcion, String estado) {
		this.motivo_devolucion_id = motivo_devolucion_id;
		this.descripcion = descripcion;
		this.estado = estado;	
	}
	
	public int getMotivo_devolucion_id() {
		return motivo_devolucion_id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setMotivo_devolucion_id(int motivo_devolucion_id) {
		this.motivo_devolucion_id = motivo_devolucion_id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
