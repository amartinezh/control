package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Permiso;

public interface PermisoService {
	
	public void agregarPermiso(Permiso area);
	public void borrarPermiso(Permiso area);
	public List<Permiso> listarPermisos();

}
