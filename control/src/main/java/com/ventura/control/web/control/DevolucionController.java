package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/llave_devolucion")
@SessionAttributes({ "user_inicio" })
public class DevolucionController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String devolucion_add(Map<String, Object> model) {
		return "devolucion/devolucion_add";
	}

}
