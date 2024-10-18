package modelo.clases;

import java.util.List;

public class Sala {
	private int idSala;
	private int[] maxAsientos;
	private List<Asiento> asientos;
	
	public Sala(int idSala, int[] maxAsientos, List<Asiento> asientos) {
		this.idSala = idSala;
		this.maxAsientos = maxAsientos;
		this.asientos = asientos;
	}
	
	public int[] getMaxAsientos() {
		return maxAsientos;
	}

	public void setMaxAsientos(int[] maxAsientos) {
		this.maxAsientos = maxAsientos;
	}

	public List<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<Asiento> asientos) {
		this.asientos = asientos;
	}
}
