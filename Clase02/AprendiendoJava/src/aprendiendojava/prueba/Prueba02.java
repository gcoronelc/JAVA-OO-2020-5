package aprendiendojava.prueba;

import aprendiendojava.model.ProductoModel;

public class Prueba02 {
	
	public static void main(String[] args) {
		
		ProductoModel model = new ProductoModel();
		
		System.out.println("Nombre: " + model.getNombre());
		System.out.println("Precio: " + model.getPrecio());
		System.out.println("Stock: " + model.getStock());
		System.out.println("Activo: " + model.isActivo());
		
	}
}
