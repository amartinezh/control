package com.ventura.control.web.adm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ventura.control.domain.login.User;
import com.ventura.control.domain.session.session;
import com.ventura.control.service.login.UserManager;
import com.ventura.control.domain.adm.TypeUser;

@Controller
@RequestMapping("/tipotransaccion")
@SessionAttributes({ "user_inicio" })
public class TipoTransaccionController {

	@Autowired
	private UserManager userManager;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("user", new User());
		return "admin/tipotransaccion";
	}
}
