
package es.com.serializar.prueba;

import com.google.gson.Gson;
import es.com.serializar.model.Model;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba {
    
    public static void main(String[] args) throws IOException {
        serialización();
    }

    //Crear objeto
    private static void serialización() throws IOException {
        Model obj = new Model();
        obj.setNombre("ERIC");
        obj.setAPaterno("CORONEL");
        obj.setAMaterno("CASTILLO");
        obj.setCantAlumnos(9);
        obj.setNota((float) 10.45);
        obj.setAprobado(false);
        
        Gson gson = new Gson(); 
         
        String json =gson.toJson(obj ); 
        //Resultado
        System.out.println(json);
        //}
        
    //Guardar en archivo  
             
        FileWriter file = new FileWriter("file2.json");
        file.write(json);
        file.flush();
        System.out.println("archivo creado");
        
        }
    
}
