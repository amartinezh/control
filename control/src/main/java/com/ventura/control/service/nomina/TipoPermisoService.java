package com.ventura.control.service.nomina;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.nomina.TipoPermiso;

public interface TipoPermisoService {
	public void agregarTipoPermiso(TipoPermiso TipoPermiso);
	public void borrarTipoPermiso(TipoPermiso TipoPermiso);
	public List<TipoPermiso> listarTipoPermisos();
	public Map<Integer, String> cmbTipoPermisos();
}
