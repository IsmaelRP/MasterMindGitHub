package main;

import java.util.Arrays;

public class Combinacion {
	
	private Casilla combinacion[];
	
	protected Combinacion(Modos modo){
		combinacion = new Casilla[modo.getCasillas()];
	}
	
	protected Casilla[] getCombinacion() {
		return combinacion;
	}
	
	protected void setCombinacion(Casilla combinacion[]) {
		this.combinacion = combinacion;
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(combinacion);
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		if (obj instanceof Combinacion && Arrays.equals(combinacion, ((Combinacion) obj).combinacion)) {
			igual = true;
		}
		return igual;
	}
	
	
	
}
