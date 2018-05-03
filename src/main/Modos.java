package main;

public enum Modos {
	
	FACIL (4, 8), MEDIO (5, 8), DIFICIL (8, 10), INSTRUCCIONES(0,0);
	
	private int casillas;
	private int colores;
	
	protected int getCasillas(){
		return casillas;
	}
	
	protected int getColores(){
		return colores;
	}
	
	Modos(int casillas, int colores){
		this.casillas = casillas;
		this.colores = colores;
	}

}
