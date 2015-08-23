package com.ventura.control.domain.control;

import java.io.Serializable;
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
    private Dependencia dependenciaId;
    
    public Visitante() {
    }

    public Visitante(String documento) {
        this.documento = documento;
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

    public byte[] getScanFoto() {
        return scanFoto;
    }

    public void setScanFoto(byte[] scanFoto) {
        this.scanFoto = scanFoto;
    }

    public byte[] getScanCedula() {
        return scanCedula;
    }

    public void setScanCedula(byte[] scanCedula) {
        this.scanCedula = scanCedula;
    }

    public byte[] getScanHuella() {
        return scanHuella;
    }

    public void setScanHuella(byte[] scanHuella) {
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

    public byte[] getScanInventario() {
        return scanInventario;
    }

    public void setScanInventario(byte[] scanInventario) {
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

    public Dependencia getDependenciaId() {
        return dependenciaId;
    }

    public void setDependenciaId(Dependencia dependenciaId) {
        this.dependenciaId = dependenciaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documento != null ? documento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "control.Visitante[ documento=" + documento + " ]";
    }

}
