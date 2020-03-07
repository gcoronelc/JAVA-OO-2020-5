package aprendiendojava.service;

public class Clase1 {
	
	public String nombre;
	public String canal;

	public Clase1() {
		nombre = "Gustavo Coronel";
		canal = "www.youtube.com/c/DesarrollaSoftware";
		System.out.println("Hola amigos desde Clase1.");
	}
	
	public Clase1(String nombre) {
		System.out.println("Hola " + nombre + " desde Clase1.");
	}
	
	
	public double calcVenta(double precio, int cantidad){
		double venta;
		venta = precio * cantidad;
		return venta;
	}
	
}
