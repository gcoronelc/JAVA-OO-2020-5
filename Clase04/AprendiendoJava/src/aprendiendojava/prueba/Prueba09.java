package aprendiendojava.prueba;

import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba09 {

	public static void main(String[] args) {
		// Declarar el arreglo
		int[] datos = new int[10];
		// Poblar el arreglo
		Random random = new Random();
		for (int i = 0; i < datos.length; i++) {
			datos[i] = random.nextInt(100);
		}
		// Encontrar el maximo y el minimo
		int maximo, minimo;
		maximo = datos[0];
		minimo = datos[0];
		for (int i = 1; i < datos.length; i++) {
			int dato = datos[i];
			// Maximo
			if(dato > maximo ){
				maximo = dato;
			}
			// Minimo
			if(dato < minimo ){
				minimo = dato;
			}
		}
		// Mostrar el arreglo
		for (int i = 0; i < datos.length; i++) {
			int dato = datos[i];
			System.out.println("datos[" + i + "]: " + dato);
		}
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);
	}

}
