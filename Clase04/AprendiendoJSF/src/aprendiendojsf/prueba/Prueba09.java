package aprendiendojsf.prueba;

import aprendiendojsf.model.ProductoModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://gcoronelc.blogspot.com/
 * @youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba09 {

	public static void main(String[] args) {
		
		List<ProductoModel> lista = new ArrayList<>();
		
		lista.add(new ProductoModel("PERA", 4.5, 100));
		lista.add(new ProductoModel("PIÑA", 6.6, 70));
		lista.add(new ProductoModel("UVA", 5.3, 20));
		lista.add(new ProductoModel("SANDIA", 2.3, 60));
		lista.add(new ProductoModel("MELON", 3.1, 39));
		lista.add(new ProductoModel("TUNA", 3.8, 81));
		
		// Ordenar la lista
		lista.sort((ProductoModel o1,ProductoModel o2) -> {
			if(o1.getPrecio() < o2.getPrecio()){
				return 1;
			} else {
				return -1;
			}
		});
		
		// Recorrido indexado
		for (int i = 0; i < lista.size(); i++) {
			ProductoModel bean = lista.get(i);
			System.out.println(bean);
		}
	}

}
