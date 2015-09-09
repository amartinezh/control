package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.login.User;

@Controller
@RequestMapping("/transporte_agregar_bus")
@SessionAttributes({ "user_inicio" })
public class ControlBusController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String transporte_bus_add(Map<String, Object> model) {
		model.put("user", new User());
		return "transporte/transporte_bus_add";
	}

}
