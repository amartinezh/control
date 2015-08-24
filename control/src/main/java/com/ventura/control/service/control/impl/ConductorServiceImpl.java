package com.ventura.control.service.control.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Conductor;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ConductorService;

@Service
public class ConductorServiceImpl implements ConductorService {

	@Autowired
	private RepositorioDao conductorDao;

	@Transactional
	public void agregarConductor(boolean existe, Conductor conductor) {
		if (existe) {
			conductorDao.actualizar(conductor);
		} else {
			conductorDao.agregar(conductor);
		}
	}

	@Transactional
	public void borrarConductor(Conductor conductor) {
		Conductor cond = (Conductor) conductorDao.getElemento(conductor, Integer.parseInt(conductor.getDocumento()));
		conductorDao.borrar(cond);
	}

}
