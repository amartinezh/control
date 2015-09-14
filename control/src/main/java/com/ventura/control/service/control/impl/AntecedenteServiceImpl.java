package com.ventura.control.service.control.impl;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.Antecedente;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.AntecedenteService;

@Service
public class AntecedenteServiceImpl implements AntecedenteService {

	@Autowired
	private RepositorioDao antecedenteDao;

	@Transactional	
	public void agregarAntecedente(boolean existe, Antecedente antecedente) {
		if (existe == true){
			antecedenteDao.actualizar(antecedente);
		}
		else {
			antecedenteDao.agregar(antecedente);
		}
	}

	@Transactional
	public void borrarAntecedente(Antecedente antecedente) {
		Antecedente cont = (Antecedente) antecedenteDao.getElemento(antecedente, antecedente.getAntecedente_id());
		antecedenteDao.borrar(cont);
	}
	
	@Transactional
	public boolean validarAntecedente(Antecedente antecedente) {
		Antecedente cont = (Antecedente) antecedenteDao.getElemento(antecedente, antecedente.getAntecedente_id());
		if (cont == null)
			return false;
		return true;
	}

	@Transactional
	public List<Antecedente> listarAntecedentes() {
		List<Antecedente> listAntecedente = new LinkedList<Antecedente>();
		String sql = "Select a.antecedente_id as antecedente_id, a.contratista_documento as contratista_documento, a.fecha as fecha, a.scan_responsabilidad as scan_responsabilidad, a.scan_produraduria as scan_produraduria, a.scan_policia as scan_policia, a.scan_fiscalia as scan_fiscalia, a.observaciones as observaciones, a.estado as estado FROM Antecedente as a";
		List<Object[]> data = antecedenteDao.listar(sql);
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		if (data != null) {
			for (Object[] d : data) {
					try {
						// codigo_trabajador d[13].toString()
						try {
							listAntecedente.add(new Antecedente(Integer.parseInt(d[0].toString()), d[1].toString(), formatter.parse(d[2].toString()), (byte[]) d[3], (byte[]) d[4], (byte[]) d[5], (byte[]) d[6], d[7].toString(), d[8].toString()));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
			}
		}
		return listAntecedente;
	}

	public void agregarAntecedente(Antecedente antecedente) {
		// TODO Auto-generated method stub
		
	}
}