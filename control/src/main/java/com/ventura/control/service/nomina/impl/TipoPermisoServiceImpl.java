package com.ventura.control.service.nomina.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.nomina.TipoPermiso;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.nomina.TipoPermisoService;

@Service
public class TipoPermisoServiceImpl implements TipoPermisoService {

	@Autowired
	private RepositorioDao tipoPermisoDao;

	@Transactional
	public void agregarTipoPermiso(TipoPermiso tipoPermiso) {
		if (tipoPermiso.getTipo_permiso_id() == 0)
			tipoPermisoDao.agregar(tipoPermiso);
		else {
			TipoPermiso obj = (TipoPermiso) tipoPermisoDao.getElemento(tipoPermiso, tipoPermiso.getTipo_permiso_id());
			obj.setDescripcion(tipoPermiso.getDescripcion());
			tipoPermisoDao.actualizar(tipoPermiso);
		}
	}

	@Transactional
	public void borrarTipoPermiso(TipoPermiso tipoPermiso) {
		TipoPermiso are = (TipoPermiso) tipoPermisoDao.getElemento(tipoPermiso, tipoPermiso.getTipo_permiso_id());
		tipoPermisoDao.borrar(are);
	}

	@Transactional
	public List<TipoPermiso> listarTipoPermisos() {
		List<TipoPermiso> listTipoPermiso = new LinkedList<TipoPermiso>();
		String sql = "Select a.tipo_permiso_id as tipo_permiso_id, a.descripcion as descripcion FROM TipoPermiso as a";
		List<Object[]> data = tipoPermisoDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listTipoPermiso.add(new TipoPermiso(Integer.parseInt(d[0].toString()), d[1].toString()));
			}
		}
		return listTipoPermiso;
	}
	
	@Transactional
	public Map<Integer, String> cmbTipoPermisos() {
		Map<Integer, String> obj = new HashMap<Integer, String>();
		String sql = "Select a.tipo_permiso_id as tipo_permiso_id, a.descripcion as descripcion FROM TipoPermiso as a";
		List<Object[]> data = tipoPermisoDao.listar(sql);
		obj.put(0, "Seleccione");
		if (data != null) {
			for (Object[] d : data) {
				obj.put(Integer.parseInt(d[0].toString()), d[1].toString());
			}
		}
		return obj;
	}
}
