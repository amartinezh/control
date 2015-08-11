package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Sitio;
import com.ventura.control.service.login.UserManager;

@Controller
@RequestMapping("/sitio")
@SessionAttributes({ "user_inicio" })
public class SitioController {

	@Autowired
	private UserManager userManager;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("sitio", new Sitio());
		return "admin/sitio";
	}
}
