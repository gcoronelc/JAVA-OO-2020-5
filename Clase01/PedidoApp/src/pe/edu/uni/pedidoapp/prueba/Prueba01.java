package pe.edu.uni.pedidoapp.prueba;

import pe.edu.uni.pedidoapp.service.PedidoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double importe, impuesto, total;
		// Datos
		importe = 1000.0;
		// Proceso
		PedidoService pedidoService = new PedidoService();
		impuesto = pedidoService.calcImpuesto(importe);
		total = pedidoService.calcTotal(importe);
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
	}
}
