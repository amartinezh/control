package com.ventura.control.service.control.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.CajaMenor;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.CajaMenorService;

@Service
public class CajaMenorServiceImpl implements CajaMenorService {
	
	@Autowired
	private RepositorioDao cajaMenorDao;
	
	public void agregarCajaMenor(CajaMenor cajaMenor) {
		if(cajaMenor.getId() == 0) {
			cajaMenorDao.agregar(cajaMenor);
		}
	}
	
}
