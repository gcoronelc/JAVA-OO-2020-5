
package es.com.deserializar.prueba;

import com.google.gson.Gson;
import es.com.deserializar.model.Model;

public class Prueba {
    
    public static void main(String[] args) {
        deserealizador();
        }

    private static void deserealizador() {
        String json ="{'Nombre':'Charles', 'APaterno':'Xavier' ,'CantAlumnos':40,'Nota':20,'Aprobado':True}";
    
        Gson gson = new Gson();
       
        Model c2 = gson.fromJson(json,Model.class);
    
        System.out.println(c2);
        System.out.println(c2.getNombre()+ " " + c2.getAPaterno() + " " + c2.getAMaterno());
        }
    
}
