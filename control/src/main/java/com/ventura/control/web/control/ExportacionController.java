package com.ventura.control.web.control;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ventura.control.domain.control.Antecedente;
import com.ventura.control.domain.control.Exportacion;
import com.ventura.control.domain.control.Dependencia;
import com.ventura.control.domain.control.TipoPersona;
import com.ventura.control.domain.control.TipoProducto;
import com.ventura.control.domain.login.User;
import com.ventura.control.service.control.ExportacionService;
import com.ventura.control.service.control.DependeciaService;
import com.ventura.control.service.control.TipoPersonaService;
import com.ventura.control.service.control.TipoProductoService;
 
@Controller
@RequestMapping("/exportacion_add")
@SessionAttributes({ "user_inicio" })
public class ExportacionController {

	@Autowired
	private ExportacionService exportacion;
	
	@Autowired
	private TipoProductoService tip;
	
	@RequestMapping(method = RequestMethod.GET)
	public String panel(Map<String, Object> model) {
		model.put("exportacion", new Exportacion());
		model.put("listTipProd", tip.cmbTipoProducto());
		return "exportacion/exportacion_add";
	}
	
	@RequestMapping(value = "agregar", method = RequestMethod.POST)
	public @ResponseBody String agregar(
			@RequestParam String documento,
			@RequestParam int exportacion_id, 
			@RequestParam java.util.Date fecha,
			@RequestParam TipoProducto tipo_producto_id, 
			@RequestParam String cliente, 
			@RequestParam String pais_destino,
			@RequestParam String puerto_llegada,
			@RequestParam String placa_vehiculo,
			@RequestParam String numero_contenedor,
			@RequestParam String numero_trailer,
			@RequestParam String transportadora, 
			@RequestParam Date inicio_operacion,
			@RequestParam Date inicio_inspeccion, 
			@RequestParam Date inicio_cargue,
			@RequestParam Date fin_cargue,
			@RequestParam Date fin_operacion, 
			@RequestParam int peso_pt_kg, 
			@RequestParam int peso_boina,
			@RequestParam String numero_pedido, 
			@RequestParam String pacas, 
			@RequestParam int numero_bobinas,
			@RequestParam int numero_cajas, 
			@RequestParam String acta_antinarcotico,
			@RequestParam String numero_precinto, 
			@RequestParam String sello_aleatorio,
			@RequestParam String vigilante_proteccion, 
			@RequestParam String observaciones,
			@RequestParam String estado,
			@RequestParam String opcion,
			Map<String, Object> model) {
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Exportacion obj=null;
		obj = new Exportacion(exportacion_id, fecha, tipo_producto_id, cliente, pais_destino, puerto_llegada, placa_vehiculo, numero_contenedor, numero_trailer, transportadora, inicio_operacion, inicio_inspeccion, inicio_cargue, fin_cargue, fin_operacion, peso_pt_kg, peso_boina, numero_pedido, pacas, numero_bobinas, numero_cajas, acta_antinarcotico, numero_precinto, sello_aleatorio, vigilante_proteccion, observaciones, estado);
		System.out.println(opcion.toString());
		if (exportacion.validarExportacion(obj)){
			if (opcion.equals("Actualizar")){
				exportacion.agregarExportacion(true, obj); // True: merge
				return "semodifico";
			}
			else{
				return "yaestaperonosemodifico";
			}
		}
		else{
				exportacion.agregarExportacion(false, obj);
		}
		return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
				+ " onclick=\"con('"
				+ obj.getExportacion_id()
				+ "', '"
				+ obj.getCliente() 
				+ "', $(this)"
				+ ")\"><i class='fa fa-edit'></i></a> <a class='btn btn-danger btn-circle' onclick='borrar("
				+ obj.getExportacion_id()
				+ ", $(this))'><i class='fa fa-trash-o'></i></a><span class='responsiveExpander'></span>:::"
				+ obj.getCliente();
	}

	@RequestMapping(value = "cancelar", method = RequestMethod.POST)
	public @ResponseBody String cancelar(@RequestParam int exportacion_id,
			@RequestParam String descripcion, Map<String, Object> model) {
		if (exportacion_id > 0) {
			String cad = "";
			return "<span class='responsiveExpander'></span><a class='btn btn-success btn-circle btn-sx'"
					+ " onclick=\"con('"
					+ exportacion_id
					+ "', '"
					+ descripcion
					+ "', $(this)"
					+ ")\"><i class='fa fa-edit'></i></a>"
					+ " <a class='btn btn-danger btn-circle' onclick='borrar("
					+ exportacion_id
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
		exportacion.borrarExportacion(new Exportacion());
		return "";
	}

}
