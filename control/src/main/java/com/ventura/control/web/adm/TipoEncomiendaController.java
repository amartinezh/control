package com.ventura.control.web.adm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.TipoEncomienda;
import com.ventura.control.service.control.TipoEncomiendaService;

@Controller 
@RequestMapping("/tipoencomienda")
@SessionAttributes({ "user_inicio" })
public class TipoEncomiendaController {

	@Autowired
	private TipoEncomiendaService tipoEncomienda;

	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("tipoEncomienda", new TipoEncomienda());
		model.put("listTipoEncomienda", tipoEncomienda.listarTipoEncomiendas());
		return "admin/tipoEncomienda";
	}

	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(@RequestParam int tipo_encomienda_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		TipoEncomienda obj = new TipoEncomienda(tipo_encomienda_id, descripcion);
		tipoEncomienda.agregarTipoEncomienda(obj);
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getTipo_encomienda_id()
				+ "', '"
				+ obj.getDescripcion()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ obj.getTipo_encomienda_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ descripcion;
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int tipo_encomienda_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (tipo_encomienda_id > 0) {
			String cad = "";
			System.out.print(cad);
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ tipo_encomienda_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ tipo_encomienda_id
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
	public @ResponseBody String borrar(@RequestParam int tipo_encomienda_id,
			Map<String, Object> model) {
		tipoEncomienda.borrarTipoEncomienda(new TipoEncomienda(tipo_encomienda_id));
		return "";
	}

}
