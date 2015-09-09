package com.ventura.control.service.control.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Origen;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.OrigenService;

@Service
public class OrigenServiceImpl implements OrigenService {

	@Autowired
	private RepositorioDao origenDao;

	@Transactional
	public void agregarOrigen(Origen origen) {
		if (origen.getOrigen_id() == 0)
			origenDao.agregar(origen);
		else {
			Origen obj = (Origen) origenDao.getElemento(origen, origen.getOrigen_id());
			obj.setDescripcion(origen.getDescripcion());
			origenDao.actualizar(origen);
		}
	}

	@Transactional
	public void borrarOrigen(Origen origen) {
		Origen ori = (Origen) origenDao.getElemento(origen,
				origen.getOrigen_id());
		origenDao.borrar(ori);
	}

	@Transactional
	public List<Origen> listarOrigenes() {
		List<Origen> listOrigen = new LinkedList<Origen>();
		String sql = "Select o.origen_id as origen_id, o.descripcion as descripcion FROM Origen as o";
		List<Object[]> data = origenDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listOrigen.add(new Origen(Integer.parseInt(d[0].toString()),
						d[1].toString()));
			}
		}
		return listOrigen;
	}
	
	public Map<Integer, String> cmbOrigenes() {
		Map<Integer, String> origenes = new HashMap<Integer, String>();
		String sql = "Select o.origen_id as origen_id, o.descripcion as descripcion FROM Origen as o";
		List<Object[]> data = origenDao.listar(sql);
		origenes.put(0, "Seleccione");
		if (data != null) {
			for (Object[] d : data) {
				origenes.put(Integer.parseInt(d[0].toString()), d[1].toString());
			}
		}
		return origenes;
	}

}
