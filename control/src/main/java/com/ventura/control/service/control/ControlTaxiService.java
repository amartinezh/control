package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.ControlBus;
import com.ventura.control.domain.control.ControlTaxi;

public interface ControlTaxiService {
	
	public void agregarControlTaxi(ControlTaxi controlTaxi);
	public void borrarControlTaxi(ControlTaxi controlTaxi);
	public List<ControlTaxi> listarControlTaxi();

}
