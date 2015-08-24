package com.ventura.control.service.control.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Contratista;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ContratistaService;

@Service
public class ContratistaServiceImpl implements ContratistaService {

	@Autowired
	private RepositorioDao contratistaDao;

	@Transactional	
	public void agregarContratista(boolean existe, Contratista contratista) {
		if(existe) {
			contratistaDao.actualizar(contratista);
		} else {
			contratistaDao.agregar(contratista);
		}
		
	}

	@Transactional
	public void borrarContratista(Contratista contratista) {
		Contratista cont = (Contratista) contratistaDao.getElemento(contratista, Integer.parseInt(contratista.getDocumento()));
		contratistaDao.borrar(cont);		
	}

}
