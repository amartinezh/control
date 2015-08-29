package com.ventura.control.domain.control;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conductor", schema = "control")
public class Conductor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7769999857269503305L;

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

    public Conductor() {
    }

    public Conductor(String documento) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documento != null ? documento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "control.Conductor[ documento=" + documento + " ]";
    }
	
}
