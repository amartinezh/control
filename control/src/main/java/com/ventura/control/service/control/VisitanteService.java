package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Visitante;

public interface VisitanteService {
	public void agregarVisitante(boolean existe, Visitante visitante);
	public void borrarVisitante(Visitante visitante);
	public boolean validarVisitante(Visitante visitante);
	public List<Visitante> listarVisitante();
}