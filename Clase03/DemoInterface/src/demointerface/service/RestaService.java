package demointerface.service;

import demointerface.specification.IMate;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class RestaService implements IMate{

	@Override
	public int procesar(int n1, int n2) {
		return (n1 - n2);
	}

}
