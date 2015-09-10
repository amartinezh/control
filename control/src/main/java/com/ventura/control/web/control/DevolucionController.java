package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Devolucion;
import com.ventura.control.domain.control.MotivoDevolucion;
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

}
