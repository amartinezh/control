package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Actividad;
import com.ventura.control.domain.control.Area;
import com.ventura.control.domain.control.ControlTaxi;
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
		String sql = "Select m From Minuta as m";
		@SuppressWarnings("unchecked")
		List<Minuta> data = minutaDao.listarObjeto(sql).getResultList();
		if (data != null) {
			return data;
		} else {
			return new LinkedList<Minuta>();
		}
	}
}