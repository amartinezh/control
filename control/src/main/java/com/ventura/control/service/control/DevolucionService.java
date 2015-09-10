package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Devolucion;

public interface DevolucionService {

	public void agregarDevolucion(Devolucion devolucion);
	public void borrarDevolucion(Devolucion devolucion);
	public List<Devolucion> listarDevolucion();
	
}
