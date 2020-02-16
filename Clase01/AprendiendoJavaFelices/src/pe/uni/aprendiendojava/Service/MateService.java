package pe.uni.aprendiendojava.Service;

public class MateService {

	/**
	 * Determina el mayor de dos números.
	 *
	 * @param n1 Número 1.
	 * @param n2 Número 2.
	 * @return Retorna el mayor de n1 y n2.
	 */
	public int mayor(int n1, int n2) {
		int m;
		if (n1 > n2) {
			m = n1;
		} else {
			m = n2;
		}
		return m;
	}

	/**
	 * Determina el mayor de dos números.
	 *
	 * @param n1 Número 1.
	 * @param n2 Número 2.
	 * @param n3 Número 2.
	 * @return Retorna el mayor de n1 y n2.
	 */
	public int mayor(int n1, int n2, int n3) {
		int m;
		if (n1 > n2 && n1 > n3) {
			m = n1;
		} else if (n2 > n1 && n2 > n3) {
			m = n2;
		} else {
			m = n3;
		}
		return m;
	}
}
