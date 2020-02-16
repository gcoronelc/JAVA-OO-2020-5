package pe.uni.aprendiendojava.prueba;

import java.util.Scanner;
import pe.uni.aprendiendojava.service.MateService;

public class Prueba03 {

	public static void main(String[] args) {
		// Varibles
		int n1, n2, n3, n4, n5, mayor;
		Scanner scanner = new Scanner(System.in);
		// Datos
		n1 = 13;
		n2 = 27;
		n3 = 20;
		n4 = 21;
		n5 = 15;
		// Proceso
		MateService mateService = new MateService();
		mayor = mateService.mayor(n1, n2, n3, n4, n5);
		// Reporte
		System.out.println("Mayor: " + mayor);
	}
}
