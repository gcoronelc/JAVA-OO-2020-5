package pe.uni.comprobanteapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class CompFactory {

	// Tipos de Comprobantes
	public static final String TIPO_FACTURA = "FACTURA";
	public static final String TIPO_BOLETA = "BOLETA";
	
	
	private CompFactory() {
	}

	public static String[] getTipos(){
		String[] tipos = {TIPO_FACTURA, TIPO_BOLETA};
		return tipos;
	}
	
	public static CompAbstract getComp(String tipo){
		CompAbstract comp = null;
		switch(tipo){
			case TIPO_FACTURA:
				comp =  new FacturaService();
				break;
			case TIPO_BOLETA:
				comp =  new BoletaService();
				break;
		}
		return comp;
	}
	
}
