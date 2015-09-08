package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Conductor;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.service.control.ConductorService;
import com.ventura.control.service.control.DependeciaService;
import com.ventura.control.service.control.TipoPersonaService;
 
@Controller
@RequestMapping("/conductor_add")
@SessionAttributes({ "user_inicio" })
public class ConductorController {

	@Autowired
	private ConductorService conductor;
	
	@Autowired
	private DependeciaService dep;
	
	@Autowired
	private TipoPersonaService tip;
	
	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("conductor", new Conductor());
		model.put("tipopersonaList", tip.cmbTipoPersona());
		model.put("dependenciaList", dep.cmbDependencias());
		model.put("ConductorList", conductor.listarConductor());
		return "conductor/conductor_add";
	}
	
	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam String documento,
			@RequestParam String nombre_completo,
			@RequestParam String apellido,
			@RequestParam int tipo_persona_id,
			@RequestParam int dependencia_id,
			@RequestParam String coreo_e,
			@RequestParam String telefono,
			@RequestParam String scan_foto,
			@RequestParam String scan_cedula,
			@RequestParam String scan_huella,
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Conductor obj=null;
		obj = new Conductor(documento, nombre_completo, apellido, new TipoPersona(tipo_persona_id), new Dependencia(dependencia_id), coreo_e, telefono, scan_foto, scan_cedula, scan_huella, observaciones,estado);
		System.out.println(opcion.toString());
		if (conductor.validarConductor(obj)){
			if (opcion.equals("Actualizar")){
				conductor.agregarConductor(true, obj); // True: merge
				return "semodifico";
			}
			else{
				return "yaestaperonosemodifico";
			}
		}
		else{
				conductor.agregarConductor(false, obj);
		}
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getDocumento()
				+ "', '"
				+ obj.getNombre_completo()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ documento
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ obj.getNombre_completo();
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int documento,
			@RequestParam String nombre_completo, Map<String, Object> model) {
		if (documento > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ documento
					+ "', '"
					+ nombre_completo
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ documento
					+ ", $(this))'><i class='fa fa-trash-o'></i></a>"
					+ "<span class='responsiveExpander'></span>:::"
					+ nombre_completo + "";
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
		conductor.borrarConductor(new Conductor());
		return "";
	}

}
