package aprendiendojava.prueba;

import aprendiendojava.service.Clase4;

public class Prueba02 {

	public static void main(String[] args) {
		Clase4 obj = new Clase4();
		System.out.println("Nombre: " + obj.nombre);
		System.out.println("Canal: " + obj.canal);
		System.out.println("Nombre padre: " + obj.getNombrePadre());
		System.out.println("Canal padre: " + obj.getCanalPAdre());
	}
}
