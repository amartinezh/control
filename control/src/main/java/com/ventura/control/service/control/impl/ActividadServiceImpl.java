package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Actividad;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ActividadService;

@Service
public class ActividadServiceImpl implements ActividadService {

	@Autowired
	private RepositorioDao actividadDao;

	@Transactional
	public void agregarActividad(Actividad actividad) {
		actividadDao.agregar(actividad);

	}

	@Transactional
	public void borrarActividad(Actividad actividad) {
		Actividad act = (Actividad) actividadDao.getElemento(actividad,
				actividad.getActividad_id());
		actividadDao.borrar(act);
	}

	@Transactional
	public List<Actividad> listarActividades() {
		List<Actividad> listActividad = new LinkedList<Actividad>();
		String sql = "Select a.actividad_id as actividad_id, a.descripcion as descripcion FROM Actividad as a";
		List<Object[]> data = actividadDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listActividad.add(new Actividad(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listActividad;
	}

}
