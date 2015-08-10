package com.ventura.control.service.control.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.Actividad;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ActividadService;

@Service
public class ActividadServiceImpl implements ActividadService {

	@Autowired
	private RepositorioDao actividadDao;

	public void agregarActividad(Actividad actividad) {
		actividadDao.agregar(actividad);

	}

	public void borrarActividad(Actividad actividad) {
		Actividad act = (Actividad) actividadDao.getElemento(actividad,
				actividad.getActividad_id());
		actividadDao.borrar(act);
	}

	public List<Actividad> listarActividades() {
		// TODO Auto-generated method stub
		return null;
	}

}
