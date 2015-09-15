package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.ControlTaxi;

public interface ControlTaxiService {
	
	public void agregarControlTaxi(ControlTaxi controlTaxi);
	public List<ControlTaxi> listarControlTaxi();

}
