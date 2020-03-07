package aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba13 {

	public static void main(String[] args) {
		int[][] mat = {
			{56,43,12},
			{13,98,35},
			{87,36,71}
		};
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
