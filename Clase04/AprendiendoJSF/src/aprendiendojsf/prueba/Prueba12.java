package aprendiendojsf.prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 * @blog   http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba12 {

	public static void main(String[] args) {
		Map<String,Object> rec = new HashMap<>();
		
		rec.put("Nombre", "Sandia");
		rec.put("Precio", 2.45);
		rec.put("Stock",1000);
		rec.put("Nombre","Papaya");
		
		Set<String> keys = rec.keySet();
		keys.stream().forEach((key) -> {
			System.out.println(key + " => " + rec.get(key).toString());
		});
		
	}
	
}
