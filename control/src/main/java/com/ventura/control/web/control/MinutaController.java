package com.ventura.control.web.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Actividad;
import com.ventura.control.domain.control.Area;
import com.ventura.control.domain.control.Minuta;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.service.control.ActividadService;
import com.ventura.control.service.control.AreaService;
import com.ventura.control.service.control.MinutaService;
import com.ventura.control.service.control.DependeciaService;
 
@Controller
@RequestMapping("/minuta_add")
@SessionAttributes({ "user_inicio" })
public class MinutaController {

	@Autowired
	private MinutaService minuta;
	
	@Autowired
	private DependeciaService dep;
	
	@Autowired
	private AreaService area;
	
	@Autowired
	private ActividadService actividad;
	
	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("minuta", new Minuta());
		model.put("dependenciaList", dep.cmbDependencias());
		model.put("areaList", area.cmbAreas());
		model.put("actividadList", actividad.cmbActividades());
		model.put("minutaList", minuta.listarMinuta());
		return "minuta/minuta_add";
	}
	
	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam int minuta_id,
			@RequestParam String placa,
			@RequestParam int dependencia_id,
			@RequestParam int area_id,
			@RequestParam int actividad_id,			
			@RequestParam String hora_inicio,
			@RequestParam String hora_terminacion,
			@RequestParam String codigo_trabajador,
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		//java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Minuta obj=null;
		obj = new Minuta(0, placa, new Dependencia(dependencia_id), new Area(area_id), new Actividad(actividad_id), hora_inicio, hora_terminacion, codigo_trabajador, observaciones,"1");
		
		if (minuta_id == 0){
			if (opcion.equals("Actualizar")){				
				minuta.agregarMinuta(true, obj); // True: merge
				return "se modifico";
			}
			else{
				return "ya esta pero no se modifico";
			}
		}
		else{
				minuta.agregarMinuta(false, obj);
		}
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getMinuta_id()
				+ "', '"
				+ obj.getPlaca()
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ obj.getMinuta_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ obj.getPlaca();
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int minuta_id,
			@RequestParam String placa, Map<String, Object> model) {
		if (minuta_id > 0) {
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ minuta_id
					+ "', '"
					+ placa
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ minuta_id
					+ ", $(this))'><i class='fa fa-trash-o'></i></a>"
					+ "<span class='responsiveExpander'></span>:::"
					+ placa + "";
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
		minuta.borrarMinuta(new Minuta());
		return "";
	}
}
