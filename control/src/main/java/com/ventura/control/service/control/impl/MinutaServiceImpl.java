package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Actividad;
import com.ventura.control.domain.control.Area;
import com.ventura.control.domain.control.Minuta;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.MinutaService;

@Service
public class MinutaServiceImpl implements MinutaService {

	@Autowired
	private RepositorioDao minutaDao;

	@Transactional	
	public void agregarMinuta(boolean existe, Minuta minuta) {
		if (existe == true){
			minutaDao.actualizar(minuta);
		}
		else {
			minutaDao.agregar(minuta);
		}
	}

	@Transactional
	public void borrarMinuta(Minuta minuta) {
		Minuta cont = (Minuta) minutaDao.getElemento(minuta, minuta.getMinuta_id());
		minutaDao.borrar(cont);
	}
	
	@Transactional
	public boolean validarMinuta(Minuta minuta) {
		Minuta cont = (Minuta) minutaDao.getElemento(minuta, minuta.getMinuta_id());
		if (cont == null)
			return false;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Minuta> listarMinuta() {
	/*	List<Minuta> listMinuta = new LinkedList<Minuta>();
		String sql = "Select a.minuta_id as minuta_id, a.placa as placa, a.dependencia_id as dependencia_id, a.area_id as area_id, a.actividad_id as actividad_id, a.hora_sistema as hora_sistema, a.hora_inicio as hora_inicio, a.hora_terminacion as hora_terminacion, a.codigo_trabajador as codigo_trabajador, a.observaciones as observaciones, a.estado as estado FROM Minuta as a";
		List<Object[]> data = minutaDao.listar(sql);
		//java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		if (data != null) {
			for (Object[] d : data) {
					try {
						listMinuta.add(new Minuta(0, d[1].toString(), (Dependencia) d[2], (Area) d[3], (Actividad) d[4], d[5].toString(), d[6].toString(), d[7].toString(), d[8].toString(), d[9].toString(), "1"));
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
			}
		}
		return listMinuta;*/
		String sql = "Select m From Minuta as m";
		return minutaDao.listarObjeto(sql).getResultList();
	}
}