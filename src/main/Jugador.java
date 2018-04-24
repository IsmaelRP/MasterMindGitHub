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
		int colores[] = new int[modo.colores];
		
		
		for (i=0;i<contrincante.combRespuesta.combinacion.length;i++) {
			if (!lista.contains(contrincante.combRespuesta.combinacion[i].color)) {
				lista.add(contrincante.combRespuesta.combinacion[i].color);
			}else {
				if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
					colores[0] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.ROJO + "  " + Colores.RESET)) {
					colores[1] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.VERDE + "  " + Colores.RESET)) {
					colores[2] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
					colores[3] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.AZUL + "  " + Colores.RESET)) {
					colores[4] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.MORADO + "  " + Colores.RESET)) {
					colores[5] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.CELESTE + "  " + Colores.RESET)) {
					colores[6] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.BLANCO + "  " + Colores.RESET)) {
					colores[7] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
					colores[8] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.ROSA + "  " + Colores.RESET)) {
					colores[9] ++;
				}
			}
			
		}
		

		
		for (i=0;i<modo.casillas;i++) {
			if (contrincante.combRespuesta.combinacion[i].equals(combSecreta.combinacion[i])) {
				negro ++;
			}else if (lista.contains(combSecreta.combinacion[i].color)) {
				if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET) && colores[0] != 0) {
					rojo += colores[0] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.ROJO + "  " + Colores.RESET) && colores[1] != 0) {
					rojo += colores[1] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.VERDE + "  " + Colores.RESET) && colores[2] != 0) {
					rojo += colores[2] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.AMARILLO + "  " + Colores.RESET) && colores[3] != 0) {
					rojo += colores[3] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.AZUL + "  " + Colores.RESET) && colores[4] != 0) {
					rojo += colores[4] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.MORADO + "  " + Colores.RESET) && colores[5] != 0) {
					rojo += colores[5] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.CELESTE + "  " + Colores.RESET) && colores[6] != 0) {
					rojo += colores[6] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.BLANCO + "  " + Colores.RESET) && colores[7] != 0) {
					rojo += colores[7] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.VERDECLARO + "  " + Colores.RESET) && colores[8] != 0) {
					rojo += colores[8] +1;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.ROSA + "  " + Colores.RESET) && colores[9] != 0) {
					rojo += colores[9] +1;
				}else {
					rojo ++;
				}
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
