package com.ventura.control.service.control;

import java.util.LinkedHashMap;
import java.util.List;

import com.ventura.control.domain.control.Actividad;

public interface ActividadService {

	public void agregarActividad(Actividad actividad);
	public void borrarActividad(Actividad actividad);
	public List<Actividad> listarActividades();	
	public LinkedHashMap<Integer, String> cmbActividades();
}
