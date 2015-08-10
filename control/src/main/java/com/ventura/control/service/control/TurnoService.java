package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Turno;

public interface TurnoService {

	public void agregarTurno(Turno turno);
	public void borrarTurno(Turno turno);
	public List<Turno> listarTurnos();
	
}
