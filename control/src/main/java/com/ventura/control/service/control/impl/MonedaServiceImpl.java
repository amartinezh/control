package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Moneda;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.MonedaService;
 
@Service
public class MonedaServiceImpl implements MonedaService {

	@Autowired
	private RepositorioDao monedaDao;

	@Transactional
	public void agregarMoneda(Moneda moneda) {
		if (moneda.getMoneda_id() == 0)
			moneda=(Moneda) monedaDao.agregar_get(moneda);
		else {
			Moneda obj = (Moneda) monedaDao.getElemento(moneda, moneda.getMoneda_id());
			obj.setDescripcion(moneda.getDescripcion());
			monedaDao.actualizar(moneda);
		}
	}

	@Transactional
	public void borrarMoneda(Moneda moneda) {
		Moneda obj = (Moneda) monedaDao.getElemento(moneda, moneda.getMoneda_id());
		monedaDao.borrar(obj);
	}

	@Transactional
	public List<Moneda> listarMoneda() {
		List<Moneda> listMoneda = new LinkedList<Moneda>();
		String sql = "Select a.moneda_id as moneda_id, a.descripcion as descripcion FROM Moneda as a";
		List<Object[]> data = monedaDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listMoneda.add(new Moneda(Integer.parseInt(d[0].toString()), d[1]
						.toString()));
			}
		}
		return listMoneda;
	}

}
