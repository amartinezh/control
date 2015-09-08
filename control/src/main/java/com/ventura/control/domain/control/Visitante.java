package com.ventura.control.domain.control;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "visitante", schema = "control")
public class Visitante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1920772279254725875L;
	
	@Id
    @Basic(optional = false)
    @Column(name = "documento")
    private String documento;
	
    @Column(name = "nombre_completo")
    private String nombre_completo;
    
    @Column(name = "apellido")
    private String apellido;
    
    @JoinColumn(name = "tipo_persona_id", referencedColumnName = "tipo_persona_id")
	@ManyToOne
	private TipoPersona tipo_persona_id;
	
	@JoinColumn(name = "dependencia_id", referencedColumnName = "dependencia_id")
	@ManyToOne
	private Dependencia dependencia_id;
    
    @Column(name = "coreo_e")
    private String coreo_e;
    
    @Column(name = "telefono")
    private String telefono;
    @Lob
    @Column(name = "scan_foto")
    private String scan_foto;
    @Lob
    @Column(name = "scan_cedula")
    private String scan_cedula;
    @Lob
    @Column(name = "scan_huella")
    private String scan_huella;
    
    @Column(name = "empresa")
    private String empresa;
    
    @Column(name = "nit_empresa")
    private String nitEmpresa;
    
    @Column(name = "placa")
    private String placa;
    
    @Column(name = "eps")
    private String eps;
    
    @Column(name = "eps_vence")
	private Date eps_vence;
    
    @Column(name = "alr")
    private String alr;
    
    @Column(name = "alr_vence")
    private Date alrVence;
    
    @Column(name = "inventario")
    private String inventario;
    @Lob
    @Column(name = "scan_inventario")
    private String scan_inventario;
    
    @Column(name = "observaciones")
    private String observaciones;
    
    @Column(name = "estado")
    private String estado;
    
    public Visitante() {
    }

    public Visitante(String documento) {
        this.documento = documento;
    }

	public Visitante(String documento, String nombre_completo, String apellido,
			TipoPersona tipo_persona_id, Dependencia dependencia_id,
			String coreo_e, String telefono, String scan_foto,
			String scan_cedula, String scan_huella, String empresa,
			String nitEmpresa, String placa, String eps, Date eps_vence,
			String alr, Date alrVence, String inventario,
			String scan_inventario, String observaciones, String estado) {
		super();
		this.documento = documento;
		this.nombre_completo = nombre_completo;
		this.apellido = apellido;
		this.tipo_persona_id = tipo_persona_id;
		this.dependencia_id = dependencia_id;
		this.coreo_e = coreo_e;
		this.telefono = telefono;
		this.scan_foto = scan_foto;
		this.scan_cedula = scan_cedula;
		this.scan_huella = scan_huella;
		this.empresa = empresa;
		this.nitEmpresa = nitEmpresa;
		this.placa = placa;
		this.eps = eps;
		this.eps_vence = eps_vence;
		this.alr = alr;
		this.alrVence = alrVence;
		this.inventario = inventario;
		this.scan_inventario = scan_inventario;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	public TipoPersona getTipo_persona_id() {
		return tipo_persona_id;
	}

	public void setTipo_persona_id(TipoPersona tipo_persona_id) {
		this.tipo_persona_id = tipo_persona_id;
	}

	public Dependencia getDependencia_id() {
		return dependencia_id;
	}

	public void setDependencia_id(Dependencia dependencia_id) {
		this.dependencia_id = dependencia_id;
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

	public Date getEps_vence() {
		return eps_vence;
	}

	public void setEps_vence(Date eps_vence) {
		this.eps_vence = eps_vence;
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

	public String getScan_inventario() {
		return scan_inventario;
	}

	public void setScan_inventario(String scan_inventario) {
		this.scan_inventario = scan_inventario;
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
	public String toString() {
		return "Visitante [documento=" + documento + ", nombre_completo="
				+ nombre_completo + ", apellido=" + apellido
				+ ", tipo_persona_id=" + tipo_persona_id + ", dependencia_id="
				+ dependencia_id + ", coreo_e=" + coreo_e + ", telefono="
				+ telefono + ", scan_foto=" + scan_foto + ", scan_cedula="
				+ scan_cedula + ", scan_huella=" + scan_huella + ", empresa="
				+ empresa + ", nitEmpresa=" + nitEmpresa + ", placa=" + placa
				+ ", eps=" + eps + ", eps_vence=" + eps_vence + ", alr=" + alr
				+ ", alrVence=" + alrVence + ", inventario=" + inventario
				+ ", scan_inventario=" + scan_inventario + ", observaciones="
				+ observaciones + ", estado=" + estado + "]";
	}
    
    

}
