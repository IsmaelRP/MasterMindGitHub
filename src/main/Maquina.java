package main;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Esta clase tiene los mismos atributos que su padre0, representa a la máquina (IA) que juega
 * 
 * @author Ismael Raqi Picardo
 * @version 1.0
 * @since 1.0
 *
 */
public class Maquina extends Jugador {

	/**
	 * Construye un nuevo objeto Maquina que contiene llama al método de su padre
	 * @param modo  El modo que determinará la longitud del array
	 */
	protected Maquina(Modos modo) {
		super(modo);
	}

	/**
	 * Genera un objeto Combinacion totalmente aleatorio, depende del modo si se repetirán colores y la longitud de la combinación, es implementada de su
	 * clase padre
	 * @return 		Combinacion			Objeto de clase Combinacion que será la combinación secreta de la máquina
	 */
	@Override
	protected Combinacion generarCombinacion() {

		Combinacion comb = new Combinacion(getModo());
		int numeroAux;
		@SuppressWarnings({ "unchecked", "rawtypes" })
		TreeMap<String, Casilla[]> mapa = new TreeMap();

		for (int i = 0; i < getModo().getCasillas(); i++) {
			numeroAux = (int) (Math.random() * (getModo().getColores())) + 1;

			switch (numeroAux) {
			case 1:
				if (mapa.containsKey(Colores.AMARILLO + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
					mapa.put(Colores.AMARILLO + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 2:
				if (mapa.containsKey(Colores.AZUL + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
					mapa.put(Colores.AZUL + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 3:
				if (mapa.containsKey(Colores.BLANCO + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
					mapa.put(Colores.BLANCO + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 4:
				if (mapa.containsKey(Colores.CELESTE + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
					mapa.put(Colores.CELESTE + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 5:
				if (mapa.containsKey(Colores.MORADO + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
					mapa.put(Colores.MORADO + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 6:
				if (mapa.containsKey(Colores.NEGRO + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
					mapa.put(Colores.NEGRO + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 7:
				if (mapa.containsKey(Colores.ROJO + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
					mapa.put(Colores.ROJO + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 8:
				if (mapa.containsKey(Colores.VERDE + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
					mapa.put(Colores.VERDE + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 9:
				if (mapa.containsKey(Colores.ROSA + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
					mapa.put(Colores.ROSA + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;

			case 10:
				if (mapa.containsKey(Colores.VERDECLARO + "  " + Colores.RESET) && getModo() != Modos.DIFICIL) {
					i--;
				} else {
					comb.getCombinacion()[i] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
					mapa.put(Colores.VERDECLARO + "  " + Colores.RESET, comb.getCombinacion());
				}
				break;
			}
		}
		return comb;
	}

	/**
	 * Muestra por pantalla la combinación secreta de la máquina que lo ejecute, es implementada de su
	 * clase padre
	 */
	protected void dibujarCombinacionSecreta() {
		for (int i = 0; i < getModo().getCasillas(); i++) {
			System.out.printf("%s ", getCombSecreta().getCombinacion()[i].getColor());
		}
	}

	/**
	 * Muestra por pantalla la combinación respuesta de la máquina que lo ejecute
	 */
	protected void dibujarCombinacionRespuesta() {
		for (int i = 0; i < getModo().getCasillas(); i++) {
			System.out.printf("%s ", getCombRespuesta().getCombinacion()[i].getColor());
		}
	}

	/**
	 * Inteligencia artificial que sigue una estrategia para hallar la combinación secreta del contrincante a partir de las pistas del tablero
	 * @param		tablero		El tablero que se evaluará
	 * @return 		Combinacion		Combinación de colores para hallar el secreto
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected  Combinacion IA(Tablero tablero) {
		Combinacion comb = new Combinacion(getModo());
		Combinacion combFinal = new Combinacion(getModo());
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
			
			for (int o = 0; o < comb.getCombinacion().length; o++) {
				comb.getCombinacion()[o] = new Casilla(auxRand);
			}

		} else {

			for (int i = 0; i < tablero.getTablero().size(); i++) {
				// AQUI SE COMPRUEBA QUE TODAVÍA ESTAMOS EN LA PRIMERA FASE, EN LA QUE TODOS LOS
				// COLORES SON IGUALES
				for (int h = 0; h < getModo().getCasillas(); h++) {

					if (tablero.getTablero().get(i).getCombinacion()[0].getColor()!= tablero.getTablero()
							.get(i).getCombinacion()[h].getColor()) {
						fasePrimera = false;
					}
				}
				if (fasePrimera) {
					if (tablero.getTablero().get(i).getCombinacion()[0].getColor().equals(Colores.NEGRO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									negro++;
								}
							}

						}

						lista.add(Colores.NEGRO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.ROJO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									rojo++;
								}
							}
						}

						lista.add(Colores.ROJO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.VERDE + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									verde++;
								}
							}
						}

						lista.add(Colores.VERDE + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.AMARILLO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									amarillo++;
								}
							}
						}

						lista.add(Colores.AMARILLO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.AZUL + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									azul++;
								}
							}
						}

						lista.add(Colores.AZUL + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.MORADO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									morado++;
								}
							}
						}

						lista.add(Colores.MORADO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.CELESTE + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									celeste++;
								}
							}
						}

						lista.add(Colores.CELESTE + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.BLANCO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									blanco++;
								}
							}
						}

						lista.add(Colores.BLANCO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.VERDECLARO + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
										.equals(Colores.NEGRO + "  " + Colores.RESET)) {
									verdeclaro++;
								}
							}
						}

						lista.add(Colores.VERDECLARO + "  " + Colores.RESET);
					} else if (tablero.getTablero().get(i).getCombinacion()[0].getColor()
							.equals(Colores.ROSA + "  " + Colores.RESET)) {
						if (tablero.getPista().get(i).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							for (int u = 0; u < getModo().getCasillas(); u++) {
								if (tablero.getPista().get(i).getCombinacion()[u].getColor()
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
					+ rosa == getModo().getCasillas()) {
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

					for (int w = 0; w < getModo().getCasillas(); w++) {
						if (tablero.getPista().get(w).getCombinacion()[0].getColor()
								.equals(Colores.NEGRO + "  " + Colores.RESET)) {
							if (!tablero.getTablero().get(w).getCombinacion()[0].getColor().equals(colorNoEsta)) {
								colorAux = tablero.getTablero().get(w).getCombinacion()[0].getColor();
								w = getModo().getCasillas();
							} else {
								colorAux = tablero.getTablero().get(w).getCombinacion()[w + 1].getColor();
								w = getModo().getCasillas();
							}
						}
					}

					comb.getCombinacion()[generarPosicionRandom()-1] = new Casilla(colorAux);
					
					for (int s = 0; s < getModo().getCasillas(); s++) {
						if (comb.getCombinacion()[s] == null) {
							comb.getCombinacion()[s] = new Casilla(colorNoEsta);
						}
					}
				} else {

					for (; aux < tablero.getTablero().size(); aux++) {
						// lista = new ArrayList<String>();

						// lista.add(tablero.getPista().get(aux).combinacion[0].color);
						faseSegunda = true;
						for (int n = 0; n < getModo().getCasillas(); n++) {
							if (combFinal.getCombinacion()[n] == null) {
								faseSegunda = false;
							}
						}

						if (!faseSegunda) { // AQUI ENTRA SI TODAVIA NO SE HA RESUELTO TODAS LAS POSICIONES

							if (tablero.getPista().get(aux).getCombinacion()[0].getColor()
									.equals(Colores.NEGRO + "  " + Colores.RESET)) {
								for (int m = 0; m < getModo().getCasillas(); m++) {
									if (!tablero.getTablero().get(aux).getCombinacion()[m].getColor().equals(colorNoEsta)) {
										combFinal.getCombinacion()[m].setColor(tablero.getTablero()
												.get(aux).getCombinacion()[m].getColor());
									}
								}
							} else {
								for (int m = 0; m < getModo().getCasillas(); m++) {
									if (!tablero.getTablero().get(aux).getCombinacion()[m].getColor().equals(colorNoEsta)) {
										comb.getCombinacion()[m] = new Casilla(tablero.getTablero().get(aux).getCombinacion()[m].getColor());
									}
								}

								for (int h = 0; h < getModo().getCasillas(); h++) {
									if (comb.getCombinacion()[h] == null) {
										comb.getCombinacion()[h] = new Casilla(colorNoEsta);
									}
								}
							}

						} else {
							comb = combFinal;
						}

					}
				}
			} else {
				do {
					auxRand = generarColorRandom();
				} while (lista.contains(auxRand));

				for (int k = 0; k < getModo().getCasillas(); k++) {
					comb.getCombinacion()[k] = new Casilla(auxRand);
				}

			}

		}
		return comb;
	}

	/**
	 * Método de funcionamiento interno que sirve para generar un color aleatorio, dependiendo del modo de juego podrán ser 8 colores o 10 colores
	 * @return 		String		Cadena de texto que contendrá el estático del color
	 */
	private String generarColorRandom() {
		int numero = (int) (Math.random() * getModo().getColores()) + 1;
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

	/**
	 * Método de funcionamiento interno que sirve para generar un número aleatorio, dependiendo del modo de juego podrá ser de 1 a 4, 5 o 8
	 * @return 		int		Número aleatorio para acceder a una posición de la combinación aleatoria
	 */
	private int generarPosicionRandom() {
		return (int) (Math.random() * getModo().getCasillas()) + 1;
	}

}
