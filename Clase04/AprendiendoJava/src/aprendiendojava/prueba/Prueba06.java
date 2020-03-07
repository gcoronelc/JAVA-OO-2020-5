package aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba06 {

	public static void main(String[] args) {
		// Declarando un arreglo
		int[] notas;
		// Creación del arreglo
		notas = new int[5];
		// Mostrar los datos del arreglo
		// Recorrido indexado
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println("notas[" + i + "]: " + nota);
		}
		
	}

}
