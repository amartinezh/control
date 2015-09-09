package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Minuta;

public interface MinutaService {

	public void agregarMinuta(boolean existe, Minuta minuta);
	public void borrarMinuta(Minuta minuta);
	public boolean validarMinuta(Minuta minuta);
	public List<Minuta> listarMinuta();
	
}
