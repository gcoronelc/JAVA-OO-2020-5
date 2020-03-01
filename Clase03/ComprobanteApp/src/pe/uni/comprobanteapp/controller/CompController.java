package pe.uni.comprobanteapp.controller;

import pe.uni.comprobanteapp.model.ConceptoModel;
import pe.uni.comprobanteapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class CompController {

	public String[] traerTipos(){
		return CompFactory.getTipos();
	}

	public ConceptoModel[] procesar(String tipo, double total) {
		return CompFactory.getComp(tipo).procesar(total);
	}
	
	
}
