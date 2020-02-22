package aprendiendojava.prueba;

import aprendiendojava.model.ProductoModel;

public class Prueba01 {
	
	public static void main(String[] args) {
		
		ProductoModel model = new ProductoModel();
		
		model.setNombre("Coca Cola");
		model.setPrecio(4.0);
		model.setStock(1000);
		model.setActivo(true);
		
		System.out.println("Nombre: " + model.getNombre());
		System.out.println("Precio: " + model.getPrecio());
		System.out.println("Stock: " + model.getStock());
		System.out.println("Activo: " + model.isActivo());
		
	}
}
