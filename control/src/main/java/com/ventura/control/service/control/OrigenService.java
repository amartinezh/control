package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Origen;

public interface OrigenService {
	
	public void agregarOrigen(Origen origen);
	public void borrarOrigen(Origen origen);
	public List<Origen> listarOrigenes();
	public Map<Integer, String> cmbOrigenes();

}
