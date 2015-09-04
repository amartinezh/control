package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
    @Column(name = "permiso_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="control.antecedente_antecedente_id_seq")
	@SequenceGenerator(name="control.antecedente_antecedente_id_seq", sequenceName="control.antecedente_antecedente_id_seq", allocationSize=1)
	private int permiso_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "antecedente_id")
	private int antecedente_id;
	
	@Column(name = "contratista_documento")
	private String contratista_documento;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Lob
	@Column(name = "scan_responsabilidad")
	private byte[] scan_responsabilidad;
	@Lob
	@Column(name = "scan_produraduria")
	private byte[] scan_produraduria;
	@Lob
	@Column(name = "scan_policia")
	private byte[] scan_policia;
	@Lob
	@Column(name = "scan_fiscalia")
	private byte[] scan_fiscalia;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "estado")
	private String estado;

	public Antecedente() {
	}

	public Antecedente(int antecedente_id) {
		this.antecedente_id = antecedente_id;
	}

	public Antecedente(int permiso_id, int antecedente_id,
			String contratista_documento, Date fecha,
			byte[] scan_responsabilidad, byte[] scan_produraduria,
			byte[] scan_policia, byte[] scan_fiscalia, String observaciones,
			String estado) {
		super();
		this.permiso_id = permiso_id;
		this.antecedente_id = antecedente_id;
		this.contratista_documento = contratista_documento;
		this.fecha = fecha;
		this.scan_responsabilidad = scan_responsabilidad;
		this.scan_produraduria = scan_produraduria;
		this.scan_policia = scan_policia;
		this.scan_fiscalia = scan_fiscalia;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public int getPermiso_id() {
		return permiso_id;
	}

	public void setPermiso_id(int permiso_id) {
		this.permiso_id = permiso_id;
	}

	public int getAntecedente_id() {
		return antecedente_id;
	}

	public void setAntecedente_id(int antecedente_id) {
		this.antecedente_id = antecedente_id;
	}

	public String getContratista_documento() {
		return contratista_documento;
	}

	public void setContratista_documento(String contratista_documento) {
		this.contratista_documento = contratista_documento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public byte[] getScan_responsabilidad() {
		return scan_responsabilidad;
	}

	public void setScan_responsabilidad(byte[] scan_responsabilidad) {
		this.scan_responsabilidad = scan_responsabilidad;
	}

	public byte[] getScan_produraduria() {
		return scan_produraduria;
	}

	public void setScan_produraduria(byte[] scan_produraduria) {
		this.scan_produraduria = scan_produraduria;
	}

	public byte[] getScan_policia() {
		return scan_policia;
	}

	public void setScan_policia(byte[] scan_policia) {
		this.scan_policia = scan_policia;
	}

	public byte[] getScan_fiscalia() {
		return scan_fiscalia;
	}

	public void setScan_fiscalia(byte[] scan_fiscalia) {
		this.scan_fiscalia = scan_fiscalia;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + antecedente_id;
		result = prime
				* result
				+ ((contratista_documento == null) ? 0 : contratista_documento
						.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + permiso_id;
		result = prime * result + Arrays.hashCode(scan_fiscalia);
		result = prime * result + Arrays.hashCode(scan_policia);
		result = prime * result + Arrays.hashCode(scan_produraduria);
		result = prime * result + Arrays.hashCode(scan_responsabilidad);
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
		if (antecedente_id != other.antecedente_id)
			return false;
		if (contratista_documento == null) {
			if (other.contratista_documento != null)
				return false;
		} else if (!contratista_documento.equals(other.contratista_documento))
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
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (permiso_id != other.permiso_id)
			return false;
		if (!Arrays.equals(scan_fiscalia, other.scan_fiscalia))
			return false;
		if (!Arrays.equals(scan_policia, other.scan_policia))
			return false;
		if (!Arrays.equals(scan_produraduria, other.scan_produraduria))
			return false;
		if (!Arrays.equals(scan_responsabilidad, other.scan_responsabilidad))
			return false;
		return true;
	}
	
	

}
