package main;

import java.util.ArrayList;

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

		Casilla[] pintado = new Casilla[modo.casillas];
		int i = 0, negro = 0, rojo = 0;
		Casilla[] respuesta = new Casilla[modo.casillas];
		ArrayList<String> lista1 = new ArrayList();
		ArrayList<String> lista2 = new ArrayList();

		Combinacion comb = new Combinacion(modo);
		int colores1[] = new int[modo.colores];
		int colores2[] = new int[modo.colores];


		// for (i=0;i<modo.colores;i++) {
		// colores[i] ++;
		// }

		for (i = 0; i < contrincante.combRespuesta.combinacion.length; i++) {
			if (!lista1.contains(contrincante.combRespuesta.combinacion[i].color)) {
				lista1.add(contrincante.combRespuesta.combinacion[i].color);
				if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
					colores1[0] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.ROJO + "  " + Colores.RESET)) {
					colores1[1] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.VERDE + "  " + Colores.RESET)) {
					colores1[2] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
					colores1[3] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.AZUL + "  " + Colores.RESET)) {
					colores1[4] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.MORADO + "  " + Colores.RESET)) {
					colores1[5] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.CELESTE + "  " + Colores.RESET)) {
					colores1[6] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.BLANCO + "  " + Colores.RESET)) {
					colores1[7] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
					colores1[8] ++;
				}else if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.ROSA + "  " + Colores.RESET)) {
					colores1[9] ++;
				}
			} else {
				if (contrincante.combRespuesta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
					colores1[0]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.ROJO + "  " + Colores.RESET)) {
					colores1[1]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.VERDE + "  " + Colores.RESET)) {
					colores1[2]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
					colores1[3]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.AZUL + "  " + Colores.RESET)) {
					colores1[4]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.MORADO + "  " + Colores.RESET)) {
					colores1[5]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.CELESTE + "  " + Colores.RESET)) {
					colores1[6]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.BLANCO + "  " + Colores.RESET)) {
					colores1[7]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
					colores1[8]++;
				} else if (contrincante.combRespuesta.combinacion[i].color
						.equals(Colores.ROSA + "  " + Colores.RESET)) {
					colores1[9]++;
				}
			}

		}

		for (i = 0; i < combSecreta.combinacion.length; i++) {
			if (!lista2.contains(combSecreta.combinacion[i].color)) {
				lista2.add(combSecreta.combinacion[i].color);
				if (combSecreta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
					colores2[0] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.ROJO + "  " + Colores.RESET)) {
					colores2[1] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.VERDE + "  " + Colores.RESET)) {
					colores2[2] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
					colores2[3] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.AZUL + "  " + Colores.RESET)) {
					colores2[4] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.MORADO + "  " + Colores.RESET)) {
					colores2[5] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.CELESTE + "  " + Colores.RESET)) {
					colores2[6] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.BLANCO + "  " + Colores.RESET)) {
					colores2[7] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
					colores2[8] ++;
				}else if (combSecreta.combinacion[i].color.equals(Colores.ROSA + "  " + Colores.RESET)) {
					colores2[9] ++;
				}
			} else {
				if (combSecreta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
					colores2[0]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.ROJO + "  " + Colores.RESET)) {
					colores2[1]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.VERDE + "  " + Colores.RESET)) {
					colores2[2]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
					colores2[3]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.AZUL + "  " + Colores.RESET)) {
					colores2[4]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.MORADO + "  " + Colores.RESET)) {
					colores2[5]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.CELESTE + "  " + Colores.RESET)) {
					colores2[6]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.BLANCO + "  " + Colores.RESET)) {
					colores2[7]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
					colores2[8]++;
				} else if (combSecreta.combinacion[i].color.equals(Colores.ROSA + "  " + Colores.RESET)) {
					colores2[9]++;
				}
			}

		}

		for (i = 0; i < modo.casillas; i++) {
			if (contrincante.combRespuesta.combinacion[i].equals(combSecreta.combinacion[i])) {
				negro++;
			} else {

				if (combSecreta.combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
					if (colores1[0] > 0 && colores2[0] > 0) {
						colores1[0]--;
						colores2[0]--;
						rojo++;
					}					
				} else if (combSecreta.combinacion[i].color.equals(Colores.ROJO + "  " + Colores.RESET)) {
					if (colores1[1] > 0 && colores2[1] > 0) {
						colores1[1]--;
						colores2[1]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.VERDE + "  " + Colores.RESET)) {
					if (colores1[2] > 0 && colores2[2] > 0) {
						colores1[2]--;
						colores2[2]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
					if (colores1[3] > 0 && colores2[3] > 0) {
						colores1[3]--;
						colores2[3]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.AZUL + "  " + Colores.RESET)) {
					if (colores1[4] > 0 && colores2[4] > 0) {
						colores1[4]--;
						colores2[4]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.MORADO + "  " + Colores.RESET)) {
					if (colores1[5] > 0 && colores2[5] > 0) {
						colores1[5]--;
						colores2[5]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.CELESTE + "  " + Colores.RESET)) {
					if (colores1[6] > 0 && colores2[6] > 0) {
						colores1[6]--;
						colores2[6]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.BLANCO + "  " + Colores.RESET)) {
					if (colores1[7] > 0 && colores2[7] > 0) {
						colores1[7]--;
						colores2[7]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
					if (colores1[8] > 0 && colores2[8] > 0) {
						colores1[8]--;
						colores2[8]--;
						rojo++;
					}
				} else if (combSecreta.combinacion[i].color.equals(Colores.ROSA + "  " + Colores.RESET)) {
					if (colores1[9] > 0 && colores2[9] > 0) {
						colores1[9]--;
						colores2[9]--;
						rojo++;
					}
				}
			}
		}
		// rojo += negro;
		// blanco += rojo;

		for (i = 0; i < negro; i++) {
			respuesta[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		}
		for (; i < rojo; i++) {
			respuesta[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		}
		for (; i < modo.casillas; i++) {
			respuesta[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		}

		for (i = 0; i < modo.casillas; i++) {
			pintado[i] = respuesta[i];
		}
		comb.combinacion = pintado;

		return comb;
	}

}
