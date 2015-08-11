package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Area;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private RepositorioDao areaDao;

	@Transactional
	public void agregarSitio(Area area) {
		areaDao.agregar(area);
	}

	@Transactional
	public void borrarSitio(Area area) {
		Area are = (Area) areaDao.getElemento(area, area.getArea_id());
		areaDao.borrar(are);
	}

	@Transactional
	public List<Area> listarAreas() {
		List<Area> listArea = new LinkedList<Area>();
		String sql = "Select a.area_id as area_id, a.descripcion as descripcion FROM Area as a";
		List<Object[]> data = areaDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listArea.add(new Area(Integer.parseInt(d[0].toString()), d[1]
						.toString()));
			}
		}
		return listArea;
	}

}
