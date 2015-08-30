package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Permiso;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.PermisoService;

@Service
public class PermisoServiceImpl implements PermisoService {

	@Autowired
	private RepositorioDao permisoDao;

	@Transactional
	public void agregarPermiso(Permiso permiso) {
		if (permiso.getPermiso_id() == 0)
			permisoDao.agregar(permiso);
		else {
			Permiso obj = (Permiso) permisoDao.getElemento(permiso, permiso.getPermiso_id());
			obj.setCodigo_trabajador(permiso.getCodigo_trabajador());
			obj.setNovedad(permiso.getNovedad());
			obj.setHora_entrada(permiso.getHora_entrada());
			obj.setHora_salida(permiso.getHora_salida());
			obj.setRecibido_por(permiso.getRecibido_por());
			obj.setObservaciones(permiso.getObservaciones());
			obj.setEstado(permiso.getEstado());
			permisoDao.actualizar(permiso);
		}
	}

	@Transactional
	public void borrarPermiso(Permiso permiso) {
		Permiso obj = (Permiso) permisoDao.getElemento(permiso, permiso.getPermiso_id());
		permisoDao.borrar(obj);
	}

	@Transactional
	public List<Permiso> listarPermisos() {
		List<Permiso> listPermiso = new LinkedList<Permiso>();
		String sql = "Select a.permiso_id as permiso_id, a.codigo_trabajador as codigo_trabajador FROM Permiso as a";
		List<Object[]> data = permisoDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listPermiso.add(new Permiso(Integer.parseInt(d[0].toString()), d[1].toString(), d[2].toString(), d[3].toString(), d[4].toString(), d[5].toString(), d[6].toString(), d[7].toString()));
			}
		}
		return listPermiso;
	}

}
