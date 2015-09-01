package com.ventura.control.service.control.impl;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Permiso;
import com.ventura.control.domain.nomina.TipoPermiso;
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
			obj.setTipo_permiso_id(permiso.getTipo_permiso_id());
			obj.setFecha(permiso.getFecha());
			obj.setCodigo_trabajador(permiso.getCodigo_trabajador());
			obj.setHora_entrada(permiso.getHora_entrada());
			obj.setHora_salida(permiso.getHora_salida());
			obj.setRecibido_por(permiso.getRecibido_por());
			obj.setNovedad(permiso.getNovedad());
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
		String sql = "Select a.permiso_id as permiso_id, a.tipo_permiso_id as tipo_permiso_id, a.fecha as fecha, a.codigo_trabajador as codigo_trabajador, a.hora_entrada as hora_entrada, a.hora_salida as hora_salida, a.recibido_por as recibido_por, a.novedad as novedad, a.estado as estado FROM Permiso as a";
		List<Object[]> data = permisoDao.listar(sql);
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		if (data != null) {
			for (Object[] d : data) {
					try {
						//System.out.println("............."+(TipoPermiso)d[1]);
						listPermiso.add(new Permiso(Integer.parseInt(d[0].toString()), (TipoPermiso)d[1], formatter.parse(d[2].toString()), d[3].toString(), d[4].toString(), d[5].toString(), d[6].toString(), d[7].toString(), d[8].toString()));
					} catch (NumberFormatException e) {
						e.printStackTrace();
					} catch (ParseException e) {
						e.printStackTrace();
					}
			}
		}
		return listPermiso;
	}

}
