
package edutec.validar;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EduValidar {
    private static  String APP = "EDUTEC";
    private static String TITULO_MSG_ERROR = "SE ENCONTRARON ERRORES";
    
    private EduValidar() {}
    
    public static void mostrarError(Component component, Object message) {
        JOptionPane.showMessageDialog(component, message,TITULO_MSG_ERROR,JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean valIntPositivo(JTextField campo) {
        campo.setBackground(Color.PINK);
        String dato = campo.getText();
        if (isInt(dato) == false) {
            return false;
        }
        int val = Integer.parseInt(dato);
        if (val < 0) {
            return false;
        }
        campo.setBackground(Color.WHITE);
        return true;
    }
    
    public static boolean isInt(String val) {
        boolean rpta;
        int dato;
        try {
            dato = Integer.parseInt(val);
            rpta = true;
        } catch (Exception e) {
            rpta = false;
        }
        return rpta;
    }
}
