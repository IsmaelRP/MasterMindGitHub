package main;

import java.util.Arrays;

public class Combinacion {
	
	Casilla combinacion[];
	
	Combinacion(Modos modo){
		combinacion = new Casilla[modo.casillas];
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
