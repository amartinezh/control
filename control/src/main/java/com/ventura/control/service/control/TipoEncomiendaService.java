package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.TipoEncomienda;

public interface TipoEncomiendaService {

	public void agregarTipoEncomienda(TipoEncomienda tipoEncomienda);
	public void borrarTipoEncomienda(TipoEncomienda tipoEncomienda);
	public List<TipoEncomienda> listarTipoEncomiendaes();	

}
