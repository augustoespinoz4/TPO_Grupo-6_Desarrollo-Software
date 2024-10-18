package modelo.clases;

public class PalcoAlto extends Asiento{
	
	private double porcentajeExtra = 0.50;
	
	public PalcoAlto() {}

	@Override
	public double obtenerCosto() {
		return calcularExtra();
	}
	
	private double calcularExtra() {
		double extra = this.precioBase + (this.precioBase * porcentajeExtra);
		return extra;
	}
}
