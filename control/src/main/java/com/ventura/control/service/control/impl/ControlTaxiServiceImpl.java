package com.ventura.control.service.control.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.ControlTaxi;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ControlTaxiService;

@Service
public class ControlTaxiServiceImpl implements ControlTaxiService {

	@Autowired
	private RepositorioDao controlTaxiDao;
	
	public void agregarControlTaxi(ControlTaxi controlTaxi) {
		if(controlTaxi.getId() == 0) {
			controlTaxiDao.agregar(controlTaxi);
		}
		
	}

}
