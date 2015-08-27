package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Area;
import com.ventura.control.domain.control.Contratista;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.login.User;
import com.ventura.control.service.control.AreaService;
import com.ventura.control.service.control.ContratistaService;
import com.ventura.control.service.control.DependeciaService;
 
@Controller
//@RequestMapping("/area")
@SessionAttributes({ "user_inicio" })
public class ContratistaController {

	@Autowired
	private ContratistaService contratista;
	
	@Autowired
	private DependeciaService dep;
	
	
	@RequestMapping(value = "/contratista_add",method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("area", new Area());
		//model.put("listArea", area.listarAreas());
		//model.put("user", new User());
		//model.put("contratista", new Contratista());
		model.put("dependenciaList", dep.cmbDependencias());
		return "contratista/contratista_add";
	}
	
	@RequestMapping(value = "/contratista_hab_ingre",method = RequestMethod.GET)
	public String habilitar_ingreso(Map<String, Object> model) {
		model.put("user", new User());
		model.put("contratista", new Contratista());
		return "contratista/contratista_hab_ingre";
	}
	
	@RequestMapping(value = "/contratista_hab_sal",method = RequestMethod.GET)
	public String habilitar_salida(Map<String, Object> model) {
		model.put("user", new User());
		model.put("contratista", new Contratista());
		return "contratista/contratista_hab_sal";
	}
	
	@RequestMapping(value = "/contratista_conmov",method = RequestMethod.GET)
	public String consulta_movimiento(Map<String, Object> model) {
		model.put("user", new User());
		model.put("contratista", new Contratista());
		return "contratista/contratista_conmov";
	}
	
	@RequestMapping(value = "/contratista_geshor",method = RequestMethod.GET)
	public String gestiona_horario(Map<String, Object> model) {
		model.put("user", new User());
		model.put("contratista", new Contratista());
		return "contratista/contratista_horario";
	}
	
	@RequestMapping(value = "/contratista_nov",method = RequestMethod.GET)
	public String gestiona_novedad(Map<String, Object> model) {
		model.put("user", new User());
		model.put("contratista", new Contratista());
		return "contratista/contratista_nov";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int area_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		Contratista obj = new Contratista();
		contratista.agregarContratista(true, obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getDocumento()
				+ "', '"
				+ obj.getNombreCompleto()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ area_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ descripcion;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int area_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (area_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ area_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ area_id
					+ ", $(this))'><i class='fa fa-trash-o'></i></a>"
					+ "<span class='responsiveExpander'></span>:::"
					+ descripcion + "";
		} else {
			try {
				Integer.parseInt("a");
			} catch (Exception ex) {

			}
			return "";
		}
	}

	@RequestMapping(value = "borrar", method = RequestMethod.POST)
	public @ResponseBody String borrar(@RequestParam int area_id,
			Map<String, Object> model) {
		contratista.borrarContratista(new Contratista());
		return "";
	}

}
