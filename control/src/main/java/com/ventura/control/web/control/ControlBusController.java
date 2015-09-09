package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.ControlBus;
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
		model.put("listTurnos", turnoService.cmbTurnos());
		model.put("listOrigenes", origenService.cmbOrigenes());
		return "transporte/transporte_bus_add";
	}

}
