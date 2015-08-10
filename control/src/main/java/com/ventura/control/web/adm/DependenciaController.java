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
	public @ResponseBody String agregar(@RequestParam String descripcion,
			Map<String, Object> model) {
		Dependencia dep = new Dependencia(0, descripcion);
		dependencia.agregarDependencia(dep);
		// model.put("dependencia", new Dependencia());
		// model.put("listDependencia", dependencia.listarDependencias());
		return "<tr role='row' class='odd'><td class='sorting_1'><span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ "href='javascript:void(0);'><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' href='javascript:void(0);'><i class='fa fa-trash-o'></i></a></td>"
				+ "<td class='sorting_1'><span class='responsiveExpander'></span>"
				+ descripcion + "</td>	</tr>";
	}

}
