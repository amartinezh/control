package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Exportacion;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.domain.control.TipoProducto;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ExportacionService;

@Service
public class ExportacionServiceImpl implements ExportacionService {

	@Autowired
	private RepositorioDao exportacionDao;

	@Transactional	
	public void agregarExportacion(boolean existe, Exportacion exportacion) {
		if (existe == true){
			exportacionDao.actualizar(exportacion);
		}
		else {
			exportacionDao.agregar(exportacion);
		}
	}

	@Transactional
	public void borrarExportacion(Exportacion exportacion) {
		Exportacion cont = (Exportacion) exportacionDao.getElemento(exportacion, exportacion.getExportacion_id());
		exportacionDao.borrar(cont);
	}
	
	@Transactional
	public boolean validarExportacion(Exportacion exportacion) {
		Exportacion cont = (Exportacion) exportacionDao.getElemento( , exportacion.getExportacion_id());
		if (cont == null)
			return false;
		return true;
	}

	@Transactional
	public List<Exportacion> listarExportacion() {
		List<Exportacion> listExportacion = new LinkedList<Exportacion>();
		String sql = "Select a.exportacion_id as exportacion_id, a.fecha as fecha, a.tipo_producto_id as tipo_producto_id, a.cliente as cliente, a.pais_destino as pais_destino, a.puerto_llegada as puerto_llegada, a.placa_vehiculo as placa_vehiculo, a.numero_contenedor as numero_contenedor, a.numero_trailer as numero_trailer, a.transportadora as transportadora, a.inicio_operacion as inicio_operacion, a.inicio_inspeccion as inicio_inspeccion, a.inicio_cargue as inicio_cargue, a.fin_cargue as fin_cargue, a.fin_operacion as fin_operacion, a.peso_pt_kg as peso_pt_kg, a.peso_boina as peso_boina, a.numero_pedido as numero_pedido, a.pacas as pacas, a.numero_bobinas as numero_bobinas, a.numero_cajas as numero_cajas, a.acta_antinarcotico as acta_antinarcotico, a.numero_precinto as numero_precinto, a.sello_aleatorio as sello_aleatorio, a.vigilante_proteccion as vigilante_proteccion, a.observaciones as observaciones, a.estado as estado FROM Exportacion as a";
		List<Object[]> data = exportacionDao.listar(sql);
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		if (data != null) {
			for (Object[] d : data) {
					try {
						// codigo_trabajador d[13].toString()
						listExportacion.add(new Exportacion(Integer.parseInt(d[0].toString()), 
																	formatter.parse(d[1].toString()), 
																	(TipoProducto) d[2], 
																	d[3].toString(), 
																	d[4].toString(), 
																	d[5].toString(), 
																	d[6].toString(), 
																	d[7].toString(), 
																	d[8].toString(), 
																	d[9].toString(), 
																	formatter.parse(d[10].toString()), 
																	formatter.parse(d[11].toString()), 
																	formatter.parse(d[12].toString()), 
																	formatter.parse(d[13].toString()), 
																	formatter.parse(d[14].toString()), 
																	Integer.parseInt(d[15].toString()), 
																	Integer.parseInt(d[16].toString()), 
																	d[17].toString(), 
																	d[18].toString(), 
																	Integer.parseInt(d[19].toString()), 
																	Integer.parseInt(d[20].toString()), 
																	d[21].toString(), 
																	d[22].toString(), 
																	d[23].toString(),
																	d[24].toString(),
																	d[25].toString(),
																	"1"));
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
			}
		}
		return listExportacion;
	}
}