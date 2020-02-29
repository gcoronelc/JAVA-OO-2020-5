package aprendiendojava.prueba;

import aprendiendojava.service.Clase3;

public class Prueba01 {

	public static void main(String[] args) {
		// Datos
		double precio = 100;
		int cantidad = 20;
		// Proceso
		Clase3 obj =new Clase3();
		double venta = obj.calcVenta(precio, cantidad);
		// Reporte
		System.out.println("Venta: " + venta);
	}
	
}
