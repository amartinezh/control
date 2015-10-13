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
		model.put("contratistaList", contratista.listarContratistas());
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
			@RequestParam String codigo_trabajador,
			@RequestParam String placa,
			@RequestParam String eps,
			@RequestParam String eps_vence,
			@RequestParam String alr,
			@RequestParam String alr_vence,
			@RequestParam String inventario,
			@RequestParam String scan_inventario,
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Contratista obj=null;
		try {
			obj = new Contratista(documento, nombre_completo, apellido, new TipoPersona(tipo_persona_id), new Dependencia(dependencia_id), coreo_e, telefono, scan_foto, scan_cedula, scan_huella, empresa, nit_empresa, formatter.parse(fecha_ven_curso_ley), codigo_trabajador, placa, eps, formatter.parse(eps_vence), alr, formatter.parse(alr_vence), inventario, scan_inventario, observaciones,estado);
		} catch (ParseException e) {
			return "error";
		}
		System.out.println(opcion.toString());
		if (contratista.validarContratista(obj)){
			if (opcion.equals("Actualizar")){
				contratista.agregarContratista(true, obj); // True: merge
				return "semodifico";
			}
			else{
				return "yaestaperonosemodifico";
			}
		}
		else{
				contratista.agregarContratista(false, obj);
		}
		try {
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ obj.getDocumento() + "', '"
					+ obj.getNombre_completo() + "', '"
					+ obj.getApellido() + "', '"
					+ obj.getTipo_persona_id() + "', '"
					+ obj.getDependencia_id() + "', '"
					+ obj.getCoreo_e() + "', '"
					+ obj.getTelefono() + "', '"
					+ obj.getScan_foto() + "', '"
					+ obj.getScan_cedula() + "', '"
					+ obj.getScan_huella() + "', '"
					+ obj.getEmpresa() + "', '"
					+ obj.getNit_empresa() + "', '"
					+ formatter.parse(obj.getFecha_ven_curso_ley().toString()) + "', '"
					+ obj.getCodigo_trabajador() + "', '"
					+ obj.getPlaca() + "', '"
					+ obj.getEps() + "', '"
					+ formatter.parse(obj.getEps_vence().toString()) + "', '"
					+ obj.getAlr() + "', '"
					+ formatter.parse(obj.getAlr_vence().toString()) + "', '"
					+ obj.getInventario() + "', '"
					+ obj.getScan_inventario() + "', '"
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
					+ documento
					+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
					+ obj.getNombre_completo();
		} catch (ParseException e) {
			
			e.printStackTrace();
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
			+ " onclick=\"con('"
			+ obj.getDocumento() + "', '"
			+ obj.getNombre_completo() + "', '"
			+ obj.getApellido() + "', '"
			+ obj.getTipo_persona_id() + "', '"
			+ obj.getDependencia_id() + "', '"
			+ obj.getCoreo_e() + "', '"
			+ obj.getTelefono() + "', '"
			+ obj.getScan_foto() + "', '"
			+ obj.getScan_cedula() + "', '"
			+ obj.getEmpresa() + "', '"
			+ obj.getNit_empresa() + "', '"
			+ "', '" // Sin fechas
			+ obj.getCodigo_trabajador() + "', '"
			+ obj.getPlaca() + "', '"
			+ obj.getEps() + "', '"
			+ "', '"
			+ obj.getAlr() + "', '"
			+ "', '"
			+ obj.getInventario() + "', '"
			+ obj.getScan_inventario() + "', '"
			+ "', $(this)"
			+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
			+ documento
			+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
			+ obj.getNombre_completo();
		}
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(
			@RequestParam String documento,
			@RequestParam String nombre_completo,
			@RequestParam String apellido,
			@RequestParam int tipo_persona_id,
			@RequestParam int dependencia_id,
			@RequestParam String coreo_e,
			@RequestParam String telefono,
			@RequestParam String scan_foto,
			@RequestParam byte[] scan_cedula,
			@RequestParam String scan_huella,
			@RequestParam String empresa,
			@RequestParam String nit_empresa,
			@RequestParam String fecha_ven_curso_ley,
			@RequestParam String codigo_trabajador,
			@RequestParam String placa,
			@RequestParam String eps,
			@RequestParam String eps_vence,
			@RequestParam String alr,
			@RequestParam String alr_vence,
			@RequestParam String inventario,
			@RequestParam String scan_inventario,
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
					+ tipo_persona_id + "', '"
					+ dependencia_id + "', '"
					+ coreo_e + "', '"
					+ telefono + "', '"
					+ scan_foto + "', '"
					+ scan_cedula + "', '"
					+ scan_huella + "', '"
					+ empresa + "', '"
					+ nit_empresa + "', '"
					+ fecha_ven_curso_ley + "', '"
					+ codigo_trabajador + "', '"
					+ placa + "', '"
					+ eps + "', '"
					+ eps_vence + "', '"
					+ alr + "', '"
					+ alr_vence + "', '"
					+ inventario + "', '"
					+ scan_inventario + "', '"
					+ observaciones + "', '"
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
					+ documento
					+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
					+ nombre_completo;
		} else {
			try {
				Integer.parseInt("a");
			} catch (Exception ex) {

			}
			return "";
		}
	}

	@RequestMapping(value = "borrar", method = RequestMethod.POST)
	public @ResponseBody String borrar(@RequestParam String documento,	Map<String, Object> model) {
		contratista.borrarContratista(new Contratista(documento));
		return "";
	}

	@RequestMapping(value = "hi", method = RequestMethod.GET)
	public String proceo_hi(Map<String, Object> model) {
		model.put("contratista", new Contratista());
		model.put("tipopersonaList", tip.cmbTipoPersona());
		model.put("dependenciaList", dep.cmbDependencias());
		model.put("contratistaList", contratista.listarContratistas());
		return "contratista/contratista_hab_ingre";
	}
	
	@RequestMapping(value = "hs", method = RequestMethod.GET)
	public String proceo_hs(Map<String, Object> model) {
		model.put("contratista", new Contratista());
		return "contratista/contratista_hab_sal";
	}

}
