package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

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
		turnoDao.agregar(turno);
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

}
