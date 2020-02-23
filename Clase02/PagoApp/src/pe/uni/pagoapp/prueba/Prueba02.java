package pe.uni.pagoapp.prueba;

import pe.uni.pagoapp.model.PagoModel;
import pe.uni.pagoapp.service.PagoService;

public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		PagoModel model;
		// Datos
		model = new PagoModel(5, 25, 125);
		// Proceso
		PagoService service = new PagoService();
		model = service.procesar(model);
		// Reporte
		System.out.println("Ingresos: " + model.getIngresos());
		System.out.println("Renta: " + model.getRenta());
		System.out.println("Neto: " + model.getNeto());
	}
}
