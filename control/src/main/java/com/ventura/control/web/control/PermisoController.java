package com.ventura.control.web.control;

import java.text.ParseException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Permiso;
import com.ventura.control.service.control.PermisoService;

@Controller 
@RequestMapping("/permiso")
@SessionAttributes({ "user_inicio" })
public class PermisoController {

	@Autowired
	private PermisoService permiso;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("Permiso", new Permiso());
		model.put("listPermiso", permiso.listarPermisos());
		return "permiso/permiso_add";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar( @RequestParam String tipo_permiso_id,
			@RequestParam String fecha, @RequestParam String codigo_trabajador,
			@RequestParam String hora_entrada, @RequestParam String hora_salida, 
			@RequestParam String recibido_por, @RequestParam String novedad, @RequestParam String estado,
			Map<String, Object> model) {
		int x=Integer.parseInt(tipo_permiso_id);
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Permiso obj = null;
		try {
			obj = new Permiso(0, x, formatter.parse(fecha), codigo_trabajador, hora_entrada, hora_salida, recibido_por, novedad, estado);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		obj.setTipo_permiso_id(x);
		obj.setEstado("1");
		System.out.println("............................."+obj.toString());
		permiso.agregarPermiso(obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getPermiso_id()
				+ "', '"
				+ obj.getCodigo_trabajador()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ obj.getPermiso_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ codigo_trabajador;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int permiso_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (permiso_id > 0) {
			String cad = "";
			System.out.print(cad);
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ permiso_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ permiso_id
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
	public @ResponseBody String borrar(@RequestParam int permiso_id,
			Map<String, Object> model) {
		permiso.borrarPermiso(new Permiso(permiso_id));
		return "";
	}

}
