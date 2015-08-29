package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.control.Dependencia;

public interface DependeciaService {
	
	public void agregarDependencia(Dependencia dependencia);
	public void borrarDependencia(Dependencia dependencia);
	public List<Dependencia> listarDependencias();
	public Map<Integer, String> cmbDependencias();
}
