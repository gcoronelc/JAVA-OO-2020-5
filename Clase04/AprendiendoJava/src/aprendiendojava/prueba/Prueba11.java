package aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba11 {

	public static void main(String[] args) {
		String[] datos = new String[5];
		
		datos[1] = "Gustavo";
		datos[2] = "Coronel";
		
		for (int i = 0; i < datos.length; i++) {
			String dato = datos[i];
			System.out.println(dato);
		}
	}

}
