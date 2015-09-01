package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.bind.annotation.RequestParam;

@Entity
@Table(name = "contratista", schema = "control")
public class Contratista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9068113467850707780L;

	@Id
	@Basic(optional = false)
	@Column(name = "documento")
	private String documento;
	@Column(name = "nombre_completo")
	private String nombreCompleto;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "coreo_e")
	private String coreoE;
	@Column(name = "telefono")
	private String telefono;
	@Lob
	@Column(name = "scan_foto")
	private String scanFoto;
	@Lob
	@Column(name = "scan_cedula")
	private String scanCedula;
	@Lob
	@Column(name = "scan_huella")
	private String scanHuella;
	@Column(name = "empresa")
	private String empresa;
	@Column(name = "nit_empresa")
	private String nitEmpresa;
	@Column(name = "fecha_ven_curso_ley")
	private String fechaVenCursoLey;
	@Column(name = "id_persona_responsable")
	private String idPersonaResponsable;
	@Column(name = "placa")
	private String placa;
	@Column(name = "eps")
	private String eps;
	@Column(name = "eps_vence")
	@Temporal(TemporalType.DATE)
	private Date epsVence;
	@Column(name = "alr")
	private String alr;
	@Column(name = "alr_vence")
	@Temporal(TemporalType.DATE)
	private Date alrVence;
	@Column(name = "inventario")
	private String inventario;
	@Lob
	@Column(name = "scan_inventario")
	private String scanInventario;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "estado")
	private String estado;
	@JoinColumn(name = "tipo_persona_id", referencedColumnName = "tipo_persona_id")
	@ManyToOne
	private TipoPersona tipoPersonaId;
	@JoinColumn(name = "dependencia_id", referencedColumnName = "dependencia_id")
	@ManyToOne
	private Dependencia dependencia_id;
	@OneToMany(mappedBy = "contratistaDocumento")
	private Set<Antecedente> antecedente;
	
	public Contratista(String documento, String nombreCompleto,
			String apellido, String coreoE, String telefono, String scanFoto,
			String scanCedula, String scanHuella, String empresa,
			String nitEmpresa, String fechaVenCursoLey,
			String idPersonaResponsable, String placa, String eps,
			Date epsVence, String alr, Date alrVence, String inventario,
			String scanInventario, String observaciones, String estado,
			TipoPersona tipoPersonaId, Dependencia dependencia_id,
			Set<Antecedente> antecedente) {
		super();
		this.documento = documento;
		this.nombreCompleto = nombreCompleto;
		this.apellido = apellido;
		this.coreoE = coreoE;
		this.telefono = telefono;
		this.scanFoto = scanFoto;
		this.scanCedula = scanCedula;
		this.scanHuella = scanHuella;
		this.empresa = empresa;
		this.nitEmpresa = nitEmpresa;
		this.fechaVenCursoLey = fechaVenCursoLey;
		this.idPersonaResponsable = idPersonaResponsable;
		this.placa = placa;
		this.eps = eps;
		this.epsVence = epsVence;
		this.alr = alr;
		this.alrVence = alrVence;
		this.inventario = inventario;
		this.scanInventario = scanInventario;
		this.observaciones = observaciones;
		this.estado = estado;
		this.tipoPersonaId = tipoPersonaId;
		this.dependencia_id = dependencia_id;
		this.antecedente = antecedente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCoreoE() {
		return coreoE;
	}

	public void setCoreoE(String coreoE) {
		this.coreoE = coreoE;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getScanFoto() {
		return scanFoto;
	}

	public void setScanFoto(String scanFoto) {
		this.scanFoto = scanFoto;
	}

	public String getScanCedula() {
		return scanCedula;
	}

	public void setScanCedula(String scanCedula) {
		this.scanCedula = scanCedula;
	}

	public String getScanHuella() {
		return scanHuella;
	}

	public void setScanHuella(String scanHuella) {
		this.scanHuella = scanHuella;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNitEmpresa() {
		return nitEmpresa;
	}

	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}

	public String getFechaVenCursoLey() {
		return fechaVenCursoLey;
	}

	public void setFechaVenCursoLey(String fechaVenCursoLey) {
		this.fechaVenCursoLey = fechaVenCursoLey;
	}

	public String getIdPersonaResponsable() {
		return idPersonaResponsable;
	}

	public void setIdPersonaResponsable(String idPersonaResponsable) {
		this.idPersonaResponsable = idPersonaResponsable;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public Date getEpsVence() {
		return epsVence;
	}

	public void setEpsVence(Date epsVence) {
		this.epsVence = epsVence;
	}

	public String getAlr() {
		return alr;
	}

	public void setAlr(String alr) {
		this.alr = alr;
	}

	public Date getAlrVence() {
		return alrVence;
	}

	public void setAlrVence(Date alrVence) {
		this.alrVence = alrVence;
	}

	public String getInventario() {
		return inventario;
	}

	public void setInventario(String inventario) {
		this.inventario = inventario;
	}

	public String getScanInventario() {
		return scanInventario;
	}

	public void setScanInventario(String scanInventario) {
		this.scanInventario = scanInventario;
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

	public TipoPersona getTipoPersonaId() {
		return tipoPersonaId;
	}

	public void setTipoPersonaId(TipoPersona tipoPersonaId) {
		this.tipoPersonaId = tipoPersonaId;
	}

	public Dependencia getDependencia_id() {
		return dependencia_id;
	}

	public void setDependencia_id(Dependencia dependencia_id) {
		this.dependencia_id = dependencia_id;
	}

	public Set<Antecedente> getAntecedente() {
		return antecedente;
	}

	public void setAntecedente(Set<Antecedente> antecedente) {
		this.antecedente = antecedente;
	}

	
}
