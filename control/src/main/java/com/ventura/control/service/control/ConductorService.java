package com.ventura.control.service.control;

import com.ventura.control.domain.control.Conductor;

public interface ConductorService {

	public void agregarConductor(boolean existe, Conductor conductor);
	public void borrarConductor(Conductor conductor);
	
}
