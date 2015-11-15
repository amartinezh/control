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

import com.ventura.control.domain.control.Conductor;
import com.ventura.control.domain.control.Contratista;
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
		model.put("conductorList", conductor.listarConductor());
		return "conductor/conductor_add";
	}
	
	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam String documento,
			@RequestParam String fecha_registro,
			@RequestParam String nombre_completo,
			@RequestParam String apellido,
			@RequestParam String correo_e,
			@RequestParam String telefono,
			@RequestParam String scan_foto,
			@RequestParam String scan_cedula,
			@RequestParam String scan_huella,
			@RequestParam String empresa_de_transporte,
			@RequestParam String placa,
			@RequestParam String trailer,
			@RequestParam String eps,
			@RequestParam String eps_vence,
			@RequestParam String arl,
			@RequestParam String arl_vence,
			@RequestParam String precinto,
			@RequestParam String documento_patiero,
			@RequestParam String scan_orden_cargue,
			@RequestParam String scan_tarjeta_propiedad,
			@RequestParam String scan_arl,
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Conductor obj=null;
		try{
				obj = new Conductor(documento, formatter.parse(fecha_registro), nombre_completo, apellido, correo_e, telefono, scan_foto, scan_cedula, scan_huella, empresa_de_transporte, placa, trailer, eps, formatter.parse(eps_vence),arl, formatter.parse(arl_vence), precinto, documento_patiero, scan_orden_cargue, scan_tarjeta_propiedad, scan_arl, observaciones,"1");
				//System.out.print(obj.toString());
		} catch (ParseException e) {
			return "error";
		}
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
	public @ResponseBody String cancelar(
			@RequestParam String documento,
			@RequestParam String fecha_registro,
			@RequestParam String nombre_completo,
			@RequestParam String apellido,
			@RequestParam String correo_e,
			@RequestParam String telefono,
			@RequestParam String scan_foto,
			@RequestParam String scan_cedula,
			@RequestParam String scan_huella,
			@RequestParam String empresa_de_transporte,
			@RequestParam String placa,
			@RequestParam String trailer,
			@RequestParam String eps,
			@RequestParam String eps_vence,
			@RequestParam String arl,
			@RequestParam String arl_vence,
			@RequestParam String precinto,
			@RequestParam String documento_patiero,
			@RequestParam String scan_orden_cargue,
			@RequestParam String scan_tarjeta_propiedad,
			@RequestParam String scan_arl,
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		if (Integer.parseInt(documento) > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ documento + "', '"
					+ nombre_completo + "', '"
					+ apellido + "', '"
					+ correo_e + "', '"
					+ telefono + "', '"
					+ scan_foto + "', '"
					+ scan_cedula + "', '"
					+ scan_huella + "', '"
					+ empresa_de_transporte + "', '"
					+ placa + "', '"
					+ trailer + "', '"
					+ eps + "', '"
					+ eps_vence + "', '"
					+ arl + "', '"
					+ arl_vence + "', '"
					+ precinto + "', '"
					+ documento_patiero + "', '"
					+ scan_orden_cargue + "', '"
					+ scan_tarjeta_propiedad + "', '"
					+ scan_arl + "', '"
					+ observaciones + "', '"
					+ estado + "', '"
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
	public @ResponseBody String borrar(@RequestParam String documento,
			Map<String, Object> model) {
		conductor.borrarConductor(new Conductor(documento));
		return "";
	}
	
	@RequestMapping(value = "re", method = RequestMethod.GET)
	public String proceo_hi(Map<String, Object> model) {
		model.put("contratista", new Contratista());
		return "conductor/conductor_ent";
	}
	
	@RequestMapping(value = "hs", method = RequestMethod.GET)
	public String proceo_hs(Map<String, Object> model) {
		model.put("contratista", new Contratista());
		return "conductor/conductor_sal";
	}

}
