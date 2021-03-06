package com.ventura.control.service.control;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.PrestaLlave;

public interface PrestaLlaveService {
	
	@Transactional	
	public void agregarPrestaLlave(PrestaLlave presta);
	@Transactional
	public void borrarPrestaLlave(PrestaLlave presta);
	public List<PrestaLlave> listarPrestaLlave(String valor);

}