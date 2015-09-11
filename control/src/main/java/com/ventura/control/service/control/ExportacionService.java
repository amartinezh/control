package com.ventura.control.service.control;

import java.util.List;

import com.ventura.control.domain.control.Exportacion;

public interface ExportacionService {

	public void agregarExportacion(boolean existe, Exportacion exportacion);
	public void borrarExportacion(Exportacion exportacion);
	public boolean validarExportacion(Exportacion exportacion);
	public List<Exportacion> listarExportacion();
}
