package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Compania;

public interface CompaniaService {

	public void agregarCompania(Compania compania);
	public void borrarCompania(Compania compania);
	public List<Compania> listarCompanias();	

}
