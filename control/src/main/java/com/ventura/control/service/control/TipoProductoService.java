package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.control.TipoProducto;

public interface TipoProductoService {

	public void agregarTipoProducto(TipoProducto tipoProducto);
	public void borrarTipoProducto(TipoProducto tipoProducto);
	public List<TipoProducto> listarTipoProductos();	
	public Map<Integer, String> cmbTipoProducto();
}
