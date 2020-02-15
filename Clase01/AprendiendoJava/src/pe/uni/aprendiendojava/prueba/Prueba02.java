package pe.uni.aprendiendojava.prueba;

import java.util.Scanner;
import pe.uni.aprendiendojava.service.MateService;

public class Prueba02 {

	public static void main(String[] args) {
		// Varibles
		int n1, n2, mayor;
		Scanner scanner = new Scanner(System.in);
		// Datos
		System.out.print("Número 1: ");
		n1 = scanner.nextInt();
		System.out.print("Número 2: ");
		n2 = scanner.nextInt();
		// Proceso
		MateService mateService = new MateService();
		mayor = mateService.mayor(n1, n2);
		// Reporte
		System.out.println("Mayor: " + mayor);
	}
}
