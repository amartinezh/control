package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.ControlTaxi;
import com.ventura.control.service.control.ControlTaxiService;

@Controller
@RequestMapping("/transporte_agregar_taxi")
@SessionAttributes({ "user_inicio" })
public class ControlTaxiController {
	
	@Autowired
	private ControlTaxiService controlTaxiService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String transporte_taxi_add(Map<String, Object> model) {
		model.put("controlTaxi", new ControlTaxi());
		return "transporte/transporte_taxi_add";
	}

}
