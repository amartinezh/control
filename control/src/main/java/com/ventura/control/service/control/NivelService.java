package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Nivel;

public interface NivelService {
	
	public void agregarNivel(Nivel nivel);
	public void borrarNivel(Nivel nivel);
	public List<Nivel> listarNivel();
  
}
