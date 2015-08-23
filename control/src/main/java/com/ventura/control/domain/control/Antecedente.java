package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "antecedente", schema = "control")
public class Antecedente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6542964097398704437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_antecedente")
	private Integer idAntecedente;
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Lob
	@Column(name = "scan_responsabilidad")
	private byte[] scanResponsabilidad;
	@Lob
	@Column(name = "scan_produraduria")
	private byte[] scanProduraduria;
	@Lob
	@Column(name = "scan_policia")
	private byte[] scanPolicia;
	@Lob
	@Column(name = "scan_fiscalia")
	private byte[] scanFiscalia;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "estado")
	private String estado;
	@JoinColumn(name = "contratista_documento", referencedColumnName = "documento")
	@ManyToOne
	private Contratista contratistaDocumento;

	public Antecedente() {
	}

	public Antecedente(Integer idAntecedente) {
		this.idAntecedente = idAntecedente;
	}

	public Integer getIdAntecedente() {
		return idAntecedente;
	}

	public void setIdAntecedente(Integer idAntecedente) {
		this.idAntecedente = idAntecedente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public byte[] getScanResponsabilidad() {
		return scanResponsabilidad;
	}

	public void setScanResponsabilidad(byte[] scanResponsabilidad) {
		this.scanResponsabilidad = scanResponsabilidad;
	}

	public byte[] getScanProduraduria() {
		return scanProduraduria;
	}

	public void setScanProduraduria(byte[] scanProduraduria) {
		this.scanProduraduria = scanProduraduria;
	}

	public byte[] getScanPolicia() {
		return scanPolicia;
	}

	public void setScanPolicia(byte[] scanPolicia) {
		this.scanPolicia = scanPolicia;
	}

	public byte[] getScanFiscalia() {
		return scanFiscalia;
	}

	public void setScanFiscalia(byte[] scanFiscalia) {
		this.scanFiscalia = scanFiscalia;
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

	public Contratista getContratistaDocumento() {
		return contratistaDocumento;
	}

	public void setContratistaDocumento(Contratista contratistaDocumento) {
		this.contratistaDocumento = contratistaDocumento;
	}

	@Override
	public String toString() {
		return "Antecedente [idAntecedente=" + idAntecedente + ", fecha="
				+ fecha + ", scanResponsabilidad="
				+ Arrays.toString(scanResponsabilidad) + ", scanProduraduria="
				+ Arrays.toString(scanProduraduria) + ", scanPolicia="
				+ Arrays.toString(scanPolicia) + ", scanFiscalia="
				+ Arrays.toString(scanFiscalia) + ", observaciones="
				+ observaciones + ", estado=" + estado
				+ ", contratistaDocumento=" + contratistaDocumento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((contratistaDocumento == null) ? 0 : contratistaDocumento
						.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result
				+ ((idAntecedente == null) ? 0 : idAntecedente.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + Arrays.hashCode(scanFiscalia);
		result = prime * result + Arrays.hashCode(scanPolicia);
		result = prime * result + Arrays.hashCode(scanProduraduria);
		result = prime * result + Arrays.hashCode(scanResponsabilidad);
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
		Antecedente other = (Antecedente) obj;
		if (contratistaDocumento == null) {
			if (other.contratistaDocumento != null)
				return false;
		} else if (!contratistaDocumento.equals(other.contratistaDocumento))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idAntecedente == null) {
			if (other.idAntecedente != null)
				return false;
		} else if (!idAntecedente.equals(other.idAntecedente))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (!Arrays.equals(scanFiscalia, other.scanFiscalia))
			return false;
		if (!Arrays.equals(scanPolicia, other.scanPolicia))
			return false;
		if (!Arrays.equals(scanProduraduria, other.scanProduraduria))
			return false;
		if (!Arrays.equals(scanResponsabilidad, other.scanResponsabilidad))
			return false;
		return true;
	}
	
}
