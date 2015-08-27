package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Moneda;

public interface MonedaService {
	
	public void agregarMoneda(Moneda moneda);
	public void borrarMoneda(Moneda moneda);
	public List<Moneda> listarMoneda();
  
}
