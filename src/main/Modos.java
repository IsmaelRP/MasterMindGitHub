package main;

public enum Modos {
	
	FACIL (4, 8, false), MEDIO (5, 8, false), DIFICIL (8, 10, true), INSTRUCCIONES(0,0,false);
	
	int casillas;
	int colores;
	boolean repeticion_colores;
	
	Modos(int casillas, int colores, boolean repeticion){
		this.casillas = casillas;
		this.colores = colores;
		repeticion_colores = repeticion;
	}

}
