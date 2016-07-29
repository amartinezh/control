package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.ControlBus;

public interface ControlBusService {
	
	public void agregarControlBus(ControlBus controlBus);
	public void borrarControlBus(ControlBus controlBus);
	public List<ControlBus> listarControlBus();

}
