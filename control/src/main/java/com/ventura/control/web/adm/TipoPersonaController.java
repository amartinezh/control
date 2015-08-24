package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.service.control.TipoPersonaService;

@Controller
@RequestMapping("/tipopersona")
@SessionAttributes({ "user_inicio" })
public class TipoPersonaController {

	@Autowired
	private TipoPersonaService tipoPersona;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("tipoPersona", new TipoPersona());
		model.put("listTipoPersona", tipoPersona.listarTipoPersonas());
		return "admin/tipopersona";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int tipo_persona_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		TipoPersona obj = new TipoPersona(tipo_persona_id, descripcion);
		tipoPersona.agregarTipoPersona(obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getTipo_persona_id()
				+ "', '"
				+ obj.getDescripcion()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ tipo_persona_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ descripcion;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int tipo_persona_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (tipo_persona_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ tipo_persona_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ tipo_persona_id
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
	public @ResponseBody String borrar(@RequestParam int tipo_persona_id,
			Map<String, Object> model) {
		tipoPersona.borrarTipoPersona(new TipoPersona(tipo_persona_id));
		return "";
	}

}
