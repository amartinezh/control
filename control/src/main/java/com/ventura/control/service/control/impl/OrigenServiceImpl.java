package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura.control.domain.control.Origen;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.OrigenService;

@Service
public class OrigenServiceImpl implements OrigenService {
	
	@Autowired
	private RepositorioDao origenDao;

	public void agregarOrigen(Origen origen) {
		origenDao.agregar(origen);		
	}

	public void borrarOrigen(Origen origen) {
		Origen ori = (Origen) origenDao.getElemento(origen, origen.getOrigen_id()); 
		origenDao.borrar(ori);
	}

	public List<Origen> listarOrigenes() {
		List<Origen> listOrigen = new LinkedList<Origen>();
		return listOrigen;
	}

}
