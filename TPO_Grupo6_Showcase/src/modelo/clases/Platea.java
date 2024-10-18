package modelo.clases;

public class Platea extends Asiento{
	
	private double porcentajeExtra = 0.25;
	
	public Platea() {}

	@Override
	public double obtenerCosto() {
		return calcularExtra();
	}
	
	private double calcularExtra() {
		double extra = this.precioBase + (this.precioBase * porcentajeExtra);
		return extra;
	}
}
