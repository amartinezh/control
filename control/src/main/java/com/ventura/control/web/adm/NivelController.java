package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Nivel;
import com.ventura.control.service.control.NivelService;

@Controller
@RequestMapping("/nivel")
@SessionAttributes({ "user_inicio" })
public class NivelController {

	@Autowired
	private NivelService nivel;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("nivel", new Nivel());
		model.put("listNivel", nivel.listarNivel());
		return "admin/nivel";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int nivel_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		Nivel obj = new Nivel(nivel_id, descripcion);
		nivel.agregarNivel(obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getNivel_id()
				+ "', '"
				+ obj.getDescripcion()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ nivel_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ descripcion;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int nivel_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (nivel_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ nivel_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ nivel_id
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
	public @ResponseBody String borrar(@RequestParam int nivel_id,
			Map<String, Object> model) {
		nivel.borrarNivel(new Nivel(nivel_id));
		return "";
	}

}
