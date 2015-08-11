package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.TipoPersona;

public interface TipoPersonaService {

	public void agregarTipoPersona(TipoPersona tipoPersona);
	public void borrarTipoPersona(TipoPersona tipoPersona);
	public List<TipoPersona> listarTipoPersonas();	

}
