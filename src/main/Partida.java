package main;

import main.Teclado.enummaximominimo;

public class Partida {

	@SuppressWarnings("unused")
	private Modos modo;
	private Jugador jugador1;
	private Tablero tablero1;

	private Jugador jugador2;
	private Tablero tablero2;

	Partida() {

	}

	Partida(Modos modo) {
		this.modo = modo;
		if (modo == Modos.FACIL) {
			jugador1 = new Usuario(modo);
			tablero1 = new Tablero();

			jugador2 = new Maquina(modo);
			tablero2 = new Tablero();

		} else if (modo == Modos.MEDIO) {
			jugador1 = new Usuario(modo);
			tablero1 = new Tablero();

			jugador2 = new Maquina(modo);
			tablero2 = new Tablero();
		} else {
			jugador1 = new Maquina(modo);
			tablero1 = new Tablero();

			jugador2 = new Maquina(modo);
			tablero2 = new Tablero();
		}
	}

	void inicioPartida() {
		int opcion;
		Modos modo;
		Partida partida;
		boolean fin = true;
		boolean fin1 = true;
		boolean fin2 = true;

		System.out.printf("Bienvenido a MasterMind");
		System.out.printf("\n\n1.Fácil\n2.Medio\n3.Difícil\n4.Instrucciones\n");
		opcion = Teclado.valores(1, 4, enummaximominimo.AMBOS_INCLUIDOS);

		switch (opcion) {
		case 1:
			modo = Modos.FACIL;
			break;
		case 2:
			modo = Modos.MEDIO;
			break;
		case 3:
			modo = Modos.DIFICIL;
			break;
		default:
			modo = Modos.INSTRUCCIONES;
		}
		partida = new Partida(modo);

		if (modo == Modos.FACIL) {
			System.out.printf("\n\n¿Quién va a jugar?\n1. Jugador\n2. Máquina\nOpción: ");
			opcion = Teclado.valores(1, 3, enummaximominimo.AMBOS_INCLUIDOS);

			if (opcion == 1) {

				partida.jugador2.combSecreta = partida.jugador2.generarCombinacion(); // Aqui la máquina (jugador2) se
																						// genera en su atributo la
				// combinación
				// secreta que deberá de adivinar el usuario (jugador1)
			} else {
				System.out.printf("\nElija su combinación secreta jugador 1\n");
				partida.jugador1.combSecreta = ((Usuario) partida.jugador1).elegirCombinacionSinRepet(modo);
			}
			do {
				if (opcion == 1) { // APARTADO DEL USUARIO EN EL MODO FACIL

					System.out.printf("\n\nElija su intento jugador 1\n");
					partida.jugador1.combRespuesta = ((Usuario) partida.jugador1).elegirCombinacionConRepet();

					if (partida.jugador2.comprobarCombinacion(partida.jugador1.combRespuesta)) {

						partida.tablero1.añadirAlTablero(partida.jugador1.combRespuesta,
								partida.jugador2.generarPista(partida.jugador1));

						partida.tablero1.dibujarTablero(partida.tablero1, partida.jugador1, partida.jugador2);

						System.out.printf("Has acertado la combinación: ");
						fin = false;
						((Maquina) partida.jugador2).dibujarCombinacionSecreta();
						System.out.printf("\n\n");
					} else {
						partida.tablero1.añadirAlTablero(partida.jugador1.combRespuesta,
								partida.jugador2.generarPista(partida.jugador1));
						partida.jugador1.intentos--;

						if (partida.jugador1.intentos != 0) {

							partida.tablero1.dibujarTablero(partida.tablero1, partida.jugador1, partida.jugador2);

							System.out.printf("Has fallado, te quedan %d intentos", partida.jugador1.intentos);
							// ((Maquina) partida.jugador2).dibujarCombinacion(); //COMPROBAR SI SE GENERAN
							// BIEN LAS COMBINACIONES
						} else {
							partida.tablero1.dibujarTablero(partida.tablero1, partida.jugador1, partida.jugador2);

							System.out.printf("Has perdido, la combinación era: ");
							((Maquina) partida.jugador2).dibujarCombinacionSecreta();
							System.out.printf("\n\n");
						}
					}
				} else { // APARTADO DE LA MÁQUINA EN EL MODO FACIL
					System.out.printf("\n\nVa a jugar la máquina\n");
					System.out.printf("Presione ENTER para el turno de la máquina\n");
					Teclado.pedirCadena();
					partida.jugador2.combRespuesta = ((Maquina) partida.jugador2).IA(partida.tablero2);
					
					System.out.printf("El actual intento de la máquina es:  ");
					((Maquina) partida.jugador2).dibujarCombinacionRespuesta();
					((Usuario) partida.jugador1).ponerPinchitos(partida.jugador1.generarPista(partida.jugador2));

					if (partida.jugador1.comprobarCombinacion(partida.jugador2.combRespuesta)) {

						partida.tablero2.añadirAlTablero(partida.jugador2.combRespuesta,
								jugador1.generarPista(partida.jugador2));

						partida.tablero2.dibujarTablero(partida.tablero2, partida.jugador2, partida.jugador1);

						System.out.printf("La máquina ha acertado la combinación: ");
						fin = false;
						partida.jugador1.dibujarCombinacionSecreta();
						System.out.printf("\n\n");
					} else {
						partida.tablero2.añadirAlTablero(partida.jugador2.combRespuesta,
								partida.jugador1.generarPista(partida.jugador2));
						partida.jugador2.intentos--;

						if (partida.jugador2.intentos != 0) {

							partida.tablero2.dibujarTablero(partida.tablero2, partida.jugador2, partida.jugador1);

							System.out.printf("La máquina fallado, le quedan %d intentos", partida.jugador2.intentos);
							// ((Maquina) partida.jugador1).dibujarCombinacion(); //COMPROBAR SI SE GENERAN
							// BIEN LAS COMBINACIONES
						} else {
							partida.tablero2.dibujarTablero(partida.tablero2, partida.jugador2, partida.jugador1);

							System.out.printf("La máquina ha perdido, la combinación era: ");
							partida.jugador1.dibujarCombinacionSecreta();
							System.out.printf("\n\n");
						}
					}

				}
			} while (partida.jugador1.intentos != 0 || partida.jugador2.intentos != 0 && fin);

		} else if (modo == Modos.MEDIO) {

			partida.jugador2.combSecreta = partida.jugador2.generarCombinacion();

			System.out.printf("\nVamos a generar tu combinación secreta jugador 1 (no se pueden repetir colores)\n");
			partida.jugador1.combSecreta = partida.jugador1.generarCombinacion();

			do {
				// AQUI EMPIEZA JUGANDO EL USUARIO
				System.out.printf("\n\nElija su intento jugador 1\n");

				partida.jugador1.combRespuesta = ((Usuario) partida.jugador1).elegirCombinacionConRepet();

				if (partida.jugador2.comprobarCombinacion(partida.jugador1.combRespuesta)) {

					partida.tablero1.añadirAlTablero(partida.jugador1.combRespuesta,
							partida.jugador2.generarPista(partida.jugador1));

					partida.tablero1.dibujarTablero(partida.tablero1, partida.jugador1, partida.jugador2);

					System.out.printf("Has acertado la combinación: ");
					fin1 = false;
					((Maquina) partida.jugador2).dibujarCombinacionSecreta();
					System.out.printf("\n\n");
				} else {
					partida.tablero1.añadirAlTablero(partida.jugador1.combRespuesta,
							partida.jugador2.generarPista(partida.jugador1));
					partida.jugador1.intentos--;

					if (partida.jugador1.intentos != 0) {

						partida.tablero1.dibujarTablero(partida.tablero1, partida.jugador1, partida.jugador2);

						System.out.printf("Has fallado, te quedan %d intentos\n\n", partida.jugador1.intentos);
						// ((Maquina) partida.jugador2).dibujarCombinacion(); //COMPROBAR SI SE GENERAN
						// BIEN LAS COMBINACIONES
					} else {
						partida.tablero1.dibujarTablero(partida.tablero1, partida.jugador1, partida.jugador2);

						System.out.printf("Has perdido, la combinación era: ");
						((Maquina) partida.jugador2).dibujarCombinacionSecreta();
						System.out.printf("\n\n");
					}
				}

				// AQUI EMPIEZA JUGANDO LA MÁQUINA
				// METODO DE LA IA QUE GENERE UNA COMBINACION A PARTIR DE LA PISTA DEL USUARIO
				// AL PRINCIPIO SERA ALEATORIO PORQUE NO HABRÁ PISTA
				System.out.printf("Presione ENTER para el turno de la máquina\n\n");
				Teclado.pedirCadena();
				partida.jugador2.combRespuesta = ((Maquina) partida.jugador2).IA(partida.tablero2);

				if (partida.jugador1.comprobarCombinacion(partida.jugador2.combRespuesta)) {

					partida.tablero2.añadirAlTablero(partida.jugador2.combRespuesta,
							partida.jugador1.generarPista(partida.jugador2));

					partida.tablero2.dibujarTablero(partida.tablero2, partida.jugador2, partida.jugador1);

					System.out.printf("La máquina ha acertado la combinación: ");
					fin2 = false;
					partida.jugador1.dibujarCombinacionSecreta();
					System.out.printf("\n\n");
				} else {
					partida.tablero2.añadirAlTablero(partida.jugador2.combRespuesta,
							partida.jugador1.generarPista(partida.jugador2));
					partida.jugador2.intentos--;

					if (partida.jugador2.intentos != 0) {

						partida.tablero1.dibujarTablero(partida.tablero2, partida.jugador2, partida.jugador1);

						System.out.printf("La máquina ha fallado, le quedan %d intentos\n\n",
								partida.jugador2.intentos);
						// ((Maquina) partida.jugador2).dibujarCombinacion(); //COMPROBAR SI SE GENERAN
						// BIEN LAS COMBINACIONES
					} else {
						partida.tablero2.dibujarTablero(partida.tablero2, partida.jugador2, partida.jugador1);

						System.out.printf("La máquina ha perdido, la combinación era: ");
						partida.jugador1.dibujarCombinacionSecreta();
						System.out.printf("\n\n");
					}
				}

				if (!fin1 && !fin2) {
					System.out.println("\nHabeis empatado");
				} else if (!fin1) {
					System.out.println("\nHa ganado el jugador 1");
				} else if (!fin2) {
					System.out.println("\nHa ganado la máquina");
				}

			} while (partida.jugador1.intentos != 0 && fin1 || fin2); // FALTA PONER 2 FIN, UNO PARA CADA JUGADOR PARA
																		// QUE ACABE
			// CUANDO ALGUNO DE LOS DOS GANE

		} else if (modo == Modos.DIFICIL) {
			System.out.printf("En proceso");
		} else {
			System.out.printf(
					"\n\nINSTRUCCIONES:\n\nLas bolitas %s significan que un color está en la posición adecuada\nLas bolitas %s significan que el color es correcto pero no su posición\nLas bolitas %s significan que el color no se encuentra en la combinación\n\n",
					Colores.NEGRO + "  " + Colores.RESET, Colores.ROJO + "  " + Colores.RESET, Colores.BLANCO + "  " + Colores.RESET);
		}
	}

	public static void main(String[] args) {

		Partida partida = new Partida();

		partida.inicioPartida();

	}

}
