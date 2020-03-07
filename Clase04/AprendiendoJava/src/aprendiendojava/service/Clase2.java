package aprendiendojava.service;

public class Clase2 extends Clase1{

	public Clase2() {
		//super("Gustavo");
	}
	
	

	@Override
	public double calcVenta(double precio, int cantidad) {
		double venta;
		venta = super.calcVenta(precio, cantidad);
		if(cantidad > 12){
			venta = venta * 0.90;
		}
		return venta;
	}
	
	public double sumar(double n1, double n2){
		return (n1 + n2);
	}
}
