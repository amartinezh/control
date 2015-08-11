package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.MotivoDevolucion;

public interface MotivoDevolucionService {

	public void agregarMotivoDevolucion(MotivoDevolucion motivoDevolucion);
	public void borrarMotivoDevolucion(MotivoDevolucion motivoDevolucion);
	public List<MotivoDevolucion> listarMotivoDevoluciones();	

}
