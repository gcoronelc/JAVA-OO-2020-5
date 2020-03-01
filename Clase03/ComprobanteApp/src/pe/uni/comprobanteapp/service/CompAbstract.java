package pe.uni.comprobanteapp.service;

import pe.uni.comprobanteapp.model.ConceptoModel;

public abstract class CompAbstract {
	
	public abstract ConceptoModel[] procesar( double total);
	
	
	protected double round( double valor ){
		valor = valor * 100;
		valor = Math.round(valor);
		valor = valor / 100;
		return valor;
	}
}
