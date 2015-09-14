package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.CajaMenor;
import com.ventura.control.domain.control.Nivel;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.CajaMenorService;

@Service
public class CajaMenorServiceImpl implements CajaMenorService {

	@Autowired
	private RepositorioDao cajaMenorDao;

	public void agregarCajaMenor(CajaMenor cajaMenor) {
		if (cajaMenor.getId() == 0) {
			cajaMenorDao.agregar(cajaMenor);
		}
	}

	public List<CajaMenor> listarCajaMenor() {
		List<CajaMenor> listCajaMenor = new LinkedList<CajaMenor>();
		String sql = "Select c FROM CajaMenor as c";
		@SuppressWarnings("unchecked")
		List<CajaMenor> data = cajaMenorDao.listarObjeto(sql).getResultList();
		if (data != null) {
			return data;
		} else {
			return listCajaMenor;
		}
	}

}
