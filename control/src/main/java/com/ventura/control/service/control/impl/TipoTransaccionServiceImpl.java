package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.TipoTransaccion;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.TipoTransaccionService;

@Service
public class TipoTransaccionServiceImpl implements TipoTransaccionService {

	@Autowired
	private RepositorioDao tipoTransaccionDao;

	@Transactional
	public void agregarTipoTransaccion(TipoTransaccion tipoTransaccion) {
		tipoTransaccionDao.agregar(tipoTransaccion);
	}

	@Transactional
	public void borrarTipoTransaccion(TipoTransaccion tipoTransaccion) {
		TipoTransaccion tipTran = (TipoTransaccion) tipoTransaccionDao
				.getElemento(tipoTransaccion,
						tipoTransaccion.getTipo_transaccion_id());
		tipoTransaccionDao.borrar(tipTran);
	}

	@Transactional
	public List<TipoTransaccion> listarTipoTransacciones() {
		List<TipoTransaccion> listTipTrans = new LinkedList<TipoTransaccion>();
		String sql = "Select t.tipo_transaccion_id as tipo_transaccion_id, t.descripcion as descripcion FROM TipoTransaccion as t";
		List<Object[]> data = tipoTransaccionDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listTipTrans.add(new TipoTransaccion(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listTipTrans;
	}

}