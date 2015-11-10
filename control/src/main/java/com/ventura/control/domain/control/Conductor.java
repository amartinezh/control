package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conductor", schema = "control")
public class Conductor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9068113467850707990L;

	@Id
	@Column(name = "documento")
	private String documento;
	
	@Column(name = "fecha_registro")
	private java.util.Date fecha_registro;
	
	@Column(name = "nombre_completo")
	private String nombre_completo;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "coreo_e")
	private String coreo_e;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "scan_foto")
	private String scan_foto;
	
	@Column(name = "scan_cedula")
	private String scan_cedula;
	
	@Column(name = "scan_huella")
	private String scan_huella;
	
	@Column(name = "empresa_de_transporte")
	private String empresa_de_transporte;
	
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "trailer")
	private String trailer;
	
	@Column(name = "eps")
	private String eps;
	
	@Column(name = "eps_vence")
	private java.util.Date eps_vence;
	
	@Column(name = "alr")
	private String alr;
	
	@Column(name = "alr_vence")
	private java.util.Date alr_vence;
	
	@Column(name = "patiero")
	private String patiero;
	
	@Column(name = "documento_patiero")
	private String documento_patiero;
	
	@Column(name = "scan_orden_cargue")
	private String scan_orden_cargue;
	
	@Column(name = "scan_tarjeta_propiedad")
	private String scan_tarjeta_propiedad;
	
	@Column(name = "scan_alr")
	private String scan_alr;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "estado")
	private String estado;
	
	public Conductor(){
		
	}
	
	public Conductor(String documento){
		this.documento=documento;
	}

	public Conductor(String documento, Date fecha_registro, String nombre_completo, String apellido, String coreo_e,
			String telefono, String scan_foto, String scan_cedula, String scan_huella, String empresa_de_transporte,
			String placa, String trailer, String eps, Date eps_vence, String alr, Date alr_vence, String patiero,
			String documento_patiero, String scan_orden_cargue, String scan_tarjeta_propiedad, String scan_alr,
			String observaciones, String estado) {
		super();
		this.documento = documento;
		this.fecha_registro = fecha_registro;
		this.nombre_completo = nombre_completo;
		this.apellido = apellido;
		this.coreo_e = coreo_e;
		this.telefono = telefono;
		this.scan_foto = scan_foto;
		this.scan_cedula = scan_cedula;
		this.scan_huella = scan_huella;
		this.empresa_de_transporte = empresa_de_transporte;
		this.placa = placa;
		this.trailer = trailer;
		this.eps = eps;
		this.eps_vence = eps_vence;
		this.alr = alr;
		this.alr_vence = alr_vence;
		this.patiero = patiero;
		this.documento_patiero = documento_patiero;
		this.scan_orden_cargue = scan_orden_cargue;
		this.scan_tarjeta_propiedad = scan_tarjeta_propiedad;
		this.scan_alr = scan_alr;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public java.util.Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(java.util.Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCoreo_e() {
		return coreo_e;
	}

	public void setCoreo_e(String coreo_e) {
		this.coreo_e = coreo_e;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getScan_foto() {
		return scan_foto;
	}

	public void setScan_foto(String scan_foto) {
		this.scan_foto = scan_foto;
	}

	public String getScan_cedula() {
		return scan_cedula;
	}

	public void setScan_cedula(String scan_cedula) {
		this.scan_cedula = scan_cedula;
	}

	public String getScan_huella() {
		return scan_huella;
	}

	public void setScan_huella(String scan_huella) {
		this.scan_huella = scan_huella;
	}

	public String getEmpresa_de_transporte() {
		return empresa_de_transporte;
	}

	public void setEmpresa_de_transporte(String empresa_de_transporte) {
		this.empresa_de_transporte = empresa_de_transporte;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public java.util.Date getEps_vence() {
		return eps_vence;
	}

	public void setEps_vence(java.util.Date eps_vence) {
		this.eps_vence = eps_vence;
	}

	public String getAlr() {
		return alr;
	}

	public void setAlr(String alr) {
		this.alr = alr;
	}

	public java.util.Date getAlr_vence() {
		return alr_vence;
	}

	public void setAlr_vence(java.util.Date alr_vence) {
		this.alr_vence = alr_vence;
	}

	public String getPatiero() {
		return patiero;
	}

	public void setPatiero(String patiero) {
		this.patiero = patiero;
	}

	public String getDocumento_patiero() {
		return documento_patiero;
	}

	public void setDocumento_patiero(String documento_patiero) {
		this.documento_patiero = documento_patiero;
	}

	public String getScan_orden_cargue() {
		return scan_orden_cargue;
	}

	public void setScan_orden_cargue(String scan_orden_cargue) {
		this.scan_orden_cargue = scan_orden_cargue;
	}

	public String getScan_tarjeta_propiedad() {
		return scan_tarjeta_propiedad;
	}

	public void setScan_tarjeta_propiedad(String scan_tarjeta_propiedad) {
		this.scan_tarjeta_propiedad = scan_tarjeta_propiedad;
	}

	public String getScan_alr() {
		return scan_alr;
	}

	public void setScan_alr(String scan_alr) {
		this.scan_alr = scan_alr;
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

	@Override
	public String toString() {
		return "Conductor [documento=" + documento + ", fecha_registro=" + fecha_registro + ", nombre_completo="
				+ nombre_completo + ", apellido=" + apellido + ", coreo_e=" + coreo_e + ", telefono=" + telefono
				+ ", scan_foto=" + scan_foto + ", scan_cedula=" + scan_cedula + ", scan_huella=" + scan_huella
				+ ", empresa_de_transporte=" + empresa_de_transporte + ", placa=" + placa + ", trailer=" + trailer
				+ ", eps=" + eps + ", eps_vence=" + eps_vence + ", alr=" + alr + ", alr_vence=" + alr_vence
				+ ", patiero=" + patiero + ", documento_patiero=" + documento_patiero + ", scan_orden_cargue="
				+ scan_orden_cargue + ", scan_tarjeta_propiedad=" + scan_tarjeta_propiedad + ", scan_alr=" + scan_alr
				+ ", observaciones=" + observaciones + ", estado=" + estado + "]";
	}

	
}
