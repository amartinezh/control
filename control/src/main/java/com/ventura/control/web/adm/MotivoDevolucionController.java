package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.MotivoDevolucion;
import com.ventura.control.service.control.MotivoDevolucionService;;

@Controller
@RequestMapping("/motivodevolucion")
@SessionAttributes({ "user_inicio" })
public class MotivoDevolucionController {

	@Autowired
	private MotivoDevolucionService motivoDevolucion;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("motivoDevolucion", new MotivoDevolucion());
		model.put("listMotivoDevolucion", motivoDevolucion.listarMotivoDevoluciones());
		return "admin/motivodevolucion";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int motivo_devolucion_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		MotivoDevolucion obj = new MotivoDevolucion(motivo_devolucion_id, descripcion);
		motivoDevolucion.agregarMotivoDevolucion(obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getMotivo_devolucion_id()
				+ "', '"
				+ obj.getDescripcion()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ motivo_devolucion_id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ descripcion;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int motivo_devolucion_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (motivo_devolucion_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ motivo_devolucion_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ motivo_devolucion_id
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
	public @ResponseBody String borrar(@RequestParam int motivo_devolucion_id,
			Map<String, Object> model) {
		motivoDevolucion.borrarMotivoDevolucion(new MotivoDevolucion(motivo_devolucion_id));
		return "";
	}

}
