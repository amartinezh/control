package com.ventura.control.service.control;

import java.util.List;
import java.util.Map;

import com.ventura.control.domain.control.Antecedente;

public interface AntecedenteService {
	
	public void agregarAntecedente(boolean existe, Antecedente antecedente);
	public void borrarAntecedente(Antecedente antecedente);
	public boolean validarAntecedente(Antecedente antecedente);
	public List<Antecedente> listarAntecedentes();
	//public Map<Integer, String> cmbAntecedentes();
}
