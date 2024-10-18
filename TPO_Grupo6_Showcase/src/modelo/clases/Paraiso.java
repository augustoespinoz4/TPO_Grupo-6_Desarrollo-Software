package modelo.clases;

public class Paraiso extends Asiento{
	
	private double porcentajeExtra = 1.50;
	
	public Paraiso() {}

	@Override
	public double obtenerCosto() {
		return calcularExtra();
	}
	
	private double calcularExtra() {
		double extra = this.precioBase + (this.precioBase * porcentajeExtra);
		return extra;
	}
}
