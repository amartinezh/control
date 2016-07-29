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
import com.ventura.control.domain.control.ControlTaxi;
import com.ventura.control.domain.control.Origen;
import com.ventura.control.domain.control.Permiso;
import com.ventura.control.domain.control.Turno;
import com.ventura.control.domain.login.User;
import com.ventura.control.service.control.ControlBusService;
import com.ventura.control.service.control.OrigenService;
import com.ventura.control.service.control.TurnoService;

@Controller
@RequestMapping("/transporte_agregar_bus")
@SessionAttributes({ "user_inicio" })
public class ControlBusController {

	@Autowired
	private ControlBusService controlBusService;

	@Autowired
	private TurnoService turnoService;

	@Autowired
	private OrigenService origenService;

	@RequestMapping(method = RequestMethod.GET)
	public String transporte_bus_add(Map<String, Object> model) {
		model.put("controlBus", new ControlBus());
		model.put("listControlBus", controlBusService.listarControlBus());
		model.put("listTurnos", turnoService.cmbTurnos());
		model.put("listOrigenes", origenService.cmbOrigenes());
		return "transporte/transporte_bus_add";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int control_bus_id,
			@RequestParam String hora, @RequestParam int nroPasajeros,
			@RequestParam String observaciones, @RequestParam int turnoId,
			@RequestParam int origenId, Map<String, Object> model) {
		controlBusService.agregarControlBus(new ControlBus(control_bus_id, hora, 
				nroPasajeros, observaciones, new Turno(turnoId), new Origen(origenId)));
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ control_bus_id + "', '" + turnoId  + "', '" + origenId + "', '" 
				+ nroPasajeros  + "', '" + hora  + "', '" + 	observaciones  
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ control_bus_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ turnoId +":::"+ origenId +":::"+ hora +":::"+nroPasajeros+":::"+observaciones;
	}
	
	@RequestMapping(value = "borrar", method = RequestMethod.POST)
	public @ResponseBody String borrar(@RequestParam int control_bus_id,
			Map<String, Object> model) {
		controlBusService.borrarControlBus(new ControlBus(control_bus_id));
		return "";
	}

}
