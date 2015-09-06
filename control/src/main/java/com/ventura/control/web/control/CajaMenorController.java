package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.login.User;

@Controller
@RequestMapping("/cajamenor_registrar")
@SessionAttributes({ "user_inicio" })
public class CajaMenorController {

	@RequestMapping(method = RequestMethod.GET)
	public String cajamenor_add(Map<String, Object> model) {
		model.put("user", new User());
		return "cajamenor/cajamenor_add";
	}
	
}
