package main;

public class Casilla {
	private String color;
	
	protected Casilla(String color){
		this.color = color;
	}
	
	protected String getColor(){
		return color;
	}
	
	protected void setColor(String color){
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
