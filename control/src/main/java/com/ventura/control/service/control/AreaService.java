package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.control.Area;

public interface AreaService {
	
	public void agregarArea(Area area);
	public void borrarArea(Area area);
	public List<Area> listarAreas();
	public Map<Integer, String> cmbAreas();
}
