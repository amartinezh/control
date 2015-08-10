package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Area;

public interface AreaService {
	
	public void agregarSitio(Area area);
	public void borrarSitio(Area area);
	public List<Area> listarAreas();

}
