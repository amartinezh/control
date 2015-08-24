package com.ventura.control.service.control;

import com.ventura.control.domain.control.Visitante;

public interface VisitanteService {

	public void agregarVisitante(boolean existe, Visitante visitante);
	public void borrarVisitante(Visitante visitante);
	
}
