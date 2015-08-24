package com.ventura.control.service.control.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Visitante;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.VisitanteService;

@Service
public class VisitanteServiceImpl implements VisitanteService {

	@Autowired
	private RepositorioDao visitanteDao;
	
	@Transactional
	public void agregarVisitante(boolean existe, Visitante visitante) {
		if(existe) {
			visitanteDao.actualizar(visitante);
		} else {
			visitanteDao.agregar(visitante);
		}		
	}

	@Transactional
	public void borrarVisitante(Visitante visitante) {
		Visitante vis = (Visitante) visitanteDao.getElemento(visitante, Integer.parseInt(visitante.getDocumento()));
		visitanteDao.borrar(vis);		
	}

}
