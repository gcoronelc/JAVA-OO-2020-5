package pe.uni.comprobanteapp.service;

import pe.uni.comprobanteapp.model.ConceptoModel;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class FacturaService extends CompAbstract{

	@Override
	public ConceptoModel[] proceso(double total) {
		// Variables
		double consumo, impuesto, servicio, totalGeneral;
		// Proceso
		consumo = total / 1.18;
		impuesto = total - consumo;
		servicio = total * 0.10;
		totalGeneral = total + servicio;
		// Reporte
		ConceptoModel[] repo = {
			new ConceptoModel("Consumo", round(consumo)),
			new ConceptoModel("Impuesto", round(impuesto)),
			new ConceptoModel("Total", round(total)),
			new ConceptoModel("Servicio", round(servicio)),
			new ConceptoModel("Total General", round(totalGeneral))
		};
		return repo;
	}

}
