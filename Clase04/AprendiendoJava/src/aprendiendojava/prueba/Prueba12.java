package aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba12 {

	public static void main(String[] args) {
		int[][] mat = new int[4][5];
		mat[2][3] = 20;
		mat[3][2] = 15;
		for (int i = 0; i < mat.length; i++) {
			int[] fila = mat[i];
			String rowData = "";
			for (int j = 0; j < fila.length; j++) {
				int valor = fila[j];
				rowData += valor + "\t";
			}
			System.out.println(rowData);
		}
	}

}
