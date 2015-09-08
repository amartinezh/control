package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Conductor;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.ConductorService;

@Service
public class ConductorServiceImpl implements ConductorService {

	@Autowired
	private RepositorioDao conductorDao;

	@Transactional	
	public void agregarConductor(boolean existe, Conductor conductor) {
		if (existe == true){
			conductorDao.actualizar(conductor);
		}
		else {
			conductorDao.agregar(conductor);
		}
	}

	@Transactional
	public void borrarConductor(Conductor conductor) {
		Conductor cont = (Conductor) conductorDao.getElemento(conductor, conductor.getDocumento());
		conductorDao.borrar(cont);
	}
	
	@Transactional
	public boolean validarConductor(Conductor conductor) {
		Conductor cont = (Conductor) conductorDao.getElemento(conductor, conductor.getDocumento());
		if (cont == null)
			return false;
		return true;
	}

	@Transactional
	public List<Conductor> listarConductor() {
		List<Conductor> listConductor = new LinkedList<Conductor>();
		String sql = "Select a.documento as documento, a.nombre_completo as nombre_completo, a.apellido as apellido, a.tipo_persona_id as tipo_persona_id, a.dependencia_id as dependencia_id, a.coreo_e as coreo_e, a.telefono as telefono, a.scan_foto as scan_foto, a.scan_cedula as scan_cedula, a.scan_huella as scan_huella, a.observaciones as observaciones, a.estado as estado FROM Conductor as a";
		List<Object[]> data = conductorDao.listar(sql);
		//java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		if (data != null) {
			for (Object[] d : data) {
					try {
						// codigo_trabajador d[13].toString()
						listConductor.add(new Conductor(d[0].toString(), d[1].toString(), d[2].toString(), (TipoPersona) d[3], (Dependencia) d[4], d[5].toString(), d[6].toString(), d[7].toString(), d[8].toString(), d[9].toString(), d[10].toString(),"1"));
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
			}
		}
		return listConductor;
	}
}