package com.ventura.control.service.control;

import com.ventura.control.domain.control.Contratista;

public interface ContratistaService {

	public void agregarContratista(boolean existe, Contratista contratista);
	public void borrarContratista(Contratista contratista);
}
