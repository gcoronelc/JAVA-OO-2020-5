package pe.uni.comprobanteapp.prueba;

import pe.uni.comprobanteapp.model.ConceptoModel;
import pe.uni.comprobanteapp.service.BoletaService;
import pe.uni.comprobanteapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Dato
		double total = 3456.76;
		// Proceso
		BoletaService service = new BoletaService();
		ConceptoModel[] repo = service.proceso(total);
		// Reporte
		for (ConceptoModel bean : repo) {
			System.out.println(bean);
		}
	}
	
}
