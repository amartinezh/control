package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.Sitio;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.SitioService;

@Service
public class SitioServiceImpl implements SitioService {
	
	@Autowired
	private RepositorioDao sitioDao;

	public void agregarSitio(Sitio sitio) {
		sitioDao.agregar(sitio);
	}

	public void borrarSitio(Sitio sitio) {
		Sitio sit = (Sitio) sitioDao.getElemento(sitio, sitio.getSitio_id());
		sitioDao.borrar(sit);
	}

	public List<Sitio> listarSitios() {
		List<Sitio> listSitio = new LinkedList<Sitio>();
		return listSitio;
	}

}
