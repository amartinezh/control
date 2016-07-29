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
import com.ventura.control.domain.nomina.TipoPermiso;
import com.ventura.control.service.control.PermisoService;
import com.ventura.control.service.nomina.TipoPermisoService;

@Controller 
@RequestMapping("/permiso")
@SessionAttributes({ "user_inicio" })
public class PermisoController {

	@Autowired
	private PermisoService permiso;
	
	@Autowired
	private TipoPermisoService tipoPermiso;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("Permiso", new Permiso());
		model.put("listPermiso", permiso.listarPermisos());
		model.put("listTipoPermiso", tipoPermiso.cmbTipoPermisos());
		return "permiso/permiso_add";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int permiso_id, @RequestParam int tipo_permiso_id,
			@RequestParam String fecha, @RequestParam String codigo_trabajador,
			@RequestParam String hora_entrada, @RequestParam String hora_salida, 
			@RequestParam String recibido_por, @RequestParam String novedad, @RequestParam String estado,
			@RequestParam String tipo_permiso_des, Map<String, Object> model) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Permiso obj = null;
		 
		try {
			obj = new Permiso(permiso_id, new TipoPermiso(tipo_permiso_id), formatter.parse(fecha), codigo_trabajador, hora_entrada, hora_salida, recibido_por, novedad, estado);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		obj.setEstado("1");
		System.out.println("............................."+obj.toString());
		permiso.agregarPermiso(obj);
		
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getPermiso_id() + "', '" + obj.getCodigo_trabajador() + "', '" + fecha
				+ "', '" + obj.getHora_entrada() +  "', '" + obj.getHora_salida() + "', '" + obj.getTipo_permiso_id().getTipo_permiso_id()
				+ "', '" + obj.getRecibido_por() + "', '" + obj.getNovedad() 				
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ obj.getPermiso_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"				
				+ fecha + ":::" + hora_entrada+ ":::" + hora_salida + ":::" + tipo_permiso_des + ":::" 
				+ codigo_trabajador + ":::" + recibido_por + ":::" + novedad;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int permiso_id, @RequestParam int tipo_permiso_id,
			@RequestParam String fecha, @RequestParam String codigo_trabajador,
			@RequestParam String hora_entrada, @RequestParam String hora_salida, 
			@RequestParam String recibido_por, @RequestParam String novedad, @RequestParam String estado,
			@RequestParam String tipo_permiso_des,
			Map<String, Object> model) {
		if (permiso_id > 0) {
			
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ permiso_id + "', '" + codigo_trabajador + "', '" + fecha
					+ "', '" + hora_entrada +  "', '" + hora_salida+ "', '" + tipo_permiso_id
					+ "', '" + recibido_por + "', '" + novedad				
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
					+ permiso_id
					+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"				
					+ fecha + ":::" + hora_entrada+ ":::" + hora_salida + ":::" + tipo_permiso_des + ":::" 
					+ codigo_trabajador + ":::" + recibido_por + ":::" + novedad;
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
