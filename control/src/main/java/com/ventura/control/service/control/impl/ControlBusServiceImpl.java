package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.ControlBus;
import com.ventura.control.domain.control.Permiso;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ControlBusService;

@Service
public class ControlBusServiceImpl implements ControlBusService{

	@Autowired
	private RepositorioDao controlBusDao;
	
	@Transactional
	public void agregarControlBus(ControlBus controlBus) {
		if(controlBus.getControl_bus_id() == 0) {
			controlBusDao.agregar(controlBus);
		} else {
			ControlBus cBus = (ControlBus) controlBusDao.getElemento(controlBus, controlBus.getControl_bus_id());
			cBus.setTurnoId(controlBus.getTurnoId());
			cBus.setOrigenId(controlBus.getOrigenId());
			cBus.setHora(controlBus.getHora());
			cBus.setNroPasajeros(controlBus.getNroPasajeros());
			cBus.setObservaciones(controlBus.getObservaciones());
			controlBusDao.actualizar(cBus);
		}			
	}
	
	@Transactional
	public List<ControlBus> listarControlBus() {
		String sql = "Select c FROM ControlBus as c";
		@SuppressWarnings("unchecked")
		List<ControlBus> data = controlBusDao.listarObjeto(sql).getResultList();
		if (data != null) {
			return data;
		} else {
			return new LinkedList<ControlBus>();
		}
	}

	@Transactional
	public void borrarControlBus(ControlBus controlBus) {
		ControlBus obj = (ControlBus) controlBusDao.getElemento(controlBus, controlBus.getControl_bus_id());
		controlBusDao.borrar(obj);
		
	}

}
