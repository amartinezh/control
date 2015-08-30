package com.ventura.control.domain.control;

import java.io.Serializable;
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
@Table(name="dependencia", schema="admin")
public class Dependencia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3437891644388721895L;
	
	@Id
    @Column(name = "dependencia_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admin.dependencia_dependencia_id_seq")
	@SequenceGenerator(name="admin.dependencia_dependencia_id_seq", sequenceName="admin.dependencia_dependencia_id_seq", allocationSize=1)
	private int dependencia_id;
	
	@Column(name = "descripcion")
    @NotEmpty
	private String descripcion;
	 
	@Column(name = "estado")
	private String estado;
	
	@OneToMany(mappedBy = "dependencia_id")
    private Set<Contratista> contratistaSet;
	
	@OneToMany(mappedBy = "dependencia_id")
    private Set<Conductor> conductorSet;
	
	@OneToMany(mappedBy = "dependencia_id")
    private Set<Visitante> visitanteSet;
	
	@OneToMany(mappedBy = "dependenciaId")
    private Set<PrestaLlave> prestaLlaveSet;
	
	public Dependencia() {
		// TODO Auto-generated constructor stub
	}
	
	public Dependencia(int dependencia_id) {
		this.dependencia_id = dependencia_id;
	}
	
	public Dependencia(int dependencia_id, String descripcion) {
		this.dependencia_id = dependencia_id;
		this.descripcion = descripcion;
	}
	
	public Dependencia(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getDependencia_id() {
		return dependencia_id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setDependencia_id(int dependencia_id) {
		this.dependencia_id = dependencia_id;
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
	
	public Set<PrestaLlave> getPrestaLlaveSet() {
		return prestaLlaveSet;
	}
	
	public void setPrestaLlaveSet(Set<PrestaLlave> prestaLlaveSet) {
		this.prestaLlaveSet = prestaLlaveSet;
	}
	
}
