package com.ventura.control.domain.nomina;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.ventura.control.domain.control.Contratista;
import com.ventura.control.domain.control.Permiso;

@Entity
@Table(name="tipo_permiso", schema="nomina")
public class TipoPermiso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958570611606289360L;
	@Id
    @Column(name = "tipo_permiso_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="nomina.tipo_permiso_tipo_permiso_id_seq")
	@SequenceGenerator(name="nomina.tipo_permiso_tipo_permiso_id_seq", sequenceName="nomina.tipo_permiso_tipo_permiso_id_seq", allocationSize=1)
	private int tipo_permiso_id;
	
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "estado")
	private String estado;
	
	@OneToMany(mappedBy = "tipo_permiso_id")
    private Set<Permiso> permisoSet;

	public TipoPermiso() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoPermiso(int tipo_permiso_id) {
		this.tipo_permiso_id=tipo_permiso_id;
	}
	
	public TipoPermiso(int tipo_permiso_id, String descripcion) {
		super();
		this.tipo_permiso_id = tipo_permiso_id;
		this.descripcion = descripcion;
		this.estado="1";
	}
	
	public int getTipo_permiso_id() {
		return tipo_permiso_id;
	}

	public void setTipo_permiso_id(int tipo_permiso_id) {
		this.tipo_permiso_id = tipo_permiso_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
