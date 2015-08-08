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

@SessionAttributes({ "user_inicio" })
public class Contratista_AddController {

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/contratista_add",method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("user", new User());
		return "contratista/contratista_add";
	}
	
	@RequestMapping(value = "/contratista_hab_ingre",method = RequestMethod.GET)
	public String habilitar_ingreso(Map<String, Object> model) {
		model.put("user", new User());
		return "contratista/contratista_hab_ingre";
	}
	
	@RequestMapping(value = "/contratista_hab_sal",method = RequestMethod.GET)
	public String habilitar_salida(Map<String, Object> model) {
		model.put("user", new User());
		return "contratista/contratista_hab_sal";
	}
	
	@RequestMapping(value = "/contratista_conmov",method = RequestMethod.GET)
	public String consulta_movimiento(Map<String, Object> model) {
		model.put("user", new User());
		return "contratista/contratista_conmov";
	}
	
	@RequestMapping(value = "/contratista_geshor",method = RequestMethod.GET)
	public String gestiona_horario(Map<String, Object> model) {
		model.put("user", new User());
		return "contratista/contratista_horario";
	}
	
	@RequestMapping(value = "/contratista_nov",method = RequestMethod.GET)
	public String gestiona_novedad(Map<String, Object> model) {
		model.put("user", new User());
		return "contratista/contratista_nov";
	}
	
	@RequestMapping(value = "/visitante_add",method = RequestMethod.GET)
	public String visitante_add(Map<String, Object> model) {
		model.put("user", new User());
		return "visitante/visitante_add";
	}
	
	@RequestMapping(value = "/visitante_hab_ingre",method = RequestMethod.GET)
	public String visitante_ingreso(Map<String, Object> model) {
		model.put("user", new User());
		return "visitante/visitante_hab_ingre";
	}
	
	@RequestMapping(value = "/visitante_hab_sal",method = RequestMethod.GET)
	public String visitante_salida(Map<String, Object> model) {
		model.put("user", new User());
		return "visitante/visitante_hab_sal";
	}
	
	@RequestMapping(value = "/visitante_conmov",method = RequestMethod.GET)
	public String visitante_conmov(Map<String, Object> model) {
		model.put("user", new User());
		return "visitante/visitante_conmov";
	}
	
	@RequestMapping(value = "/visitante_horario",method = RequestMethod.GET)
	public String visitante_horario(Map<String, Object> model) {
		model.put("user", new User());
		return "visitante/visitante_horario";
	}
	
	@RequestMapping(value = "/conductor_add",method = RequestMethod.GET)
	public String conductor_add(Map<String, Object> model) {
		model.put("user", new User());
		return "conductor/conductor_add";
	}
	
	@RequestMapping(value = "/conductor_ent",method = RequestMethod.GET)
	public String conductor_ent(Map<String, Object> model) {
		model.put("user", new User());
		return "conductor/conductor_ent";
	}
	
	@RequestMapping(value = "/conductor_sal",method = RequestMethod.GET)
	public String conductor_sal(Map<String, Object> model) {
		model.put("user", new User());
		return "conductor/conductor_sal";
	}
	
	@RequestMapping(value = "/llave_prestamo",method = RequestMethod.GET)
	public String llave_pre(Map<String, Object> model) {
		model.put("user", new User());
		return "llave/llave_pre";
	}
	
	@RequestMapping(value = "/llave_devolucion",method = RequestMethod.GET)
	public String llave_devolucion(Map<String, Object> model) {
		model.put("user", new User());
		return "llave/llave_devolucion";
	}
	
	@RequestMapping(value = "/permisos_agregar",method = RequestMethod.GET)
	public String permiso_add(Map<String, Object> model) {
		model.put("user", new User());
		return "permiso/permiso_add";
	}
	
	@RequestMapping(value = "/permisos_retirar",method = RequestMethod.GET)
	public String permiso_ret(Map<String, Object> model) {
		model.put("user", new User());
		return "permiso/permiso_ret";
	}
	
	@RequestMapping(value = "/transporte_agregar_bus",method = RequestMethod.GET)
	public String transporte_bus_add(Map<String, Object> model) {
		model.put("user", new User());
		return "transporte/transporte_bus_add";
	}
	
	@RequestMapping(value = "/transporte_consultar_bus",method = RequestMethod.GET)
	public String transporte_bus_con(Map<String, Object> model) {
		model.put("user", new User());
		return "transporte/transporte_bus_con";
	}

	@RequestMapping(value = "/transporte_agregar_taxi",method = RequestMethod.GET)
	public String transporte_taxi_add(Map<String, Object> model) {
		model.put("user", new User());
		return "transporte/transporte_taxi_add";
	}
	
	@RequestMapping(value = "/transporte_consultar_taxi",method = RequestMethod.GET)
	public String transporte_taxi_con(Map<String, Object> model) {
		model.put("user", new User());
		return "transporte/transporte_taxi_con";
	}
	
	@RequestMapping(value = "/minuta_registrar",method = RequestMethod.GET)
	public String minuta_add(Map<String, Object> model) {
		model.put("user", new User());
		return "minuta/minuta_add";
	}
	
	@RequestMapping(value = "/cajamenor_registrar",method = RequestMethod.GET)
	public String cajamenor_add(Map<String, Object> model) {
		model.put("user", new User());
		return "cajamenor/cajamenor_add";
	}
	
	@RequestMapping(value = "/devolucion_registrar",method = RequestMethod.GET)
	public String devolucion_add(Map<String, Object> model) {
		model.put("user", new User());
		return "devolucion/devolucion_add";
	}
	
	@RequestMapping(value = "/exportacion_registrar",method = RequestMethod.GET)
	public String exportacion_add(Map<String, Object> model) {
		model.put("user", new User());
		return "exportacion/exportacion_add";
	}
}