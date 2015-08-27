package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.CentroCosto;

public interface CentroCostoService {
	
	public void agregarCentro(CentroCosto centro_costo);
	public void borrarCentro(CentroCosto centro_costo);
	public List<CentroCosto> listarCentroCosto();

}
