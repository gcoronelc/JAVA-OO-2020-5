package aprendiendojava.service;

public class Clase4 extends Clase2{
	
	public String nombre;
	public String canal;

	public Clase4() {
		this.nombre = "Montalvan";
		this.canal = "En construcción";
	}

	public String getNombrePadre() {
		return super.nombre;
	}

	public String getCanalPAdre() {
		return super.canal;
	}
	
}
