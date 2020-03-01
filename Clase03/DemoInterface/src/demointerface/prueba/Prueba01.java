package demointerface.prueba;

import demointerface.service.RestaService;
import demointerface.service.SumaService;
import demointerface.specification.IMate;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		IMate sumaService = new SumaService();
		IMate restaService = new RestaService();
		
		IMate prodService = new IMate() {

			@Override
			public int procesar(int n1, int n2) {
					return (n1 * n2);
			}
		};
		
		System.out.println("8 + 5 = " + sumaService.procesar(8, 5));
		System.out.println("8 - 5 = " + restaService.procesar(8, 5));
		System.out.println("8 * 5 = " + prodService.procesar(8, 5));
		
	}
	
}
