package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.CentroCosto;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.CentroCostoService;

@Service
public class CentroCostoServiceImpl implements CentroCostoService {

	@Autowired
	private RepositorioDao centroDao;
 
	@Transactional
	public void agregarCentro(CentroCosto centro) {
		if (centro.getCentro_costo_id() == 0)
			centroDao.agregar(centro);
		else {
			CentroCosto obj = (CentroCosto) centroDao.getElemento(centro, centro.getCentro_costo_id());
			obj.setDescripcion(centro.getDescripcion());
			centroDao.actualizar(centro);
		}
	}

	@Transactional
	public void borrarCentro(CentroCosto centro) {
		CentroCosto obj = (CentroCosto) centroDao.getElemento(centro, centro.getCentro_costo_id());
		centroDao.borrar(obj);
	}

	@Transactional
	public List<CentroCosto> listarCentroCosto() {
		List<CentroCosto> listCentroCosto = new LinkedList<CentroCosto>();
		String sql = "Select a.centro_costo_id as centro_costo_id, a.descripcion as descripcion FROM CentroCosto as a";
		List<Object[]> data = centroDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listCentroCosto.add(new CentroCosto(Integer.parseInt(d[0].toString()), d[1]
						.toString()));
			}
		}
		return listCentroCosto;
	}

}
