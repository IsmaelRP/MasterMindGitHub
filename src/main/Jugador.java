package main;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Jugador {

	Combinacion combSecreta;
	Combinacion combRespuesta;
	Modos modo;
	int intentos;

	Jugador(Modos modo) {
		if (modo == Modos.FACIL) {
			intentos = 10;
			this.modo = modo;
		} else if (modo == Modos.MEDIO) {
			intentos = 15;
			this.modo = modo;
		} else {
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
		// LLAMAR AQUI AL METODO "PISTA" DE MÁQUINA
		return igual;
	}

	abstract Combinacion generarCombinacion();

	abstract void dibujarCombinacionSecreta();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	Combinacion generarPista(Jugador contrincante) {

		int i = 0, negro = 0, rojo = 0;
		ArrayList<Casilla> lista1 = new ArrayList();
		ArrayList<Casilla> lista2 = new ArrayList();
		Combinacion comb = new Combinacion(modo);
		HashMap<Casilla, Integer> mapa = new HashMap<>();

		for (i = 0; i < modo.casillas; i++) {
			if (contrincante.combRespuesta.combinacion[i].equals(combSecreta.combinacion[i])) {
				negro++;
			} else {
				lista1.add(combSecreta.combinacion[i]);
				lista2.add(contrincante.combRespuesta.combinacion[i]);
			}
		}

		i = 0;
		while (i < lista1.size()) {
			if (mapa.containsKey(lista1.get(i))) {
				mapa.put(lista1.get(i), mapa.get(lista1.get(i)).intValue() + 1);
			} else {
				mapa.put(lista1.get(i), 1);
			}
			i++;
		}

		i = 0;
		while (i < lista2.size()) {
			if (mapa.containsKey(lista2.get(i))) {
				if (mapa.get(lista2.get(i)).intValue() == 0) {
					mapa.remove(lista2.get(i));
				} else {
					rojo++;
					mapa.put(lista2.get(i), mapa.get(lista2.get(i)).intValue() - 1);
				}
			} 
			i++;
		}

		
		i = 0;
		while (i<modo.casillas) {
			
			if (negro > 0) {
				comb.combinacion[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
				negro --;
			}else if (rojo > 0) {
				comb.combinacion[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
				rojo --;
			}else {
				comb.combinacion[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
			}
			
			i++;
		}
		
		return comb;
	}

}
