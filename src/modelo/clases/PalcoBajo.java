package modelo.clases;

public class PalcoBajo extends Asiento{
	
	private double porcentajeExtra = 0.75;
	
	public PalcoBajo() {}

	@Override
	public double obtenerCosto() {
		return calcularExtra();
	}
	
	private double calcularExtra() {
		double extra = this.precioBase + (this.precioBase * porcentajeExtra);
		return extra;
	}
}
