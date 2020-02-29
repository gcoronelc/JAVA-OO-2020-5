package aprendiendojava.prueba;

import aprendiendojava.service.Clase1;
import aprendiendojava.service.Clase2;
import aprendiendojava.service.Clase3;
import aprendiendojava.service.Clase4;

public class Prueba03 {

	public static void main(String[] args) {
		
		Clase1 obj = new Clase2();
		
		String s1 = (obj instanceof Object?"SI":"NO");
		String s2 = (obj instanceof Clase1?"SI":"NO");
		String s3 = (obj instanceof Clase2?"SI":"NO");
		String s4 = (obj instanceof Clase3?"SI":"NO");
		String s5 = (obj instanceof Clase4?"SI":"NO");
		
		System.out.println("Compatible con Object: " + s1);
		System.out.println("Compatible con Clase1: " + s2);
		System.out.println("Compatible con Clase2: " + s3);
		System.out.println("Compatible con Clase3: " + s4);
		System.out.println("Compatible con Clase4: " + s5);
	
	}
	
}
