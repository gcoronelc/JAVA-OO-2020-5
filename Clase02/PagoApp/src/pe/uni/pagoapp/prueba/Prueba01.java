package pe.uni.pagoapp.prueba;

import pe.uni.pagoapp.model.PagoModel;
import pe.uni.pagoapp.service.PagoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		PagoModel model = new PagoModel();
		// Datos
		model.setHorasDia(6);
		model.setDias(20);
		model.setPagoHora(120.0);
		// Proceso
		PagoService service = new PagoService();
		model = service.procesar(model);
		// Reporte
		System.out.println("Ingresos: " + model.getIngresos());
		System.out.println("Renta: " + model.getRenta());
		System.out.println("Neto: " + model.getNeto());
	}
}
