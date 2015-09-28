package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.PrestaLlave;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.PrestaLlaveService;

@Service
public class PrestaLlaveServiceImpl implements PrestaLlaveService {

	@Autowired
	private RepositorioDao prestaLlaveDao;
	
	@Transactional	
	public void agregarPrestaLlave(PrestaLlave presta) {
		if(presta.getId() == 0) {
			prestaLlaveDao.agregar(presta);
		} else {
			PrestaLlave prest = (PrestaLlave) prestaLlaveDao.getElemento(presta, presta.getId());
			
			prestaLlaveDao.actualizar(prest);
		}
	}
	
	@Transactional
	public void borrarPrestaLlave(PrestaLlave presta) {
		PrestaLlave prest = (PrestaLlave) prestaLlaveDao.getElemento(presta, presta.getId());
		prestaLlaveDao.borrar(prest);
	}
	
	public List<PrestaLlave> listarPrestaLlave(String valor) {
		String sql = "Select p FROM PrestaLlave as p";
		@SuppressWarnings("unchecked")
		List<PrestaLlave> data = prestaLlaveDao.listarObjeto(sql).getResultList();
		if (data != null) {
			return data;
		} else {
			return new LinkedList<PrestaLlave>();
		}
	}
}