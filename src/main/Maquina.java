package main;

import java.util.ArrayList;
import java.util.TreeMap;

public class Maquina extends Jugador {

	Maquina(Modos modo) {
		super(modo);
	}

	@Override
	Combinacion generarCombinacion() {

		Combinacion comb = new Combinacion(modo);
		int numeroAux;
		@SuppressWarnings({ "unchecked", "rawtypes" })
		TreeMap<String, Casilla[]> mapa = new TreeMap();

		for (int i = 0; i < modo.casillas; i++) {
			numeroAux = (int) (Math.random() * (modo.colores)) + 1;

			switch (numeroAux) {
			case 1:
				if (mapa.containsKey(Colores.AMARILLO + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
					mapa.put(Colores.AMARILLO + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 2:
				if (mapa.containsKey(Colores.AZUL + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
					mapa.put(Colores.AZUL + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 3:
				if (mapa.containsKey(Colores.BLANCO + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
					mapa.put(Colores.BLANCO + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 4:
				if (mapa.containsKey(Colores.CELESTE + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
					mapa.put(Colores.CELESTE + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 5:
				if (mapa.containsKey(Colores.MORADO + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
					mapa.put(Colores.MORADO + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 6:
				if (mapa.containsKey(Colores.NEGRO + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
					mapa.put(Colores.NEGRO + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 7:
				if (mapa.containsKey(Colores.ROJO + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
					mapa.put(Colores.ROJO + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 8:
				if (mapa.containsKey(Colores.VERDE + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
					mapa.put(Colores.VERDE + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 9:
				if (mapa.containsKey(Colores.ROSA + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
					mapa.put(Colores.ROSA + "  " + Colores.RESET, comb.combinacion);
				}
				break;

			case 10:
				if (mapa.containsKey(Colores.VERDECLARO + "  " + Colores.RESET) && modo != Modos.DIFICIL) {
					i--;
				} else {
					comb.combinacion[i] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
					mapa.put(Colores.VERDECLARO + "  " + Colores.RESET, comb.combinacion);
				}
				break;
			}
		}
		return comb;
	}

	void dibujarCombinacionSecreta() {
		for (int i = 0; i < modo.casillas; i++) {
			System.out.printf("%s ", combSecreta.combinacion[i].color);
		}
	}

	void dibujarCombinacionRespuesta() {
		for (int i = 0; i < modo.casillas; i++) {
			System.out.printf("%s ", combRespuesta.combinacion[i].color);
		}
	}

	@SuppressWarnings("unchecked")
	public Combinacion IA(Tablero tablero) {
		Combinacion comb = new Combinacion(modo);
		Combinacion combFinal = new Combinacion(modo);
		int negro = 0;
		int rojo = 0;
		int verde = 0;
		int amarillo = 0;
		int azul = 0;
		int morado = 0;
		int celeste = 0;
		int blanco = 0;
		int verdeclaro = 0;
		int rosa = 0;
		String auxRand;
		boolean fasePrimera = true;
		boolean bandera = true;
		int aux = 0;
		int aux1;
		int aux2;

		ArrayList lista = new ArrayList<String>();

		boolean faseSegunda = true;
		boolean noContar = true;
		int auxContador = 0;
		int totalColores = 0;
		String colorNoEsta = "";
		String colorAux = "";

		if (tablero.getTablero().size() == 0) {
			auxRand = generarColorRandom();
			// if (auxRand.equals(Colores.NEGRO + " " + Colores.RESET)) {
			// negro++;
			// lista.add(Colores.NEGRO + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.ROJO + " " + Colores.RESET)) {
			// rojo++;
			// lista.add(Colores.ROJO + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.VERDE + " " + Colores.RESET)) {
			// verde++;
			// lista.add(Colores.VERDE + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.AMARILLO + " " + Colores.RESET)) {
			// amarillo++;
			// lista.add(Colores.AMARILLO + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.AZUL + " " + Colores.RESET)) {
			// azul++;
			// lista.add(Colores.AZUL + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.MORADO + " " + Colores.RESET)) {
			// morado++;
			// lista.add(Colores.MORADO + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.CELESTE + " " + Colores.RESET)) {
			// celeste++;
			// lista.add(Colores.CELESTE + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.BLANCO + " " + Colores.RESET)) {
			// blanco++;
			// lista.add(Colores.BLANCO + " " + Colores.RESET);
			// } else if (auxRand.equals(Colores.VERDECLARO + " " + Colores.RESET)) {
			// verdeclaro++;
			// lista.add(Colores.VERDECLARO + " " + Colores.RESET);
			// } else {
			// rosa++;
			// lista.add(Colores.ROSA + " " + Colores.RESET);
			// }

			for (int o = 0; o < comb.combinacion.length; o++) {
				comb.combinacion[o] = new Casilla(auxRand);
			}

		} else {

			for (int i = 0; i < tablero.getTablero().size(); i++) {
				// AQUI SE COMPRUEBA QUE TODAVÍA ESTAMOS EN LA PRIMERA FASE, EN LA QUE TODOS LOS
				// COLORES SON IGUALES
				for (int h = 0; h < modo.casillas; h++) {

					if (tablero.getTablero().get(i).combinacion[0].color != tablero.getTablero()
							.get(i).combinacion[h].color) {
						fasePrimera = false;
					}
				}
				if (fasePrimera) {
					if (tablero.getTablero().get(i).combinacion[0].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									negro++;
								}
							}

						}

						lista.add(Colores.NEGRO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.ROJO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									rojo++;
								}
							}
						}

						lista.add(Colores.ROJO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.VERDE + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									verde++;
								}
							}
						}

						lista.add(Colores.VERDE + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									amarillo++;
								}
							}
						}

						lista.add(Colores.AMARILLO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.AZUL + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									azul++;
								}
							}
						}

						lista.add(Colores.AZUL + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.MORADO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									morado++;
								}
							}
						}

						lista.add(Colores.MORADO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.CELESTE + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									celeste++;
								}
							}
						}

						lista.add(Colores.CELESTE + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.BLANCO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									blanco++;
								}
							}
						}

						lista.add(Colores.BLANCO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									verdeclaro++;
								}
							}
						}

						lista.add(Colores.VERDECLARO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).combinacion[0].color
							.equals(Colores.ROSA + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < modo.casillas; u++) {
								if (tablero.getPista().get(i).combinacion[u].color
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									rosa++;
								}
							}
						}

						lista.add(Colores.ROSA + "  " + Colores.RESET);
					}

					aux = i + 1;
				}

			}

			if (negro + rojo + verde + amarillo + azul + morado + celeste + blanco + verdeclaro
					+ rosa == modo.casillas) {
				fasePrimera = false;

				if (negro == 0) {
					colorNoEsta = Colores.NEGRO + "  " + Colores.RESET;
				} else if (rojo == 0) {
					colorNoEsta = Colores.ROJO + "  " + Colores.RESET;
				} else if (verde == 0) {
					colorNoEsta = Colores.VERDE + "  " + Colores.RESET;
				} else if (amarillo == 0) {
					colorNoEsta = Colores.AMARILLO + "  " + Colores.RESET;
				} else if (azul == 0) {
					colorNoEsta = Colores.AZUL + "  " + Colores.RESET;
				} else if (morado == 0) {
					colorNoEsta = Colores.MORADO + "  " + Colores.RESET;
				} else if (celeste == 0) {
					colorNoEsta = Colores.CELESTE + "  " + Colores.RESET;
				} else if (blanco == 0) {
					colorNoEsta = Colores.BLANCO + "  " + Colores.RESET;
				} else if (verdeclaro == 0) {
					colorNoEsta = Colores.VERDECLARO + "  " + Colores.RESET;
				} else if (rosa == 0) {
					colorNoEsta = Colores.ROSA + "  " + Colores.RESET;
				}
			}

			if (!fasePrimera) {

				if (aux == tablero.getTablero().size()) {

					for (int w = 0; w < modo.casillas; w++) {
						if (tablero.getPista().get(w).combinacion[0].color
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							if (!tablero.getTablero().get(w).combinacion[w].color.equals(colorNoEsta)) {
								colorAux = tablero.getTablero().get(w).combinacion[w].color;
								w = modo.casillas;
							} else {
								colorAux = tablero.getTablero().get(w).combinacion[w + 1].color;
								w = modo.casillas;
							}
						}
					}

					comb.combinacion[generarPosicionRandom()] = new Casilla(colorAux);
					
					for (int s = 0; s < modo.casillas; s++) {
						if (comb.combinacion[s] == null) {
							comb.combinacion[s] = new Casilla(colorNoEsta);
						}
					}
				} else {

					for (; aux < tablero.getTablero().size(); aux++) {
						// lista = new ArrayList<String>();

						// lista.add(tablero.getPista().get(aux).combinacion[0].color);
						faseSegunda = true;
						for (int n = 0; n < modo.casillas; n++) {
							if (combFinal.combinacion[n] == null) {
								faseSegunda = false;
							}
						}

						if (!faseSegunda) { // AQUI ENTRA SI TODAVIA NO SE HA RESUELTO TODAS LAS POSICIONES

							if (tablero.getPista().get(aux).combinacion[0].color
									.equals(Colores.NEGRO + "  " + Colores.RESET)) {
								for (int m = 0; m < modo.casillas; m++) {
									if (!tablero.getTablero().get(aux).combinacion[m].color.equals(colorNoEsta)) {
										combFinal.combinacion[m].color = tablero.getTablero()
												.get(aux).combinacion[m].color;
									}
								}
							} else {
								for (int m = 0; m < modo.casillas; m++) {
									if (!tablero.getTablero().get(aux).combinacion[m].color.equals(colorNoEsta)) {
										comb.combinacion[m] = new Casilla(tablero.getTablero().get(aux).combinacion[m].color);
									}
								}

								for (int h = 0; h < modo.casillas; h++) {
									if (comb.combinacion[h] == null) {
										comb.combinacion[h] = new Casilla(colorNoEsta);
									}
								}
							}

						} else {
							comb = combFinal;
						}

					}
				}
				/*
				 * for (int y = 0; y < modo.casillas; y++) { do { aux1 = generarPosicionRandom()
				 * - 1; } while (comb.combinacion[aux1] != null);
				 * 
				 * aux2 = (int) (Math.random() * modo.colores) + 1;
				 * 
				 * switch (aux2) { case 1: if (negro > 0) { negro--; comb.combinacion[aux1] =
				 * new Casilla(Colores.NEGRO + "  " + Colores.RESET); } else { y--; } break;
				 * case 2: if (rojo > 0) { rojo--; comb.combinacion[aux1] = new
				 * Casilla(Colores.ROJO + "  " + Colores.RESET); } else { y--; } break; case 3:
				 * if (verde > 0) { verde--; comb.combinacion[aux1] = new Casilla(Colores.VERDE
				 * + "  " + Colores.RESET); } else { y--; } break; case 4: if (amarillo > 0) {
				 * amarillo--; comb.combinacion[aux1] = new Casilla(Colores.AMARILLO + "  " +
				 * Colores.RESET); } else { y--; } break; case 5: if (azul > 0) { azul--;
				 * comb.combinacion[aux1] = new Casilla(Colores.AZUL + "  " + Colores.RESET); }
				 * else { y--; } break; case 6: if (morado > 0) { morado--;
				 * comb.combinacion[aux1] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
				 * } else { y--; } break; case 7: if (celeste > 0) { celeste--;
				 * comb.combinacion[aux1] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
				 * } else { y--;
				 * 
				 * } break; case 8: if (blanco > 0) { blanco--; comb.combinacion[aux1] = new
				 * Casilla(Colores.BLANCO + "  " + Colores.RESET); } else { y--; } break; case
				 * 9: if (verdeclaro > 0) { verdeclaro--; comb.combinacion[aux1] = new
				 * Casilla(Colores.VERDECLARO + "  " + Colores.RESET); } else { y--; } break;
				 * case 10: if (rosa > 0) { rosa--; comb.combinacion[aux1] = new
				 * Casilla(Colores.ROSA + "  " + Colores.RESET); } else { y--; } break; } }
				 */

				/*
				 * do { bandera = false;
				 * 
				 * auxRand = generarColorRandom(); if (auxRand.equals(Colores.NEGRO + "  " +
				 * Colores.RESET) && negro > 0) { comb.combinacion[generarPosicionRandom()] =
				 * new Casilla(Colores.NEGRO + "  " + Colores.RESET); // HACER ESTO PARA CADA
				 * COLOR } } while (bandera);
				 */
			} else {
				do {
					auxRand = generarColorRandom();
				} while (lista.contains(auxRand));

				for (int k = 0; k < modo.casillas; k++) {
					comb.combinacion[k] = new Casilla(auxRand);
				}

			}

		}
		return comb;
	}

	public Combinacion IAAntigua(Tablero tablero) {
		Combinacion comb = new Combinacion(modo);

		int negro = 0;
		int rojo = 0;
		int verde = 0;
		int amarillo = 0;
		int azul = 0;
		int morado = 0;
		int celeste = 0;
		int blanco = 0;
		int verdeclaro = 0;
		int rosa = 0;
		String auxRand;
		boolean fasePrimera = true;
		boolean faseSegunda = true;
		boolean noContar = true;
		int auxContador = 0;
		int totalColores = 0;
		String colorNoEsta = "";

		// EN PRIMER LUGAR, SI EL TABLERO ESTÁ VACIO, SE GENERA UNA COMBINACIÓN DE 1
		// COLOR ALEATORIO
		if (tablero.getTablero().size() == 0) {
			auxRand = generarColorRandom();
			for (int o = 0; o < comb.combinacion.length; o++) {
				comb.combinacion[o] = new Casilla(auxRand);
			}

		} else {
			// EN CASO QUE NO ESTÉ VACIA, SE RELLENAN LAS VARIABLES SEGÚN LOS COLORES QUE
			// HEMOS ENCONTRADO

			for (int i = 0; i < tablero.getTablero().size(); i++) {
				fasePrimera = true;
				faseSegunda = true;
				// AQUI SE COMPRUEBA QUE TODAVÍA ESTAMOS EN LA PRIMERA FASE, EN LA QUE TODOS LOS
				// COLORES SON IGUALES
				for (int h = 0; h < modo.casillas; h++) {
					if (tablero.getTablero().get(i).combinacion[0].color != tablero.getTablero()
							.get(i).combinacion[h].color) {
						fasePrimera = false;
					}
				}

				// PARA LA FASE PRIMERA SE AVERIGÜA CUALES SON LOS COLORES QUE HAY EN LA
				// COMBINACIÓN
				// Y CUÁNTOS DE ELLOS
				if (fasePrimera) {

					if (tablero.getTablero().get(i).combinacion[i].color.equals(Colores.NEGRO + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								negro++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.ROJO + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								rojo++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.VERDE + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								verde++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								amarillo++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.AZUL + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								azul++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.MORADO + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								morado++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.CELESTE + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								celeste++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.BLANCO + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								blanco++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								verdeclaro++;
							}
						}
					} else if (tablero.getTablero().get(i).combinacion[i].color
							.equals(Colores.ROSA + "  " + Colores.RESET)) {
						for (int l = 0; l < modo.casillas; l++) {
							if (tablero.getPista().get(i).combinacion[l].color == Colores.NEGRO + "  "
									+ Colores.RESET) {
								rosa++;
							}
						}
					}

					// AQUI SE COMPRUEBA SI TENGO TODOS LOS COLORES
					if (noContar) {
						totalColores = negro + rojo + verde + amarillo + azul + morado + celeste + blanco + verdeclaro
								+ rosa;

						if (totalColores == modo.casillas) {
							noContar = false;
							if (negro == 0) {
								colorNoEsta = Colores.NEGRO + "  " + Colores.RESET;
							} else if (rojo == 0) {
								colorNoEsta = Colores.ROJO + "  " + Colores.RESET;
							} else if (verde == 0) {
								colorNoEsta = Colores.VERDE + "  " + Colores.RESET;
							} else if (amarillo == 0) {
								colorNoEsta = Colores.AMARILLO + "  " + Colores.RESET;
							} else if (azul == 0) {
								colorNoEsta = Colores.AZUL + "  " + Colores.RESET;
							} else if (morado == 0) {
								colorNoEsta = Colores.MORADO + "  " + Colores.RESET;
							} else if (celeste == 0) {
								colorNoEsta = Colores.CELESTE + "  " + Colores.RESET;
							} else if (blanco == 0) {
								colorNoEsta = Colores.BLANCO + "  " + Colores.RESET;
							} else if (verdeclaro == 0) {
								colorNoEsta = Colores.VERDECLARO + "  " + Colores.RESET;
							} else if (rosa == 0) {
								colorNoEsta = Colores.ROSA + "  " + Colores.RESET;
							}
						} else {
							auxRand = generarColorRandom();
							for (int k = 0; k < modo.casillas; k++) {
								comb.combinacion[k] = new Casilla(auxRand);
							}
						}
					}

				} else if (faseSegunda) { // AQUI YA SE SABE CUÁNTOS COLORES HAY DE CADA TIPO Y SE PUEDEN HABER GENERADO
											// ALGUNAS COMBINACIONES
					auxContador = 0;
					if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.NEGRO + "  "
								+ Colores.RESET && negro > 0) {
							negro--;
							comb.combinacion[auxContador].color = Colores.NEGRO + "  " + Colores.RESET;
						} else {
							// AQUI GENERAR LA MISMA COMBINACION PARA SABER LA POSICIÓN PERO EN DIFERENTE
							// POSICIÓN QUE LA COMRPBOADA
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.NEGRO + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {
								// do { //AQUI SE DEBERÍA GENERAR UN NÚMERO ALEATORIO QUE NO SE HUBIESE GENERADO
								// ANTES PERO
								// SE VA A GENERAR UN NÚMERO ALEATORIO SIN MAS

								// }while (auxContador != tablero.getTablero().get(i));

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.ROJO + "  "
								+ Colores.RESET && rojo > 0) {
							rojo--;
							comb.combinacion[auxContador].color = Colores.ROJO + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.ROJO + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.VERDE + "  "
								+ Colores.RESET && verde > 0) {
							verde--;
							comb.combinacion[auxContador].color = Colores.VERDE + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.VERDE + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.AMARILLO + "  "
								+ Colores.RESET && amarillo > 0) {
							amarillo--;
							comb.combinacion[auxContador].color = Colores.AMARILLO + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.AMARILLO + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.AZUL + "  "
								+ Colores.RESET && azul > 0) {
							azul--;
							comb.combinacion[auxContador].color = Colores.AZUL + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.AZUL + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.MORADO + "  "
								+ Colores.RESET && morado > 0) {
							morado--;
							comb.combinacion[auxContador].color = Colores.MORADO + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.MORADO + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.CELESTE + "  "
								+ Colores.RESET && celeste > 0) {
							celeste--;
							comb.combinacion[auxContador].color = Colores.CELESTE + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.CELESTE + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.BLANCO + "  "
								+ Colores.RESET && blanco > 0) {
							blanco--;
							comb.combinacion[auxContador].color = Colores.BLANCO + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.BLANCO + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.VERDECLARO + "  "
								+ Colores.RESET && verdeclaro > 0) {
							verdeclaro--;
							comb.combinacion[auxContador].color = Colores.VERDECLARO + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.VERDECLARO + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					} else if (tablero.getPista().get(i).combinacion[0].color == Colores.NEGRO + "  " + Colores.RESET) {
						if (tablero.getTablero().get(i).combinacion[auxContador].color == Colores.ROSA + "  "
								+ Colores.RESET && rosa > 0) {
							rosa--;
							comb.combinacion[auxContador].color = Colores.ROSA + "  " + Colores.RESET;
						} else {
							comb.combinacion[(int) (Math.random() * modo.casillas)].color = Colores.ROSA + "  "
									+ Colores.RESET;
							for (int u = 0; u < modo.casillas; u++) {

								if (comb.combinacion[u].color == null) {
									comb.combinacion[u].color = colorNoEsta;
								}

							}
						}
					}

				}
			}
		}

		return comb;
	}

	private String generarColorRandom() {
		int numero = (int) (Math.random() * modo.colores) + 1;
		String a = "";

		switch (numero) {
		case 1:
			a = Colores.NEGRO;
			break;
		case 2:
			a = Colores.ROJO;
			break;
		case 3:
			a = Colores.VERDE;
			break;
		case 4:
			a = Colores.AMARILLO;
			break;
		case 5:
			a = Colores.AZUL;
			break;
		case 6:
			a = Colores.MORADO;
			break;
		case 7:
			a = Colores.CELESTE;
			break;
		case 8:
			a = Colores.BLANCO;
			break;
		case 9:
			a = Colores.VERDECLARO;
			break;
		case 10:
			a = Colores.ROSA;
			break;
		}
		a = a + "  " + Colores.RESET;
		return a;
	}

	private int generarPosicionRandom() {
		return (int) (Math.random() * modo.casillas) + 1;
	}

}