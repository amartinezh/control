package com.ventura.control.service.control.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.DependeciaService;

@Service
public class DependenciaServiceImpl implements DependeciaService {

	@Autowired
	private RepositorioDao dependenciaDao;

	@Transactional
	public void agregarDependencia(Dependencia dependencia) {
		if (dependencia.getDependencia_id() == 0)
			dependencia=(Dependencia) dependenciaDao.agregar_get(dependencia);
		else {
			Dependencia dep = (Dependencia) dependenciaDao.getElemento(dependencia, dependencia.getDependencia_id());
			dep.setDescripcion(dependencia.getDescripcion());
			dependenciaDao.actualizar(dependencia);
		}
	}
	
	@Transactional
	public void borrarDependencia(Dependencia dependencia) {
		Dependencia dep = (Dependencia)(dependenciaDao.getElemento(dependencia, dependencia.getDependencia_id()));
		dependenciaDao.borrar(dep);
	}

	@Transactional
	public List<Dependencia> listarDependencias() {
		List<Dependencia> listDependencia = new LinkedList<Dependencia>();
		String sql = "Select d.dependencia_id as dependencia, d.descripcion as descripcion FROM Dependencia as d";
		List<Object[]> data = dependenciaDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listDependencia.add(new Dependencia(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listDependencia;
	}
	
	@Transactional
	public Map<Integer, String> cmbDependencias() {
		Map<Integer, String> dependencias = new HashMap<Integer, String>();
		String sql = "Select d.dependencia_id as dependencia, d.descripcion as descripcion FROM Dependencia as d";
		List<Object[]> data = dependenciaDao.listar(sql);
		dependencias.put(0, "Seleccione");
		if (data != null) {
			for (Object[] d : data) {
				dependencias.put(Integer.parseInt(d[0].toString()), d[1].toString());
			}
		}
		return dependencias;
	}
	
	@Transactional(readOnly = true)
	public Dependencia getDependencia(Dependencia dependencia) {
		// TODO Auto-generated method stub
		return null;
	}

}
