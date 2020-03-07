package aprendiendojsf.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba06 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(56);
		lista.add(98);
		lista.add(23);
		lista.add(76);
		lista.add(19);
		
		// Ordenar la lista
		lista.sort((Integer o1, Integer o2) -> {
			if(o1.intValue() < o2.intValue()){
				return 1;
			} else {
				return -1;
			}
		});
		
		// Recorrido indexado
		for (int i = 0; i < lista.size(); i++) {
			int dato = lista.get(i);
			System.out.println("lista(" + i + "): " + dato);
		}
	}

}
