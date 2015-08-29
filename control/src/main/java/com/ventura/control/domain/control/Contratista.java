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
	private byte[] scanFoto;
	@Lob
	@Column(name = "scan_cedula")
	private byte[] scanCedula;
	@Lob
	@Column(name = "scan_huella")
	private byte[] scanHuella;
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
	private byte[] scanInventario;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCoreoE() {
		return coreoE;
	}

	public String getTelefono() {
		return telefono;
	}

	public byte[] getScanFoto() {
		return scanFoto;
	}

	public byte[] getScanCedula() {
		return scanCedula;
	}

	public byte[] getScanHuella() {
		return scanHuella;
	}

	public String getEmpresa() {
		return empresa;
	} 

	public String getNitEmpresa() {
		return nitEmpresa;
	}

	public String getFechaVenCursoLey() {
		return fechaVenCursoLey;
	}

	public String getIdPersonaResponsable() {
		return idPersonaResponsable;
	}

	public String getPlaca() {
		return placa;
	}

	public String getEps() {
		return eps;
	}

	public Date getEpsVence() {
		return epsVence;
	}

	public String getAlr() {
		return alr;
	}

	public Date getAlrVence() {
		return alrVence;
	}

	public String getInventario() {
		return inventario;
	}

	public byte[] getScanInventario() {
		return scanInventario;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public TipoPersona getTipoPersonaId() {
		return tipoPersonaId;
	}

	public Dependencia getDependenciaId() {
		return dependencia_id;
	}

	public Set<Antecedente> getAntecedente() {
		return antecedente;
	}

	public void setCoreoE(String coreoE) {
		this.coreoE = coreoE;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setScanFoto(byte[] scanFoto) {
		this.scanFoto = scanFoto;
	}

	public void setScanCedula(byte[] scanCedula) {
		this.scanCedula = scanCedula;
	}

	public void setScanHuella(byte[] scanHuella) {
		this.scanHuella = scanHuella;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}

	public void setFechaVenCursoLey(String fechaVenCursoLey) {
		this.fechaVenCursoLey = fechaVenCursoLey;
	}

	public void setIdPersonaResponsable(String idPersonaResponsable) {
		this.idPersonaResponsable = idPersonaResponsable;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public void setEpsVence(Date epsVence) {
		this.epsVence = epsVence;
	}

	public void setAlr(String alr) {
		this.alr = alr;
	}

	public void setAlrVence(Date alrVence) {
		this.alrVence = alrVence;
	}

	public void setInventario(String inventario) {
		this.inventario = inventario;
	}

	public void setScanInventario(byte[] scanInventario) {
		this.scanInventario = scanInventario;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setTipoPersonaId(TipoPersona tipoPersonaId) {
		this.tipoPersonaId = tipoPersonaId;
	}

	public void setDependenciaId(Dependencia dependencia_id) {
		this.dependencia_id = dependencia_id;
	}

	public void setAntecedente(Set<Antecedente> antecedente) {
		this.antecedente = antecedente;
	}

	public Contratista() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Contratista [documento=" + documento + ", nombreCompleto="
				+ nombreCompleto + ", apellido=" + apellido + ", antecedente="
				+ antecedente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alr == null) ? 0 : alr.hashCode());
		result = prime * result
				+ ((alrVence == null) ? 0 : alrVence.hashCode());
		result = prime * result
				+ ((antecedente == null) ? 0 : antecedente.hashCode());
		result = prime * result
				+ ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((coreoE == null) ? 0 : coreoE.hashCode());
		result = prime * result
				+ ((dependencia_id == null) ? 0 : dependencia_id.hashCode());
		result = prime * result
				+ ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((eps == null) ? 0 : eps.hashCode());
		result = prime * result
				+ ((epsVence == null) ? 0 : epsVence.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime
				* result
				+ ((fechaVenCursoLey == null) ? 0 : fechaVenCursoLey.hashCode());
		result = prime
				* result
				+ ((idPersonaResponsable == null) ? 0 : idPersonaResponsable
						.hashCode());
		result = prime * result
				+ ((inventario == null) ? 0 : inventario.hashCode());
		result = prime * result
				+ ((nitEmpresa == null) ? 0 : nitEmpresa.hashCode());
		result = prime * result
				+ ((nombreCompleto == null) ? 0 : nombreCompleto.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + Arrays.hashCode(scanCedula);
		result = prime * result + Arrays.hashCode(scanFoto);
		result = prime * result + Arrays.hashCode(scanHuella);
		result = prime * result + Arrays.hashCode(scanInventario);
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result
				+ ((tipoPersonaId == null) ? 0 : tipoPersonaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contratista other = (Contratista) obj;
		if (alr == null) {
			if (other.alr != null)
				return false;
		} else if (!alr.equals(other.alr))
			return false;
		if (alrVence == null) {
			if (other.alrVence != null)
				return false;
		} else if (!alrVence.equals(other.alrVence))
			return false;
		if (antecedente == null) {
			if (other.antecedente != null)
				return false;
		} else if (!antecedente.equals(other.antecedente))
			return false;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (coreoE == null) {
			if (other.coreoE != null)
				return false;
		} else if (!coreoE.equals(other.coreoE))
			return false;
		if (dependencia_id == null) {
			if (other.dependencia_id != null)
				return false;
		} else if (!dependencia_id.equals(other.dependencia_id))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (eps == null) {
			if (other.eps != null)
				return false;
		} else if (!eps.equals(other.eps))
			return false;
		if (epsVence == null) {
			if (other.epsVence != null)
				return false;
		} else if (!epsVence.equals(other.epsVence))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaVenCursoLey == null) {
			if (other.fechaVenCursoLey != null)
				return false;
		} else if (!fechaVenCursoLey.equals(other.fechaVenCursoLey))
			return false;
		if (idPersonaResponsable == null) {
			if (other.idPersonaResponsable != null)
				return false;
		} else if (!idPersonaResponsable.equals(other.idPersonaResponsable))
			return false;
		if (inventario == null) {
			if (other.inventario != null)
				return false;
		} else if (!inventario.equals(other.inventario))
			return false;
		if (nitEmpresa == null) {
			if (other.nitEmpresa != null)
				return false;
		} else if (!nitEmpresa.equals(other.nitEmpresa))
			return false;
		if (nombreCompleto == null) {
			if (other.nombreCompleto != null)
				return false;
		} else if (!nombreCompleto.equals(other.nombreCompleto))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (!Arrays.equals(scanCedula, other.scanCedula))
			return false;
		if (!Arrays.equals(scanFoto, other.scanFoto))
			return false;
		if (!Arrays.equals(scanHuella, other.scanHuella))
			return false;
		if (!Arrays.equals(scanInventario, other.scanInventario))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoPersonaId == null) {
			if (other.tipoPersonaId != null)
				return false;
		} else if (!tipoPersonaId.equals(other.tipoPersonaId))
			return false;
		return true;
	}
	
	public Dependencia getDependencia_id() {
		return dependencia_id;
	}
	
	public void setDependencia_id(Dependencia dependencia_id) {
		this.dependencia_id = dependencia_id;
	}

}
