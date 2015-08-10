package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Sitio;

public interface SitioService {
	
	public void agregarSitio(Sitio sitio);
	public void borrarSitio(Sitio sitio);
	public List<Sitio> listarSitios();

}
