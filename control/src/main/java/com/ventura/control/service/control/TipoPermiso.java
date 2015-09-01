package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Area;

public interface TipoPermiso {
	
	public void agregarArea(Area area);
	public void borrarArea(Area area);
	public List<Area> listarAreas();

}
