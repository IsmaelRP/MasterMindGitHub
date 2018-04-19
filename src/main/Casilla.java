package main;

public class Casilla {
	String color;
	
	Casilla(String color){
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		if (obj instanceof Casilla && color.equals(((Casilla) obj).color)) {
			igual = true;
		}
		return igual;
	}
	
}
