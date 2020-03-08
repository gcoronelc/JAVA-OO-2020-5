
package edutec.controller;

import edutec.model.EduModel;

public class EduController {
    public EduModel procesar(EduModel model) {
        // Variable
        int suma;
//        double promedio;
        // Obtener Divisor
//        double div;
//        div = obtenerDivisor();
        // Proceso
        suma = model.getNum1() + model.getNum2() + model.getNum3() + model.getNum4() + model.getNum5();
//        promedio = suma / 5;
        // Reporte
        model.setSuma(suma);
//        model.setPromedio(promedio);
        return model;
    }
    
    public static int promedio(int num1, int num2, int num3, int num4, int num5) {
        int pro = 0;
        if (num1 > 0) {
            pro ++;
        }
        if (num2 > 0) {
            pro ++;
        }
        if (num3 > 0) {
            pro ++;
        }
        if (num4 > 0) {
            pro ++;
        }
        if (num5 > 0) {
            pro ++;
        }
        return pro;
    }
}
