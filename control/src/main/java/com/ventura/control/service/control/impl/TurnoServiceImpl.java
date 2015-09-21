package com.ventura.control.service.control.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Turno;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.TurnoService;

@Service
public class TurnoServiceImpl implements TurnoService {

	@Autowired
	private RepositorioDao turnoDao;

	@Transactional
	public void agregarTurno(Turno turno) {
		if (turno.getTurno_id() == 0)
			turno=(Turno) turnoDao.agregar_get(turno);
		else {
			Turno obj = (Turno) turnoDao.getElemento(turno, turno.getTurno_id());
			obj.setDescripcion(turno.getDescripcion());
			turnoDao.actualizar(turno);
		}
	}

	@Transactional
	public void borrarTurno(Turno turno) {
		Turno tur = (Turno) turnoDao.getElemento(turno, turno.getTurno_id());
		turnoDao.borrar(tur);
	}

	@Transactional
	public List<Turno> listarTurnos() {
		List<Turno> listTurno = new LinkedList<Turno>();
		String sql = "Select t.turno_id as turno_id, t.descripcion as descripcion FROM Turno as t";
		List<Object[]> data = turnoDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listTurno.add(new Turno(Integer.parseInt(d[0].toString()), d[1]
						.toString()));
			}
		}
		return listTurno;
	}
	
	@Transactional
	public Map<Integer, String> cmbTurnos() {
		Map<Integer, String> turnos = new HashMap<Integer, String>();
		String sql = "Select t.turno_id as turno_id, t.descripcion as descripcion FROM Turno as t";
		List<Object[]> data = turnoDao.listar(sql);
		turnos.put(0, "Seleccione");
		if (data != null) {
			for (Object[] d : data) {
				turnos.put(Integer.parseInt(d[0].toString()), d[1].toString());
			}
		}
		return turnos;
	}

}
