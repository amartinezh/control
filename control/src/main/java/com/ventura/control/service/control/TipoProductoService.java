package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.TipoProducto;

public interface TipoProductoService {

	public void agregarTipoProducto(TipoProducto tipoProducto);
	public void borrarTipoProducto(TipoProducto tipoProducto);
	public List<TipoProducto> listarTipoProductos();	

}
