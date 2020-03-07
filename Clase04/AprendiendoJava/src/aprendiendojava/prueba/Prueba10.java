package aprendiendojava.prueba;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba10 {

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
		Arrays.sort(datos);
		minimo = datos[0];
		maximo = datos[9];
		// Mostrar el arreglo
		for (int i = 0; i < datos.length; i++) {
			int dato = datos[i];
			System.out.println("datos[" + i + "]: " + dato);
		}
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);
	}

}
