package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

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
		dependenciaDao.agregar(dependencia);
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

}
