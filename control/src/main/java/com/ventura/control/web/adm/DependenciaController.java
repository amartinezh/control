package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.service.control.DependeciaService;

@Controller
@RequestMapping("/dependencia")
@SessionAttributes({ "user_inicio" })
public class DependenciaController {

	@Autowired
	private DependeciaService dependencia;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("dependencia", new Dependencia());
		model.put("listDependencia", dependencia.listarDependencias());
		return "admin/dependencia";
	}
	
	
}
