package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.control.Turno;

public interface TurnoService {

	public void agregarTurno(Turno turno);
	public void borrarTurno(Turno turno);
	public List<Turno> listarTurnos();
	public Map<Integer, String> cmbTurnos();
	
}
