package pe.edu.uni.pedidoapp.validar;

public class Validar {
	
	public static boolean isDouble(String valor){
		// Variables
		boolean rpta;
		double  dato;
		// Proceso
		try {
			dato = Double.parseDouble(valor);
			rpta = true;
		} catch (Exception e) {
			rpta = false;
		}
		// Reporte
		return rpta;
	}
	
}
