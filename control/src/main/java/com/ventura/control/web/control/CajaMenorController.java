package com.ventura.control.web.control;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.CajaMenor;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.Nivel;
import com.ventura.control.domain.control.TipoTransaccion;
import com.ventura.control.service.control.CajaMenorService;
import com.ventura.control.service.control.DependeciaService;
import com.ventura.control.service.control.TipoTransaccionService;

@Controller
@RequestMapping("/cajamenor_registrar")
@SessionAttributes({ "user_inicio" })
public class CajaMenorController {

	@Autowired
	private CajaMenorService caj;
	
	@Autowired
	private DependeciaService dep;

	@Autowired
	private TipoTransaccionService tip;

	@RequestMapping(method = RequestMethod.GET)
	public String cajamenor_add(Map<String, Object> model) {
		model.put("cajaMenor", new CajaMenor());
		model.put("dependenciaList", dep.cmbDependencias());
		model.put("tipoList", tip.cmbTipoTransaccionales());
		model.put("listCajaMenor", caj.listarCajaMenor());
		return "cajamenor/cajamenor_add";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int id,
			@RequestParam int tipo, @RequestParam int dependencia,
			@RequestParam String nombre, @RequestParam String apellido,
			@RequestParam String observaciones, @RequestParam String valor,
			@RequestParam String fecha, @RequestParam String hora,
			Map<String, Object> model) throws ParseException {
			caj.agregarCajaMenor(new CajaMenor(id, new Dependencia(dependencia), new TipoTransaccion(tipo), new SimpleDateFormat("yyyy-MM-dd").parse(fecha), nombre, apellido, new BigInteger(valor), new SimpleDateFormat("HH:mm").parse(hora), observaciones));
			
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ id
				+ "', '"
				+ id
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ id
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ tipo;
	}

}
