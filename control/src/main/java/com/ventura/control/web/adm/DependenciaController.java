package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int dependencia_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		Dependencia dep = new Dependencia(dependencia_id, descripcion);
		dependencia.agregarDependencia(dep);
		// else
		// dependencia.agregarDependencia(dep);
		// model.put("dependencia", new Dependencia());
		// model.put("listDependencia", dependencia.listarDependencias());
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ "onclick = con("
				+ dep.getDependencia_id()
				+ ")><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ dep.getDependencia_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a>"
				+ "<span class='responsiveExpander'></span>:::"
				+ descripcion
				+ "";
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int dependencia_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (dependencia_id > 0) {
			String cad = "'"+dependencia_id + "', '" + descripcion + "', $(this)";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=con(" + cad
					+ ")><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ dependencia_id
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
	public @ResponseBody String borrar(@RequestParam int dependencia_id,
			Map<String, Object> model) {
		dependencia.borrarDependencia(new Dependencia(dependencia_id));
		return "";
	}

}
