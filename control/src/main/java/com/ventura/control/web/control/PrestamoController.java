package com.ventura.control.web.control;

import java.text.ParseException;
import java.util.Calendar;
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

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam String nombreCompleto, @RequestParam String apellido,
			@RequestParam int cantidadLlave, @RequestParam int dependencia,
			@RequestParam String quienEntrego,
			@RequestParam String quienRecibio,
			@RequestParam String observaciones, Map<String, Object> model) {
		PrestaLlave pr = null;
		java.util.Date date = new java.util.Date();
		java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.text.SimpleDateFormat h = new java.text.SimpleDateFormat("HH:mm:ss");
		try {
			//System.out.println("---------------"+f.format(date)+"----------------------");
			//System.out.println("---------------"+h.format(date)+"----------------------");
			pr = new PrestaLlave(0, f.parse(f.format(date)) , h.parse(h.format(date)), nombreCompleto, apellido,
					cantidadLlave, quienEntrego, quienRecibio, observaciones, "1", new Dependencia(dependencia));
		
			presta.agregarPrestaLlave(pr);
			return f.format(date) + ":::" + h.format(date) + ":::" + nombreCompleto + ":::" + apellido + ":::"
					+ cantidadLlave + ":::" + dependencia + ":::" + quienEntrego
					+ ":::" + quienRecibio + ":::" + observaciones;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}