package pe.uni.comprobanteapp.prueba;

import pe.uni.comprobanteapp.model.ConceptoModel;
import pe.uni.comprobanteapp.service.CompAbstract;
import pe.uni.comprobanteapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Dato
		double total = 3456.76;
		// Proceso
		CompAbstract service;
		service = CompFactory.getComp(CompFactory.TIPO_BOLETA);
		ConceptoModel[] repo = service.procesar(total);
		// Reporte
		for (ConceptoModel bean : repo) {
			System.out.println(bean);
		}
	}
	
}
