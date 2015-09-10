package com.ventura.control.service.control.impl;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Actividad;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ActividadService;
 
@Service
public class ActividadServiceImpl implements ActividadService {

	@Autowired
	private RepositorioDao actividadDao;

	@Transactional
	public void agregarActividad(Actividad actividad) {
		if (actividad.getActividad_id() == 0)
			actividadDao.agregar(actividad);
		else {
			Actividad dep = (Actividad) actividadDao.getElemento(actividad, actividad.getActividad_id());
			dep.setDescripcion(actividad.getDescripcion());
			actividadDao.actualizar(actividad);
		}
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
	
	@Transactional
	public LinkedHashMap<Integer, String> cmbActividades() {
		LinkedHashMap<Integer, String> listActividad = new LinkedHashMap<Integer, String>();
		String sql = "Select a.actividad_id as actividad_id, a.descripcion as descripcion FROM Actividad as a";
		List<Object[]> data = actividadDao.listar(sql);
		listActividad.put(0, "Seleccione");
		if (data != null) {
			for (Object[] d : data) {
				listActividad.put(Integer.parseInt(d[0].toString()), d[1].toString());
			}
		}
		return listActividad;
	}

}
