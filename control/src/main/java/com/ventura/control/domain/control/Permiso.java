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
@Table(name="permisos", schema="control")
public class Permiso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958570611606289360L;
	@Id
    @Column(name = "permiso_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="control.permisos_permiso_id_seq")
	@SequenceGenerator(name="control.permisos_permiso_id_seq", sequenceName="control.permisos_permiso_id_seq", allocationSize=1)
	private int permiso_id;
	
	@NotEmpty
	@Column(name = "codigo_trabajador")
	private String codigo_trabajador;
	
	@NotEmpty
	@Column(name = "novedad")
	private String novedad;
	
	@NotEmpty
	@Column(name = "hora_entrada")
	private String hora_entrada;
	
	@NotEmpty
	@Column(name = "hora_salida")
	private String hora_salida;
	
	@NotEmpty
	@Column(name = "recibido_por")
	private String recibido_por;
	
	@NotEmpty
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "estado")
	private String estado;

	public Permiso() {
		// TODO Auto-generated constructor stub
	}

	public Permiso(int permiso_id, String codigo_trabajador, String novedad,
			String hora_entrada, String hora_salida, String recibido_por,
			String observaciones, String estado) {
		this.permiso_id = permiso_id;
		this.codigo_trabajador = codigo_trabajador;
		this.novedad = novedad;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
		this.recibido_por = recibido_por;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public Permiso(int permiso_id) {
		this.permiso_id = permiso_id;
	}

	public int getPermiso_id() {
		return permiso_id;
	}

	public void setPermiso_id(int permiso_id) {
		this.permiso_id = permiso_id;
	}

	public String getCodigo_trabajador() {
		return codigo_trabajador;
	}

	public void setCodigo_trabajador(String codigo_trabajador) {
		this.codigo_trabajador = codigo_trabajador;
	}

	public String getNovedad() {
		return novedad;
	}

	public void setNovedad(String novedad) {
		this.novedad = novedad;
	}

	public String getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public String getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}

	public String getRecibido_por() {
		return recibido_por;
	}

	public void setRecibido_por(String recibido_por) {
		this.recibido_por = recibido_por;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
