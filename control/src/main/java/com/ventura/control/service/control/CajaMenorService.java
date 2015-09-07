package com.ventura.control.service.control;

import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.CajaMenor;

public interface CajaMenorService {

	@Transactional
	public void agregarCajaMenor(CajaMenor cajaMenor);
}
