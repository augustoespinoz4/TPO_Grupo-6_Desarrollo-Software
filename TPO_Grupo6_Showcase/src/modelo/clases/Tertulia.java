package modelo.clases;

public class Tertulia extends Asiento{
	
	private double porcentajeExtra = 1.25;
	
	public Tertulia() {}

	@Override
	public double obtenerCosto() {
		return calcularExtra();
	}
	
	private double calcularExtra() {
		double extra = this.precioBase + (this.precioBase * porcentajeExtra);
		return extra;
	}
}
