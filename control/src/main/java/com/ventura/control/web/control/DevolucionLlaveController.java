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
@RequestMapping("/llave_devolucion")
@SessionAttributes({ "user_inicio" })

public class DevolucionLlaveController {
	

	@Autowired
	private PrestaLlaveService presta;

	@Autowired
	private DependeciaService dep;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("prestamo", new PrestaLlave());
		model.put("dependenciaList", dep.cmbDependencias());
		model.put("nombreLlave", "Devolución llave");
		model.put("listPrestamo", presta.listarPrestaLlave("2"));
		return "llave/llave_pre";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam String fecha,
			@RequestParam String nombreCompleto, @RequestParam String apellido,
			@RequestParam int cantidadLlave, @RequestParam int dependencia,
			@RequestParam String quienEntrego,
			@RequestParam String quienRecibio,
			@RequestParam String observaciones, Map<String, Object> model) {
		PrestaLlave pr = new PrestaLlave(0, nombreCompleto, apellido,
				cantidadLlave, quienEntrego, quienRecibio, observaciones, "2");
		pr.setDependenciaId(new Dependencia(dependencia));
		presta.agregarPrestaLlave(pr);
		return fecha + "::: :::" + nombreCompleto + ":::" + apellido + ":::"
				+ cantidadLlave + ":::" + dependencia + ":::" + quienEntrego
				+ ":::" + quienRecibio;
	}


}
