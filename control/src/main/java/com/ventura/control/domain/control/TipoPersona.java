package com.ventura.control.domain.control;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "tipo_persona", schema = "admin")
public class TipoPersona implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1399954494093567949L;
	@Id
	@Column(name = "tipo_persona_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin.tipo_persona_tipo_persona_id_seq")
	@SequenceGenerator(name = "admin.tipo_persona_tipo_persona_id_seq", sequenceName = "admin.tipo_persona_tipo_persona_id_seq", allocationSize = 1)
	private int tipo_persona_id;
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "estado")
	private String estado;
	
	@OneToMany(mappedBy = "tipoPersonaId")
    private Set<Contratista> contratistaSet;
	
	@OneToMany(mappedBy = "tipoPersonaId")
    private Set<Conductor> conductorSet;
	
	@OneToMany(mappedBy = "tipoPersonaId")
    private Set<Visitante> visitanteSet;

	public TipoPersona() {
		// TODO Auto-generated constructor stub
	}
	
	public TipoPersona(int tipo_persona_id) {
		this.tipo_persona_id = tipo_persona_id;
	}

	public TipoPersona(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public TipoPersona(int tipo_persona_id, String descripcion) {
		this.tipo_persona_id = tipo_persona_id;
		this.descripcion = descripcion;
	}

	public TipoPersona(int tipo_persona_id, String descripcion, String estado) {
		this.tipo_persona_id = tipo_persona_id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getTipo_persona_id() {
		return tipo_persona_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setTipo_persona_id(int tipo_persona_id) {
		this.tipo_persona_id = tipo_persona_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Set<Contratista> getContratistaSet() {
		return contratistaSet;
	}
	
	public void setContratistaSet(Set<Contratista> contratistaSet) {
		this.contratistaSet = contratistaSet;
	}

	public void setConductorSet(Set<Conductor> conductorSet) {
		this.conductorSet = conductorSet;
	}
	
	public Set<Conductor> getConductorSet() {
		return conductorSet;
	}
	
	public void setVisitanteSet(Set<Visitante> visitanteSet) {
		this.visitanteSet = visitanteSet;
	}
	
	public Set<Visitante> getVisitanteSet() {
		return visitanteSet;
	}
	
}
