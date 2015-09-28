package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.PrestaLlave;
import com.ventura.control.service.control.DependeciaService;
import com.ventura.control.service.control.PrestaLlaveService;

@Controller
@RequestMapping("/llave_prestamo")
@SessionAttributes({ "user_inicio" })
public class PrestamoController {

	@Autowired
	private PrestaLlaveService presta;

	@Autowired
	private DependeciaService dep;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("prestamo", new PrestaLlave());
		model.put("dependenciaList", dep.cmbDependencias());
		model.put("nombreLlave", "Prestamo llave");
		model.put("listPrestamo", presta.listarPrestaLlave("1"));
		return "llave/llave_pre";
	}

	/*
	 * @RequestMapping(value = "agregar", method = RequestMethod.POST) public
	 * 
	 * @ResponseBody String agregar(@RequestParam Date fecha,
	 * 
	 * @RequestParam String nombreCompleto, @RequestParam String apellido,
	 * 
	 * @RequestParam int cantidadLlave, @RequestParam int dependencia,
	 * 
	 * @RequestParam String quienEntrego,
	 * 
	 * @RequestParam String quienRecibio,
	 * 
	 * @RequestParam String observaciones, Map<String, Object> model) { //
	 * CentroCosto obj = new CentroCosto(centro_costo_id, descripcion); //
	 * centro.agregarCentro(obj); return
	 * "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
	 * + " onclick=\"con('" + nombreCompleto + "', '" + apellido + "', $(this)"
	 * +
	 * ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
	 * + apellido +
	 * ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
	 * + apellido; }
	 */

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam String fecha,
			@RequestParam String nombreCompleto, @RequestParam String apellido,
			@RequestParam int cantidadLlave, @RequestParam int dependencia,
			@RequestParam String quienEntrego,
			@RequestParam String quienRecibio,
			@RequestParam String observaciones, Map<String, Object> model) {
		PrestaLlave pr = new PrestaLlave(0, nombreCompleto, apellido,
				cantidadLlave, quienEntrego, quienRecibio, observaciones, "1");
		pr.setDependenciaId(new Dependencia(dependencia));
		presta.agregarPrestaLlave(pr);
		return fecha + "::: :::" + nombreCompleto + ":::" + apellido + ":::"
				+ cantidadLlave + ":::" + dependencia + ":::" + quienEntrego
				+ ":::" + quienRecibio;
	}
}