package com.ventura.control.web.control;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Antecedente;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.service.control.AntecedenteService;
import com.ventura.control.service.control.DependeciaService;
import com.ventura.control.service.control.TipoPersonaService;
 
@Controller
@RequestMapping("/antecedente_add")
@SessionAttributes({ "user_inicio" })
public class AntecedenteController {

	@Autowired
	private AntecedenteService antecedente;
	
	@Autowired
	private DependeciaService dep;
	
	@Autowired
	private TipoPersonaService tip;
	
	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("antecedente", new Antecedente());
		model.put("antecedenteList", antecedente.listarAntecedentes());
		return "antecedente/antecedente_add";
	}
	
	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam int antecedente_id,
			@RequestParam String contratista_documento,
			@RequestParam Date fecha,
			@RequestParam byte[] scan_responsabilidad,
			@RequestParam byte[] scan_produraduria,
			@RequestParam byte[] scan_policia,
			@RequestParam byte[] scan_fiscalia,
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Antecedente obj=null;
		obj = new Antecedente(antecedente_id, contratista_documento, fecha, scan_responsabilidad, scan_produraduria, scan_policia, scan_fiscalia, observaciones, estado);
		System.out.println(opcion.toString());
		if (antecedente.validarAntecedente(obj)){
			if (opcion.equals("Actualizar")){
				antecedente.agregarAntecedente(true, obj); // True: merge
				return "semodifico";
			}
			else{
				return "yaestaperonosemodifico";
			}
		}
		else{
				antecedente.agregarAntecedente(false, obj);
		}
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getAntecedente_id()
				+ "', '"
				+ obj.getContratista_documento()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ obj.getAntecedente_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ obj.getContratista_documento();
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
		antecedente.borrarAntecedente(new Antecedente());
		return "";
	}
}
