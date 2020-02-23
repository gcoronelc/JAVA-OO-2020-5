package pe.uni.pagoapp.validar;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validar {
	
	// Constantes
	private static String APP = "Pago App";
	private static String TITULO_MSG_ERROR = "ERROR EN PROCESO";

	/**
	 * Constructor privado para que no sea posible instabciar la clase.
	 */
	private Validar() {
	}
	
	public static void showError(Component component, Object message){
		JOptionPane.showMessageDialog(component, message,
							TITULO_MSG_ERROR,JOptionPane.ERROR_MESSAGE);
	}
	
	public static  boolean validarIntPositivo(JTextField campo){
		// Previas
		campo.setBackground(Color.PINK);
		// Proceso
		String dato = campo.getText();
		if(isInt(dato) == false){
			return false;
		}
		int valor = Integer.parseInt(dato);
		if(valor <= 0){
			return false;
		}
		campo.setBackground(Color.WHITE);
		return true;
	}
	
	public static  boolean validarDoublePositivo(JTextField campo){
		// Previas
		campo.setBackground(Color.PINK);
		// Proceso
		String dato = campo.getText();
		if(isDouble(dato) == false){
			return false;
		}
		double valor = Double.parseDouble(dato);
		if(valor <= 0){
			return false;
		}
		campo.setBackground(Color.WHITE);
		return true;
	}
	
	public static boolean isDouble(String valor){
		// Variables
		boolean rpta;
		double  dato;
		// Proceso
		try {
			dato = Double.parseDouble(valor);
			rpta = true;
		} catch (Exception e) {
			rpta = false;
		}
		// Reporte
		return rpta;
	}
	
	public static boolean isInt(String valor){
		// Variables
		boolean rpta;
		int  dato;
		// Proceso
		try {
			dato = Integer.parseInt(valor);
			rpta = true;
		} catch (Exception e) {
			rpta = false;
		}
		// Reporte
		return rpta;
	}
	
}
