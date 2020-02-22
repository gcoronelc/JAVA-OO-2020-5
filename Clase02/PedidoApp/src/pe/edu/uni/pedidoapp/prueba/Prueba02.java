package pe.edu.uni.pedidoapp.prueba;

import pe.edu.uni.pedidoapp.validar.Validar;

public class Prueba02 {
	
	public static void main(String[] args) {
		// Variable
		String dato;
		boolean estado;
		// Datos
		dato = "4567.8";
		// Proceso
		estado = Validar.isDouble(dato);
		// Reporte
		System.out.println("Es Double: " + estado);
	}
}
