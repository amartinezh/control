package com.ventura.control.domain.control;

import java.util.Date;

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
	private static final long serialVersionUID = 3958570614606289361L;
	@Id
    @Column(name = "permiso_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="control.permisos_permiso_id_seq")
	@SequenceGenerator(name="control.permisos_permiso_id_seq", sequenceName="control.permisos_permiso_id_seq", allocationSize=1)
	private int permiso_id;
	
	@Column(name = "tipo_permiso_id")
	private Integer tipo_permiso_id;
	
	@Column(name = "fecha")
	private java.util.Date fecha;
	
	@NotEmpty
	@Column(name = "codigo_trabajador")
	private String codigo_trabajador;
	
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
	@Column(name = "novedad")
	private String novedad;
	
	@Column(name = "estado")
	private String estado;

	public Permiso() {
		// TODO Auto-generated constructor stub
	}
	
	public Permiso(int permiso_id) {
		this.permiso_id=permiso_id;
	}
	
	public Permiso(int permiso_id, Integer tipo_permiso_id, Date fecha,
			String codigo_trabajador, String hora_entrada, String hora_salida,
			String recibido_por, String novedad, String estado) {
		super();
		this.permiso_id = permiso_id;
		this.tipo_permiso_id = tipo_permiso_id;
		this.fecha = fecha;
		this.codigo_trabajador = codigo_trabajador;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
		this.recibido_por = recibido_por;
		this.novedad = novedad;
		this.estado = estado;
	}

	public int getPermiso_id() {
		return permiso_id;
	}

	public void setPermiso_id(int permiso_id) {
		this.permiso_id = permiso_id;
	}

	public Integer getTipo_permiso_id() {
		return tipo_permiso_id;
	}

	public void setTipo_permiso_id(Integer tipo_permiso_id) {
		this.tipo_permiso_id = tipo_permiso_id;
	}

	public java.util.Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}

	public String getCodigo_trabajador() {
		return codigo_trabajador;
	}

	public void setCodigo_trabajador(String codigo_trabajador) {
		this.codigo_trabajador = codigo_trabajador;
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

	public String getNovedad() {
		return novedad;
	}

	public void setNovedad(String novedad) {
		this.novedad = novedad;
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

	@Override
	public String toString() {
		return "Permiso [permiso_id=" + permiso_id + ", tipo_permiso_id="
				+ tipo_permiso_id + ", fecha=" + fecha + ", codigo_trabajador="
				+ codigo_trabajador + ", hora_entrada=" + hora_entrada
				+ ", hora_salida=" + hora_salida + ", recibido_por="
				+ recibido_por + ", novedad=" + novedad + ", estado=" + estado
				+ "]";
	}
	
	
}
