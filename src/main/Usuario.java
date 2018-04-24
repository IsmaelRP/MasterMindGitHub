package main;

import java.util.ArrayList;

import main.Teclado.enummaximominimo;

public class Usuario extends Jugador {

	Usuario(Modos modo) {
		super(modo);
	}

	public Combinacion ponerPinchitos(Combinacion pinchosBuenos) {
		Combinacion pinchos = new Combinacion(modo);
		int num1, num2;
		boolean bandera = false;;

		do {
			bandera = false;
			
			System.out.printf("\n\n¿Cuántos pinchitos negros?\n");
			num1 = Teclado.valores(0, modo.casillas, enummaximominimo.AMBOS_INCLUIDOS);

			System.out.printf("\n¿Cuántos pinchitos rojos?\n");
			num2 = Teclado.valores(0, modo.casillas, enummaximominimo.AMBOS_INCLUIDOS);

			for (int i = 0; i < modo.casillas; i++) {
				if (num1 > 0) {
					pinchos.combinacion[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
					num1--;
				} else if (num2 > 0) {
					pinchos.combinacion[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
					num2--;
				} else {
					pinchos.combinacion[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
				}
			}
			
			for (int i=0;i<modo.casillas;i++) {
				if (!pinchos.combinacion[i].equals(pinchosBuenos.combinacion[i])) {
					bandera = true;
				}
			}
			if (bandera) {
				System.out.printf("\nHas dado mal la pista\n");
			}
			
		} while (bandera);
		return pinchos;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Combinacion elegirCombinacionConRepet() {
		Combinacion combSecreta = new Combinacion(modo);
		ArrayList lista = new ArrayList<String>();
		boolean repetir = true;
		int opcionPosicion;
		int opcionColor;
		String pregunta;

		for (int x = 0; x < modo.casillas; x++) {
			lista.add(null);
			combSecreta.combinacion[x] = new Casilla(null);
		}

		// EMPEZAR CON LISTA NULL Y CAMBIAR LOS ADD POR SET PARA EVITAR EL NULL POINTER

		do {

			System.out.printf(
					"\n\nColores:\n1. Negro\n2. Rojo\n3. Verde\n4. Amarillo\n5. Azul\n6. Morado\n7. Celeste\n8. Blanco\n");
			opcionColor = Teclado.valores(1, 8, enummaximominimo.AMBOS_INCLUIDOS);

			System.out.printf("\nPosiciones: De 1 a %d\n", modo.casillas);
			opcionPosicion = Teclado.valores(1, modo.casillas, enummaximominimo.AMBOS_INCLUIDOS);

			opcionPosicion--;

			switch (opcionColor) {
			case 1:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.NEGRO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.NEGRO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 2:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.ROJO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.ROJO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 3:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.VERDE + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.VERDE + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 4:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.AMARILLO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.AMARILLO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 5:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.AZUL + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.AZUL + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 6:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.MORADO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.MORADO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 7:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.CELESTE + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.CELESTE + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 8:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.BLANCO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.BLANCO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 9:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.VERDECLARO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.VERDECLARO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 10:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.ROSA + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.ROSA + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			}
			if (!lista.contains(null)) {
				do {
					System.out.printf("\nTu combinación es:\n\n");
					for (int i = 0; i < modo.casillas; i++) {
						System.out.printf("%dº: %s  ", i + 1, combSecreta.combinacion[i].color);
					}
					System.out.printf("\n¿Desea cambiar alguna casilla? S/N ");
					pregunta = Teclado.pedirCadena();
					pregunta = pregunta.toUpperCase();
				} while (!pregunta.equals("S") && !pregunta.equals("N"));
				if (pregunta.equals("N")) {
					repetir = false;
				}
			}

		} while (repetir);

		return combSecreta;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Combinacion elegirCombinacionSinRepet() {
		Combinacion combSecreta = new Combinacion(modo);
		ArrayList lista = new ArrayList<String>();
		boolean repetir = true;
		int opcionPosicion;
		int opcionColor;
		int repeticion = 0;
		String pregunta;

		for (int x = 0; x < modo.casillas; x++) {
			lista.add(null);
			combSecreta.combinacion[x] = new Casilla(null);
		}

		do {

			System.out.printf(
					"\n\nColores:\n1. Negro\n2. Rojo\n3. Verde\n4. Amarillo\n5. Azul\n6. Morado\n7. Celeste\n8. Blanco\n");
			opcionColor = Teclado.valores(1, 8, enummaximominimo.AMBOS_INCLUIDOS);

			System.out.printf("\nPosiciones: De 1 a %d\n", modo.casillas);
			opcionPosicion = Teclado.valores(1, modo.casillas, enummaximominimo.AMBOS_INCLUIDOS);

			opcionPosicion--;

			switch (opcionColor) {
			case 1:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.NEGRO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.NEGRO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 2:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.ROJO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.ROJO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 3:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.VERDE + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.VERDE + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 4:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.AMARILLO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.AMARILLO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 5:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.AZUL + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.AZUL + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 6:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.MORADO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.MORADO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 7:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.CELESTE + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.CELESTE + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 8:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.BLANCO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.BLANCO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 9:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.VERDECLARO + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.VERDECLARO + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			case 10:
				if (combSecreta.combinacion[opcionPosicion].color == null) {
					combSecreta.combinacion[opcionPosicion].color = Colores.ROSA + "  " + Colores.RESET;
					lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.combinacion[opcionPosicion].color);
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.combinacion[opcionPosicion].color = Colores.ROSA + "  " + Colores.RESET;
						lista.set(opcionPosicion, combSecreta.combinacion[opcionPosicion]);
					}
				}
				break;
			}
			if (!lista.contains(null)) {
				do {
					System.out.printf("\nTu combinación es:\n\n");
					for (int i = 0; i < modo.casillas; i++) {
						System.out.printf("%dº: %s  ", i + 1, combSecreta.combinacion[i].color);
					}
					System.out.printf("\n¿Desea cambiar alguna casilla? S/N ");
					pregunta = Teclado.pedirCadena();
					pregunta = pregunta.toUpperCase();
				} while (!pregunta.equals("S") && !pregunta.equals("N"));
				if (pregunta.equals("N")) {
					repetir = false;

					// CREAR UN METODO

					for (int h = 0; h < modo.casillas; h++) { // AQUI SE COMPARA CADA COLOR PARA QUE NO SE REPITAN
						repeticion = 0;
						for (int t = 0; t < modo.casillas; t++) {
							if (combSecreta.combinacion[h].color.equals(combSecreta.combinacion[t].color)) {
								repeticion++;
							}
						}
						if (repeticion > 1) {
							repetir = true;
						}
					}

					if (repetir) {
						System.out.printf("\nNo se pueden repetir colores, por favor, modifique su combinación");
					}
				}
			}

		} while (repetir);

		return combSecreta;
	}

	@Override
	Combinacion generarCombinacion() {

		return elegirCombinacionSinRepet();
	}

	void dibujarCombinacionSecreta() {
		for (int i = 0; i < modo.casillas; i++) {
			System.out.printf("%s ", combSecreta.combinacion[i].color);
		}
	}

}
