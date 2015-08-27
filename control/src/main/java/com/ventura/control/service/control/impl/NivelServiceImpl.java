package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Nivel;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.NivelService;

@Service
public class NivelServiceImpl implements NivelService {
 
	@Autowired
	private RepositorioDao nivelDao;

	@Transactional
	public void agregarNivel(Nivel nivel) {
		if (nivel.getNivel_id() == 0)
			nivelDao.agregar(nivel);
		else {
			Nivel obj = (Nivel) nivelDao.getElemento(nivel, nivel.getNivel_id());
			obj.setDescripcion(nivel.getDescripcion());
			nivelDao.actualizar(nivel);
		}
	}

	@Transactional
	public void borrarNivel(Nivel nivel) {
		Nivel obj = (Nivel) nivelDao.getElemento(nivel, nivel.getNivel_id());
		nivelDao.borrar(obj);
	}

	@Transactional
	public List<Nivel> listarNivel() {
		List<Nivel> listNivel = new LinkedList<Nivel>();
		String sql = "Select a.nivel_id as nivel_id, a.descripcion as descripcion FROM Nivel as a";
		List<Object[]> data = nivelDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listNivel.add(new Nivel(Integer.parseInt(d[0].toString()), d[1]
						.toString()));
			}
		}
		return listNivel;
	}

}
