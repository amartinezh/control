package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.control.TipoTransaccion;

public interface TipoTransaccionService {

	public void agregarTipoTransaccion(TipoTransaccion tipoTransaccion);
	public void borrarTipoTransaccion(TipoTransaccion tipoTransaccion);
	public List<TipoTransaccion> listarTipoTransacciones();	
	public Map<Integer, String> cmbTipoTransaccionales();

}
