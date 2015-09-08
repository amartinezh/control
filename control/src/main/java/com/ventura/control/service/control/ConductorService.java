package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Conductor;

public interface ConductorService {

	public void agregarConductor(boolean existe, Conductor conductor);
	public void borrarConductor(Conductor conductor);
	public boolean validarConductor(Conductor conductor);
	public List<Conductor> listarConductor();
	
}
