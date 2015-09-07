package com.ventura.control.service.control.impl;

import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Contratista;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.domain.nomina.TipoPermiso;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ContratistaService;

@Service
public class ContratistaServiceImpl implements ContratistaService {

	@Autowired
	private RepositorioDao contratistaDao;

	@Transactional	
	public void agregarContratista(boolean existe, Contratista contratista) {
		if (existe){
			contratistaDao.agregar(contratista);
		}
		else {
			Contratista obj = (Contratista) contratistaDao.getElemento(contratista, contratista.getDocumento());
			contratistaDao.actualizar(contratista);
		}
	}

	@Transactional
	public void borrarContratista(Contratista contratista) {
		Contratista cont = (Contratista) contratistaDao.getElemento(contratista, contratista.getDocumento());
		contratistaDao.borrar(cont);
	}
	
	@Transactional
	public boolean validarContratista(Contratista contratista) {
		Contratista cont = (Contratista) contratistaDao.getElemento(contratista, contratista.getDocumento());
		if (cont == null)
			return false;
		return true;
	}

	@Transactional
	public List<Contratista> listarContratistas() {
		List<Contratista> listContratista = new LinkedList<Contratista>();
		String sql = "Select a.documento as documento, a.nombre_completo as nombre_completo, a.apellido as apellido, a.tipo_persona_id as tipo_persona_id, a.dependencia_id as dependencia_id, a.coreo_e as coreo_e, a.telefono as telefono, a.scan_foto as scan_foto, a.scan_cedula as scan_cedula, a.scan_huella as scan_huella, a.empresa as empresa, a.nit_empresa as nit_empresa, a.fecha_ven_curso_ley as fecha_ven_curso_ley, a.codigo_trabajador as codigo_trabajador, a.placa as placa, a.eps as eps, a.eps_vence as eps_vence, a.alr as alr, a.alr_vence as alr_vence, a.inventario as inventario, a.scan_inventario as scan_inventario, a.observaciones as observaciones, a.estado as estado FROM Contratista as a";
		List<Object[]> data = contratistaDao.listar(sql);
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		if (data != null) {
			for (Object[] d : data) {
					try {
						// codigo_trabajador d[13].toString()
						listContratista.add(new Contratista(d[0].toString(), d[1].toString(), d[2].toString(), (TipoPersona) d[3], (Dependencia) d[4], d[5].toString(), d[6].toString(), d[7].toString(), d[8].toString(), d[9].toString(), d[10].toString(), d[11].toString(), formatter.parse(d[12].toString()), d[13].toString(), d[14].toString(), d[15].toString(), formatter.parse(d[16].toString()), d[17].toString(), formatter.parse(d[18].toString()), d[19].toString(), d[20].toString(), d[21].toString(),"1"));
					} catch (NumberFormatException e) {
						e.printStackTrace();
					} catch (ParseException e) {
						e.printStackTrace();
					}
			}
		}
		return listContratista;
	}
}
