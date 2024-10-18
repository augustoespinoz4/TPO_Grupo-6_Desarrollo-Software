package modelo.clases;

public class Cazuela extends Asiento{
	
	private double porcentajeExtra = 1;
	
	public Cazuela() {}

	@Override
	public double obtenerCosto() {
		return calcularExtra();
	}
	
	private double calcularExtra() {
		double extra = this.precioBase + (this.precioBase * porcentajeExtra);
		return extra;
	}
}
