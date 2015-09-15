package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.ControlBus;
import com.ventura.control.domain.control.ControlTaxi;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ControlTaxiService;

@Service
public class ControlTaxiServiceImpl implements ControlTaxiService {

	@Autowired
	private RepositorioDao controlTaxiDao;
	
	public void agregarControlTaxi(ControlTaxi controlTaxi) {
		if(controlTaxi.getControlTaxiId() == 0) {
			controlTaxiDao.agregar(controlTaxi);
		}		
	}
	
	public List<ControlTaxi> listarControlTaxi() {
		String sql = "Select c FROM ControlTaxi as c";
		@SuppressWarnings("unchecked")
		List<ControlTaxi> data = controlTaxiDao.listarObjeto(sql).getResultList();
		if (data != null) {
			return data;
		} else {
			return new LinkedList<ControlTaxi>();
		}
	}

}
