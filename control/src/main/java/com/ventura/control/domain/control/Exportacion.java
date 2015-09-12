package com.ventura.control.domain.control;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="exportacion", schema="control")
public class Exportacion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958570611606289360L;
	@Id
    @Column(name = "exportacion_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="control.exportacion_exportacion_id_seq")
	@SequenceGenerator(name="control.exportacion_exportacion_id_seq", sequenceName="control.exportacion_exportacion_id_seq", allocationSize=1)
	private int exportacion_id;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@JoinColumn(name = "tipo_producto_id", referencedColumnName = "tipo_producto_id")
	@ManyToOne
	private TipoProducto tipo_producto_id;
	
	@Column(name = "cliente")
	private String cliente;
	
	@Column(name = "pais_destino")
	private String pais_destino;
	
	@Column(name = "puerto_llegada")
	private String puerto_llegada;
	
	@Column(name = "placa_vehiculo")
	private String placa_vehiculo;
	
	@Column(name = "numero_contenedor")
	private String numero_contenedor;
	
	@Column(name = "numero_trailer")
	private String numero_trailer;
	
	@Column(name = "transportadora")
	private String transportadora;
	
	@Column(name = "inicio_operacion")
	private Date inicio_operacion;
	
	@Column(name = "inicio_inspeccion")
	private Date inicio_inspeccion;
	
	@Column(name = "inicio_cargue")
	private Date inicio_cargue;
	
	@Column(name = "fin_cargue")
	private Date fin_cargue;
	
	@Column(name = "fin_operacion")
	private Date fin_operacion;
	
	@Column(name = "peso_pt_kg")
	private int peso_pt_kg;
	
	@Column(name = "peso_boina")
	private int peso_boina;
	
	@Column(name = "numero_pedido")
	private String numero_pedido;
	
	@Column(name = "pacas")
	private String pacas;
	
	@Column(name = "numero_bobinas")
	private int numero_bobinas;
	
	@Column(name = "numero_cajas")
	private int numero_cajas;
	
	@Column(name = "acta_antinarcotico")
	private String acta_antinarcotico;
	
	@Column(name = "numero_precinto")
	private String numero_precinto;
	
	@Column(name = "sello_aleatorio")
	private String sello_aleatorio;
	
	@Column(name = "vigilante_proteccion")
	private String vigilante_proteccion;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "estado")
	private String estado;

	public Exportacion() {
		// TODO Auto-generated constructor stub
	}

	public Exportacion(int exportacion_id, 
			java.util.Date fecha,
			TipoProducto tipo_producto_id, 
			String cliente, 
			String pais_destino,
			String puerto_llegada,
			String placa_vehiculo,
			String numero_contenedor,
			String numero_trailer,
			String transportadora, 
			Date inicio_operacion,
			Date inicio_inspeccion, 
			Date inicio_cargue,
			Date fin_cargue,
			Date fin_operacion, 
			int peso_pt_kg, 
			int peso_boina,
			String numero_pedido, 
			String pacas, 
			int numero_bobinas,
			int numero_cajas, 
			String acta_antinarcotico,
			String numero_precinto, 
			String sello_aleatorio,
			String vigilante_proteccion, 
			String observaciones,
			String estado) {
		super();
		this.exportacion_id = exportacion_id;
		this.fecha = fecha;
		this.tipo_producto_id = tipo_producto_id;
		this.cliente = cliente;
		this.pais_destino = pais_destino;
		this.puerto_llegada = puerto_llegada;
		this.placa_vehiculo = placa_vehiculo;
		this.numero_contenedor = numero_contenedor;
		this.numero_trailer = numero_trailer;
		this.transportadora = transportadora;
		this.inicio_operacion = inicio_operacion;
		this.inicio_inspeccion = inicio_inspeccion;
		this.inicio_cargue = inicio_cargue;
		this.fin_cargue = fin_cargue;
		this.fin_operacion = fin_operacion;
		this.peso_pt_kg = peso_pt_kg;
		this.peso_boina = peso_boina;
		this.numero_pedido = numero_pedido;
		this.pacas = pacas;
		this.numero_bobinas = numero_bobinas;
		this.numero_cajas = numero_cajas;
		this.acta_antinarcotico = acta_antinarcotico;
		this.numero_precinto = numero_precinto;
		this.sello_aleatorio = sello_aleatorio;
		this.vigilante_proteccion = vigilante_proteccion;
		this.observaciones = observaciones;
		this.estado = estado;
	}

	public int getExportacion_id() {
		return exportacion_id;
	}

	public void setExportacion_id(int exportacion_id) {
		this.exportacion_id = exportacion_id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public TipoProducto getTipo_producto_id() {
		return tipo_producto_id;
	}

	public void setTipo_producto_id(TipoProducto tipo_producto_id) {
		this.tipo_producto_id = tipo_producto_id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPais_destino() {
		return pais_destino;
	}

	public void setPais_destino(String pais_destino) {
		this.pais_destino = pais_destino;
	}

	public String getPuerto_llegada() {
		return puerto_llegada;
	}

	public void setPuerto_llegada(String puerto_llegada) {
		this.puerto_llegada = puerto_llegada;
	}

	public String getPlaca_vehiculo() {
		return placa_vehiculo;
	}

	public void setPlaca_vehiculo(String placa_vehiculo) {
		this.placa_vehiculo = placa_vehiculo;
	}

	public String getNumero_contenedor() {
		return numero_contenedor;
	}

	public void setNumero_contenedor(String numero_contenedor) {
		this.numero_contenedor = numero_contenedor;
	}

	public String getNumero_trailer() {
		return numero_trailer;
	}

	public void setNumero_trailer(String numero_trailer) {
		this.numero_trailer = numero_trailer;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public Date getInicio_operacion() {
		return inicio_operacion;
	}

	public void setInicio_operacion(Date inicio_operacion) {
		this.inicio_operacion = inicio_operacion;
	}

	public Date getInicio_inspeccion() {
		return inicio_inspeccion;
	}

	public void setInicio_inspeccion(Date inicio_inspeccion) {
		this.inicio_inspeccion = inicio_inspeccion;
	}

	public Date getInicio_cargue() {
		return inicio_cargue;
	}

	public void setInicio_cargue(Date inicio_cargue) {
		this.inicio_cargue = inicio_cargue;
	}

	public Date getFin_cargue() {
		return fin_cargue;
	}

	public void setFin_cargue(Date fin_cargue) {
		this.fin_cargue = fin_cargue;
	}

	public Date getFin_operacion() {
		return fin_operacion;
	}

	public void setFin_operacion(Date fin_operacion) {
		this.fin_operacion = fin_operacion;
	}

	public int getPeso_pt_kg() {
		return peso_pt_kg;
	}

	public void setPeso_pt_kg(int peso_pt_kg) {
		this.peso_pt_kg = peso_pt_kg;
	}

	public int getPeso_boina() {
		return peso_boina;
	}

	public void setPeso_boina(int peso_boina) {
		this.peso_boina = peso_boina;
	}

	public String getNumero_pedido() {
		return numero_pedido;
	}

	public void setNumero_pedido(String numero_pedido) {
		this.numero_pedido = numero_pedido;
	}

	public String getPacas() {
		return pacas;
	}

	public void setPacas(String pacas) {
		this.pacas = pacas;
	}

	public int getNumero_bobinas() {
		return numero_bobinas;
	}

	public void setNumero_bobinas(int numero_bobinas) {
		this.numero_bobinas = numero_bobinas;
	}

	public int getNumero_cajas() {
		return numero_cajas;
	}

	public void setNumero_cajas(int numero_cajas) {
		this.numero_cajas = numero_cajas;
	}

	public String getActa_antinarcotico() {
		return acta_antinarcotico;
	}

	public void setActa_antinarcotico(String acta_antinarcotico) {
		this.acta_antinarcotico = acta_antinarcotico;
	}

	public String getNumero_precinto() {
		return numero_precinto;
	}

	public void setNumero_precinto(String numero_precinto) {
		this.numero_precinto = numero_precinto;
	}

	public String getSello_aleatorio() {
		return sello_aleatorio;
	}

	public void setSello_aleatorio(String sello_aleatorio) {
		this.sello_aleatorio = sello_aleatorio;
	}

	public String getVigilante_proteccion() {
		return vigilante_proteccion;
	}

	public void setVigilante_proteccion(String vigilante_proteccion) {
		this.vigilante_proteccion = vigilante_proteccion;
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
		return "Exportacion [exportacion_id=" + exportacion_id + ", fecha="
				+ fecha + ", tipo_producto_id=" + tipo_producto_id
				+ ", cliente=" + cliente + ", pais_destino=" + pais_destino
				+ ", puerto_llegada=" + puerto_llegada + ", placa_vehiculo="
				+ placa_vehiculo + ", numero_contenedor=" + numero_contenedor
				+ ", numero_trailer=" + numero_trailer + ", transportadora="
				+ transportadora + ", inicio_operacion=" + inicio_operacion
				+ ", inicio_inspeccion=" + inicio_inspeccion
				+ ", inicio_cargue=" + inicio_cargue + ", fin_cargue="
				+ fin_cargue + ", fin_operacion=" + fin_operacion
				+ ", peso_pt_kg=" + peso_pt_kg + ", peso_boina=" + peso_boina
				+ ", numero_pedido=" + numero_pedido + ", pacas=" + pacas
				+ ", numero_bobinas=" + numero_bobinas + ", numero_cajas="
				+ numero_cajas + ", acta_antinarcotico=" + acta_antinarcotico
				+ ", numero_precinto=" + numero_precinto + ", sello_aleatorio="
				+ sello_aleatorio + ", vigilante_proteccion="
				+ vigilante_proteccion + ", observaciones=" + observaciones
				+ ", estado=" + estado + "]";
	}

	
}
