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

import com.ventura.control.domain.control.ControlTaxi;
import com.ventura.control.domain.control.Permiso;
import com.ventura.control.domain.nomina.TipoPermiso;
import com.ventura.control.service.control.ControlTaxiService;

@Controller
@RequestMapping("/transporte_agregar_taxi")
@SessionAttributes({ "user_inicio" })
public class ControlTaxiController {

	@Autowired
	private ControlTaxiService controlTaxiService;

	@RequestMapping(method = RequestMethod.GET)
	public String transporte_taxi_add(Map<String, Object> model) {
		model.put("controlTaxi", new ControlTaxi());
		return "transporte/transporte_taxi_add";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int id,
			@RequestParam String codigoTrabajador,
			@RequestParam String horaEntrada, @RequestParam String horaSalida,
			@RequestParam String nombreConductor,
			@RequestParam String observaciones, Map<String, Object> model) {
		controlTaxiService.agregarControlTaxi(new ControlTaxi(id, codigoTrabajador, horaEntrada, horaEntrada, horaSalida, nombreConductor, observaciones));
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ id
				+ "', '"
				+ codigoTrabajador
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ codigoTrabajador
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ codigoTrabajador;
	}

}
