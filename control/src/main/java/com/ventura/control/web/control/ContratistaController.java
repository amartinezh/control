package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Antecedente;
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
			@RequestParam String empresa,
			@RequestParam String nit_empresa,
			@RequestParam String fecha_ven_curso_ley,
			@RequestParam String id_persona_responsable,
			@RequestParam String placa,
			@RequestParam String eps,
			@RequestParam java.util.Date eps_vence,
			@RequestParam String alr,
			@RequestParam java.util.Date alr_vence,
			@RequestParam String inventario,
			@RequestParam String scan_inventario,
			@RequestParam String codigo_antecedente,
			@RequestParam String observaciones,
			@RequestParam String estado,
			Map<String, Object> model) {
		/* Contratista obj = new Contratista(documento,nombreCompleto,apellido,new TipoPersona(tipoPersonaId), new Dependencia(dependencia_id), coreoE,telefono,scanFoto,scanCedula,scanHuella, empresa,nitEmpresa,fechaVenCursoLey,idPersonaResponsable, new Antecedente(antecedente),placa,eps,epsVence,alr,alrVence,inventario,scanInventario,observaciones);
		
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
				*/
		return "";
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
