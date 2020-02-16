/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.aprendiendojava.prueba;


import java.util.Scanner;

import pe.uni.aprendiendojava.Service.MateService;


public class Prueba03 {
    private static Object mateService2;
  public static void main(String[] args) {
		// Varibles
		int n1, n2,n3, mayor;
		Scanner scanner = new Scanner(System.in);
		// Datos
		System.out.print("Número 1: ");
		n1 = scanner.nextInt();
		System.out.print("Número 2: ");
		n2 = scanner.nextInt();
                System.out.print("Número 3: ");
		n3 = scanner.nextInt();
		// Proceso
		MateService mateService = new MateService();
		mayor = mateService.mayor(n1, n2,n3);
		// Reporte
		System.out.println("Mayor: " + mayor);
	}
                
	
}
