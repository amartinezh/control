package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Origen;

public interface OrigenService {
	
	public void agregarOrigen(Origen origen);
	public void borrarOrigen(Origen origen);
	public List<Origen> listarOrigenes();

}
