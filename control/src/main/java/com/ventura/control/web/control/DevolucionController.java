package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.ControlBus;
import com.ventura.control.domain.control.Devolucion;
import com.ventura.control.domain.control.MotivoDevolucion;
import com.ventura.control.domain.control.Origen;
import com.ventura.control.domain.control.Turno;
import com.ventura.control.service.control.DevolucionService;
import com.ventura.control.service.control.MotivoDevolucionService;

@Controller
@RequestMapping("/llave_devolucion")
@SessionAttributes({ "user_inicio" })
public class DevolucionController {

	@Autowired
	private DevolucionService devolucionService;

	@Autowired
	private MotivoDevolucionService motivoDevolucionService;

	@RequestMapping(method = RequestMethod.GET)
	public String devolucion_add(Map<String, Object> model) {
		model.put("listMotivos", motivoDevolucionService.cmbMotivoDevolucion());
		model.put("devolucion", new Devolucion());
		return "devolucion/devolucion_add";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int devolucion_id,
			@RequestParam String fecha, @RequestParam String placa,
			@RequestParam String conductor, @RequestParam int motivo_id,
			@RequestParam String empresaTransporte,
			@RequestParam String ciudad, @RequestParam String cajas,
			@RequestParam String unidad, @RequestParam String pacas,
			@RequestParam String elemento, @RequestParam String observaciones,
			Map<String, Object> model) {
		devolucionService.agregarDevolucion(new Devolucion(devolucion_id, fecha, placa, conductor, new MotivoDevolucion(motivo_id), empresaTransporte, ciudad, cajas, unidad, pacas, elemento, observaciones));
		/*
		 * controlBusService.agregarControlBus(new ControlBus(control_bus_id,
		 * hora, nroPasajeros, observaciones, new Turno(turnoId), new
		 * Origen(origenId)));
		 */
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ devolucion_id
				+ "', '"
				+ devolucion_id
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ devolucion_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ devolucion_id;
	}

}
