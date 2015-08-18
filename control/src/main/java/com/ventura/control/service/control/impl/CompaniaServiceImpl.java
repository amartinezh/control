package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Area;
import com.ventura.control.domain.control.Compania;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.CompaniaService;

@Service
public class CompaniaServiceImpl implements CompaniaService {

	@Autowired
	private RepositorioDao companiaDao;

	@Transactional
	public void agregarCompania(Compania compania) {
		if (compania.getCompania_id() == 0)
			companiaDao.agregar(compania);
		else {
			Compania obj = (Compania) companiaDao.getElemento(compania, compania.getCompania_id());
			obj.setDescripcion(compania.getDescripcion());
			companiaDao.actualizar(compania);
		}
	}

	@Transactional
	public void borrarCompania(Compania compania) {
		Compania comp = (Compania) companiaDao.getElemento(compania,
				compania.getCompania_id());
		companiaDao.borrar(comp);
	}

	@Transactional
	public List<Compania> listarCompanias() {
		List<Compania> listCompania = new LinkedList<Compania>();
		String sql = "Select c.compania_id as compania_id, c.descripcion as descripcion FROM Compania as c";
		List<Object[]> data = companiaDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listCompania.add(new Compania(
						Integer.parseInt(d[0].toString()), d[1].toString()));
			}
		}
		return listCompania;
	}

}
