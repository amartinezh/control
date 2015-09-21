package com.ventura.control.service.control.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.TipoProducto;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.TipoProductoService;

@Service
public class TipoProductoServiceImpl implements TipoProductoService {

	@Autowired
	private RepositorioDao tipoProductoDao;

	@Transactional
	public void agregarTipoProducto(TipoProducto tipoProducto) {
		if (tipoProducto.getTipo_producto_id() == 0)
			tipoProducto=(TipoProducto) tipoProductoDao.agregar_get(tipoProducto);
		else {
			TipoProducto obj = (TipoProducto) tipoProductoDao.getElemento(tipoProducto, tipoProducto.getTipo_producto_id());
			obj.setDescripcion(tipoProducto.getDescripcion());
			tipoProductoDao.actualizar(tipoProducto);
		}
	}

	@Transactional
	public void borrarTipoProducto(TipoProducto tipoProducto) {
		TipoProducto tipProd = (TipoProducto) tipoProductoDao.getElemento(
				tipoProducto, tipoProducto.getTipo_producto_id());
		tipoProductoDao.borrar(tipProd);
	}

	@Transactional
	public List<TipoProducto> listarTipoProductos() {
		List<TipoProducto> listTipProd = new LinkedList<TipoProducto>();
		String sql = "Select t.tipo_producto_id as tipo_producto_id, t.descripcion as descripcion FROM TipoProducto as t";
		List<Object[]> data = tipoProductoDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listTipProd.add(new TipoProducto(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listTipProd;
	}
	
	@Transactional
	public Map<Integer, String> cmbTipoProducto() {
		Map<Integer, String> listTipProd = new HashMap<Integer, String>();
		String sql = "Select t.tipo_producto_id as tipo_producto_id, t.descripcion as descripcion FROM TipoProducto as t";
		List<Object[]> data = tipoProductoDao.listar(sql);
		listTipProd.put(0, "Seleccione");
		if (data != null) {
			for (Object[] d : data) {
				listTipProd.put(Integer.parseInt(d[0].toString()), d[1].toString());
			}
		}
		return listTipProd;
	}
}
