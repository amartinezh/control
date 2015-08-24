package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Sitio;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.SitioService;

@Service
public class SitioServiceImpl implements SitioService {

	@Autowired
	private RepositorioDao sitioDao;

	@Transactional
	public void agregarSitio(Sitio sitio) {
		if (sitio.getSitio_id() == 0)
			sitioDao.agregar(sitio);
		else {
			Sitio obj = (Sitio) sitioDao.getElemento(sitio, sitio.getSitio_id());
			obj.setDescripcion(sitio.getDescripcion());
			sitioDao.actualizar(sitio);
		}
	}

	@Transactional
	public void borrarSitio(Sitio sitio) {
		Sitio sit = (Sitio) sitioDao.getElemento(sitio, sitio.getSitio_id());
		sitioDao.borrar(sit);
	}

	@Transactional
	public List<Sitio> listarSitios() {
		List<Sitio> listSitio = new LinkedList<Sitio>();
		String sql = "Select s.sitio_id as sitio_id, s.descripcion as descripcion FROM Sitio as s";
		List<Object[]> data = sitioDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listSitio.add(new Sitio(Integer.parseInt(d[0].toString()), d[1]
						.toString()));
			}
		}
		return listSitio;
	}

}
