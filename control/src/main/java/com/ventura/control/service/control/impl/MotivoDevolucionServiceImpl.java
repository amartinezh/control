package com.ventura.control.service.control.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ventura.control.domain.control.MotivoDevolucion;
import com.ventura.control.repository.control.RepositorioDao;
import com.ventura.control.service.control.MotivoDevolucionService;

@Service
public class MotivoDevolucionServiceImpl implements MotivoDevolucionService {

	@Autowired
	private RepositorioDao motivoDevolucionDao;

	@Transactional
	public void agregarMotivoDevolucion(MotivoDevolucion motivoDevolucion) {
		if (motivoDevolucion.getMotivo_devolucion_id() == 0)
			motivoDevolucionDao.agregar(motivoDevolucion);
		else {
			MotivoDevolucion obj = (MotivoDevolucion) motivoDevolucionDao.getElemento(motivoDevolucion, motivoDevolucion.getMotivo_devolucion_id());
			obj.setDescripcion(motivoDevolucion.getDescripcion());
			motivoDevolucionDao.actualizar(motivoDevolucion);
		}
	}

	@Transactional
	public void borrarMotivoDevolucion(MotivoDevolucion motivoDevolucion) {
		MotivoDevolucion mDev = (MotivoDevolucion) motivoDevolucionDao
				.getElemento(motivoDevolucion,
						motivoDevolucion.getMotivo_devolucion_id());
		motivoDevolucionDao.borrar(mDev);
	}

	@Transactional
	public List<MotivoDevolucion> listarMotivoDevoluciones() {
		List<MotivoDevolucion> listMotDev = new LinkedList<MotivoDevolucion>();
		String sql = "Select m.motivo_devolucion_id as motivo_devolucion_id, m.descripcion as descripcion FROM MotivoDevolucion as m";
		List<Object[]> data = motivoDevolucionDao.listar(sql);
		if (data != null) {
			for (Object[] d : data) {
				listMotDev.add(new MotivoDevolucion(Integer.parseInt(d[0]
						.toString()), d[1].toString()));
			}
		}
		return listMotDev;
	}

}
