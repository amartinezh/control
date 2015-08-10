package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.Turno;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.TurnoService;

@Service
public class TurnoServiceImpl implements TurnoService {
	
	@Autowired
	private RepositorioDao turnoDao;

	public void agregarTurno(Turno turno) {
		turnoDao.agregar(turno);
	}

	public void borrarTurno(Turno turno) {
		Turno tur = (Turno) turnoDao.getElemento(turno, turno.getTurno_id());
		turnoDao.borrar(tur);
	}

	public List<Turno> listarTurnos() {
		List<Turno> listTurno = new LinkedList<Turno>();
		return listTurno;
	}
	

}
