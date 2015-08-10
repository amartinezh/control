package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.Area;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private RepositorioDao areaDao;

	public void agregarSitio(Area area) {
		areaDao.agregar(area);
	}

	public void borrarSitio(Area area) {
		Area are = (Area) areaDao.getElemento(area, area.getArea_id());
		areaDao.borrar(are);
	}

	public List<Area> listarAreas() {
		List<Area> listArea = new LinkedList<Area>();
		return listArea;
	}

}
