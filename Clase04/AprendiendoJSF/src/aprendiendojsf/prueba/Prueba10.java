package aprendiendojsf.prueba;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba10 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(56);
		set1.add(30);
		set1.add(80);
		set1.add(18);
		set1.add(41);
		set1.add(30);
		
		for (Integer dato : set1) {
			System.out.println(dato);
		}
		
	}
}
