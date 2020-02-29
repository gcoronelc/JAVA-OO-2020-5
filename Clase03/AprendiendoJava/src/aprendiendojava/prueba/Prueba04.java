package aprendiendojava.prueba;

import aprendiendojava.service.Clase1;
import aprendiendojava.service.Clase2;

public class Prueba04 {

	public static void main(String[] args) {
		Clase1 obj = new Clase2();
		
		System.out.println("Venta: " + obj.calcVenta(100, 10));
		//System.out.println("Suma: " + obj.sumar(10, 20));
	}
		
}
