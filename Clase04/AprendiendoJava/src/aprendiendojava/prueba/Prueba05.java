package aprendiendojava.prueba;

import aprendiendojava.service.Clase1;
import aprendiendojava.service.Clase2;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba05 {

	public static void main(String[] args) {
		
		Clase1 obj1 = new Clase2();
		Object obj2 = obj1; // UpCasting
		Clase2 obj3 = (Clase2) obj1; // DownCasting
		
	}
}
