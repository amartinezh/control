package com.ventura.control.web.login;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.login.User;
import com.ventura.control.domain.session.session;
import com.ventura.control.service.adm.CenterService;
import com.ventura.control.service.adm.CompanyService;
import com.ventura.control.service.adm.TypeUserService;
import com.ventura.control.service.login.UserManager;

@Controller
@RequestMapping(value = "/index")
@SessionAttributes({ "user_inicio" })
public class IndexController {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private UserManager userManager;

	@Autowired
	private TypeUserService typeUserService;

	@Autowired
	private CompanyService companyService;

	@Autowired
	private CenterService centerService;

	/*
	 * @Autowired private PermisoManager permisoManager;
	 */
	@RequestMapping(value = "/ingreso", method = RequestMethod.GET)
	public String employee(Map<String, Object> model) {
		model.put("user", new User());
		return "key/index";
	}

	@RequestMapping(value = "/validar", method = RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("user") User user,
			BindingResult result, Model model) { System.out.print("Co---------------------------9''¿!!!");
		if (result.hasErrors()) {
			model.addAttribute("user", new User());
			return "key/index";
		} else {
			User uss = userManager.val(user.getId(), user.getPass());
			if (uss != null) {
				if (uss.getType() != null) {
					session ses = new session(uss.getId(), uss.getType().getId());
					String ret = null;
					List<Object> info = null;


					System.out.print("Conectaras con ello"+uss.getType().getDescripcion());
					
					if (uss.getType().getDescripcion().equalsIgnoreCase("administrador")) {
						info = new LinkedList<Object>();
						info.add(0, typeUserService.listTypeUser());
						info.add(1, companyService.listCompany());
						info.add(2, centerService.listCenter());
						ret = "redirect:/admin/panel";
					} else {
						
						ret = "redirect:/key/index";
					}
					ses.setInformacion(info);
					model.addAttribute("user_inicio", ses);
					return ret;
				} else {
					return "key/index";
				}
			} else {
				model.addAttribute("user", new User());
				model.addAttribute(
						"msg",
						"<script type=\"text/javascript\">$( window ).load(function() { adv(); }); </script>");
				return "key/index";
			}
		}
	}

	public void setuserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public UserManager getUserManager() {
		return userManager;
	}

}
