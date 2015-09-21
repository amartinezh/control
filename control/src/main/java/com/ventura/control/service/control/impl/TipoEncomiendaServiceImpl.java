package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.TipoEncomienda;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.TipoEncomiendaService;

@Service
public class TipoEncomiendaServiceImpl implements TipoEncomiendaService {

	@Autowired
	private RepositorioDao tipoEncomiendaDao;

	@Transactional
	public void agregarTipoEncomienda(TipoEncomienda tipoEncomienda) {
		if (tipoEncomienda.getTipo_encomienda_id() == 0)
			tipoEncomienda=(TipoEncomienda) tipoEncomiendaDao.agregar_get(tipoEncomienda);
		else {
			TipoEncomienda obj = (TipoEncomienda) tipoEncomiendaDao.getElemento(tipoEncomienda, tipoEncomienda.getTipo_encomienda_id());
			obj.setDescripcion(tipoEncomienda.getDescripcion());
			tipoEncomiendaDao.actualizar(tipoEncomienda);
		}
	}

	@Transactional
	public void borrarTipoEncomienda(TipoEncomienda tipoEncomienda) {
		TipoEncomienda tipEnc = (TipoEncomienda) tipoEncomiendaDao.getElemento(
				tipoEncomienda, tipoEncomienda.getTipo_encomienda_id());
		tipoEncomiendaDao.borrar(tipEnc);
	}

	@Transactional
	public List<TipoEncomienda> listarTipoEncomiendas() {
		List<TipoEncomienda> listTipEnc = new LinkedList<TipoEncomienda>();
		String sql = "Select t.tipo_encomienda_id as tipo_encomienda_id, t.descripcion as descripcion FROM TipoEncomienda as t";
		List<Object[]> data = tipoEncomiendaDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listTipEnc.add(new TipoEncomienda(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listTipEnc;
	}

}
