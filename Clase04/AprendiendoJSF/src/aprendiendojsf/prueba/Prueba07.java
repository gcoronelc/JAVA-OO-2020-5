package aprendiendojsf.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba07 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Gustavo");
		lista.add("Claudia");
		lista.add("Karla");
		lista.add("Pedro");
		lista.add("Laura");
		
		// Ordenar la lista
		lista.sort((String o1, String o2) -> {
			return o1.compareTo(o2);
		});
		
		// Recorrido indexado
		for (int i = 0; i < lista.size(); i++) {
			String dato = lista.get(i);
			System.out.println("lista(" + i + "): " + dato);
		}
	}

}
