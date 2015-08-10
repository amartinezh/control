package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Actividad;

public interface ActividadService {

	public void agregarActividad(Actividad actividad);
	public void borrarActividad(Actividad actividad);
	public List<Actividad> listarActividades();	

}
