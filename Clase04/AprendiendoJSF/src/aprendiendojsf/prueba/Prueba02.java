package aprendiendojsf.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(56);
		lista.add(98);
		lista.add(23);
		lista.add(76);
		lista.add(19);
		
		// Recorrido indexado
		for (Integer dato : lista) {
			System.out.println(dato);
		}
		
	}

}
