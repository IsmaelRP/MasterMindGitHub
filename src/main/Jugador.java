package main;

import java.util.ArrayList;

public abstract class Jugador {

	Combinacion combSecreta;
	Combinacion combRespuesta;
	Modos modo;
	int intentos;
	
	Jugador(Modos modo){
		if (modo == Modos.FACIL) {
			intentos = 10;
			this.modo = modo;
		}else if (modo == Modos.MEDIO) {
			intentos = 15;
			this.modo = modo;
		}else {
			intentos = 0;
			this.modo = modo;
		}
	}

	boolean comprobarCombinacion(Combinacion contrincante) {
		boolean igual = true;

		for (int i = 0; i < modo.casillas; i++) {
			if (!combSecreta.combinacion[i].color.equals(contrincante.combinacion[i].color)) {
				igual = false;
			}
		}
		//	LLAMAR AQUI AL METODO "PISTA" DE MÁQUINA
		return igual;
	}
	
	abstract Combinacion generarCombinacion();
	abstract void dibujarCombinacionSecreta();
	
	
	@SuppressWarnings({"unchecked", "rawtypes" })
	Combinacion generarPista(Jugador contrincante) {
		
		Casilla[] pintado = new Casilla[modo.casillas];
		int i =0,negro = 0,rojo = 0,blanco = 0;
		Casilla[] respuesta = new Casilla[modo.casillas];
		ArrayList<String> lista = new ArrayList();
		Combinacion comb = new Combinacion(modo);
		
		//	INTENTO DE AÑADIR UN ARRAY DE STRING 1 POR 1 A UNA LISTA
		for (i=0;i<contrincante.combRespuesta.combinacion.length;i++) {
			lista.add(contrincante.combRespuesta.combinacion[i].color);
		}
		
		//	INTENTO DE AÑADIR UN ARRAY ENTERO A UNA LISTA
		//lista.addAll(new ArrayList<String>(Arrays.asList(contrincante.combSecreta.combinacion)));
		
		for (i=0;i<modo.casillas;i++) {
			if (contrincante.combRespuesta.combinacion[i].equals(this.combSecreta.combinacion[i])) {
				negro ++;
			}else if (lista.contains(this.combSecreta.combinacion[i].color)) {
				rojo ++;
			}else {
				blanco ++;
			}
		}
		rojo += negro;
		blanco += rojo;
		
		for (i=0;i<negro;i++) {
			respuesta[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		}
		for (;i<rojo;i++) {
			respuesta[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		}
		for (;i<blanco;i++) {
			respuesta[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		}
		
		
		for (i=0;i<modo.casillas;i++) {
			pintado[i] = respuesta[i];
		}
		comb.combinacion = pintado;
		return comb;
	}

}
