package pe.edu.uni.pedidoapp.service;

public class PedidoService {

	public double calcImpuesto(double importe) {
		// Validar
		if (importe <= 0) {
			return -1;
		}
		// Variables
		double impuesto;
		// Proceso
		impuesto = importe * 0.18;
		// Reporte
		return impuesto;
	} // Fin de calcImpuesto

	public double calcTotal(double importe) {
		// Validar
		if (importe <= 0) {
			return -1;
		}
		// Variables
		double total;
		// Proceso
		total = importe + calcImpuesto(importe);
		// Reporte
		return total;
	} // Fin de calcTotal

}
