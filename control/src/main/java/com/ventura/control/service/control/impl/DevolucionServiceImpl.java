package com.ventura.control.service.control.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.Devolucion;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.DevolucionService;

@Service
public class DevolucionServiceImpl implements DevolucionService {

	@Autowired
	private RepositorioDao devolucionDao;
	
	public void agregarDevolucion(Devolucion devolucion) {
		if(devolucion.getDevolucionId() == 0) {
			devolucionDao.agregar(devolucion);
		}
		
	}

	public void borrarDevolucion(Devolucion devolucion) {
		Devolucion dev = (Devolucion) devolucionDao.getElemento(devolucion, devolucion.getDevolucionId());
		devolucionDao.borrar(dev);
	}

	@SuppressWarnings("unchecked")
	public List<Devolucion> listarDevolucion() {
		String sql = "Select d FROM Devolucion as d";
		return devolucionDao.listarObjeto(sql).getResultList();
	}	

}
