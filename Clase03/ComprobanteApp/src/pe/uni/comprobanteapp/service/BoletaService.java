package pe.uni.comprobanteapp.service;

import pe.uni.comprobanteapp.model.ConceptoModel;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class BoletaService extends CompAbstract {

	@Override
	public ConceptoModel[] proceso(double total) {
		// Variables
		double servicio, totalGeneral;
		// Proceso
		servicio = total * 0.10;
		totalGeneral = total + servicio;
		// Reporte
		ConceptoModel[] repo = {
			new ConceptoModel("Total", round(total)),
			new ConceptoModel("Servicio", round(servicio)),
			new ConceptoModel("Total General", round(totalGeneral))
		};
		return repo;
	}

}
