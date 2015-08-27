package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.CentroCosto;
import com.ventura.control.service.control.CentroCostoService;

@Controller
@RequestMapping("/centro")
@SessionAttributes({ "user_inicio" })
public class CentroCostoController {

	@Autowired
	private CentroCostoService centro;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("centro", new CentroCosto());
		model.put("listCentro", centro.listarCentroCosto());
		return "admin/centro";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int centro_costo_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		CentroCosto obj = new CentroCosto(centro_costo_id, descripcion);
		centro.agregarCentro(obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getCentro_costo_id()
				+ "', '"
				+ obj.getDescripcion()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ centro_costo_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ descripcion;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int centro_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (centro_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ centro_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ centro_id
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
	public @ResponseBody String borrar(@RequestParam int centro_id,
			Map<String, Object> model) {
		centro.borrarCentro(new CentroCosto(centro_id));
		return "";
	}

}
