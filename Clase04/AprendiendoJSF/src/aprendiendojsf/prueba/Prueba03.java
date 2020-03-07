package aprendiendojsf.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(56);
		lista.add(98);
		lista.add(23);
		lista.add(76);
		lista.add(19);
		
		// Recorrido indexado
		lista.stream().forEach((dato) -> {
			System.out.println(dato);
		});
		
	}

}
