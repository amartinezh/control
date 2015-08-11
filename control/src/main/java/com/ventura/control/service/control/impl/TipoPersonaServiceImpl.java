package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.TipoPersonaService;

@Service
public class TipoPersonaServiceImpl implements TipoPersonaService {

	@Autowired
	private RepositorioDao tipoPersonaDao;

	@Transactional
	public void agregarTipoPersona(TipoPersona tipoPersona) {
		tipoPersonaDao.agregar(tipoPersona);
	}

	@Transactional
	public void borrarTipoPersona(TipoPersona tipoPersona) {
		TipoPersona tipPer = (TipoPersona) tipoPersonaDao.getElemento(
				tipoPersona, tipoPersona.getTipo_persona_id());
		tipoPersonaDao.borrar(tipPer);
	}

	@Transactional
	public List<TipoPersona> listarTipoPersonas() {
		List<TipoPersona> listTipPers = new LinkedList<TipoPersona>();
		String sql = "Select t.tipo_persona_id as tipo_persona_id, t.descripcion as descripcion FROM TipoPersona as t";
		List<Object[]> data = tipoPersonaDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listTipPers.add(new TipoPersona(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listTipPers;
	}

}
