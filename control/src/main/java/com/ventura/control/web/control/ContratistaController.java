package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Contratista;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.domain.login.User;
import com.ventura.control.service.control.ContratistaService;
import com.ventura.control.service.control.DependeciaService;
import com.ventura.control.service.control.TipoPersonaService;
 
@Controller
@RequestMapping("/contratista_add")
@SessionAttributes({ "user_inicio" })
public class ContratistaController {

	@Autowired
	private ContratistaService contratista;
	
	@Autowired
	private DependeciaService dep;
	
	@Autowired
	private TipoPersonaService tip;
	
	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("contratista", new Contratista());
		model.put("tipopersonaList", tip.cmbTipoPersona());
		model.put("dependenciaList", dep.cmbDependencias());
		return "contratista/contratista_add";
	}
	
	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam int documento,
			@RequestParam String nombreCompleto,
			@RequestParam String apellido,
			//@RequestParam TipoPersona tipoPersonaId,
			//@RequestParam Dependencia dependencia_id,
			@RequestParam String coreoE,
			@RequestParam String telefono,
			@RequestParam byte[] scanFoto,
			@RequestParam byte[] scanCedula,
			@RequestParam byte[] scanHuella,
			@RequestParam String empresa,
			@RequestParam String nitEmpresa,
			@RequestParam String fechaVenCursoLey,
			@RequestParam String idPersonaResponsable,
			@RequestParam String antecedente,
			@RequestParam String placa,
			@RequestParam String eps,
			@RequestParam java.util.Date epsVence,
			@RequestParam String alr,
			@RequestParam java.util.Date alrVence,
			@RequestParam String inventario,
			@RequestParam byte[] scanInventario,
			@RequestParam String observaciones,	
			Map<String, Object> model) {
		Contratista obj = new Contratista();
		contratista.agregarContratista(false, obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getDocumento()
				+ "', '"
				+ obj.getNombreCompleto()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ documento
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ nombreCompleto;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int area_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (area_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ area_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ area_id
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
	public @ResponseBody String borrar(@RequestParam int area_id,
			Map<String, Object> model) {
		contratista.borrarContratista(new Contratista());
		return "";
	}

}
