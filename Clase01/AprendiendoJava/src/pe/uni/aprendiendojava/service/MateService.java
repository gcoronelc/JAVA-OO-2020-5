package pe.uni.aprendiendojava.service;

public class MateService {

	/**
	 * Determina el mayor de dos números.
	 * @param n1 Número 1.
	 * @param n2 Número 2.
	 * @return Retorna el mayor de n1 y n2.
	 */
	public int mayor(int n1, int n2){
		int m;
		if(n1 > n2){
			m = n1;
		} else {
			m = n2;
		}
		return m;
	}
	
	public int mayor(int n1, int n2, int n3, int n4, int n5){
		int m;
		m = n1; // Punto de partida
		if(n2 > m){
			m = n2;
		}
		if(n3 > m){
			m = n3;
		}
		if(n4 > m){
			m = n4;
		}
		if(n5 > m){
			m = n5;
		}
		return m;
	}
}
