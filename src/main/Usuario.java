package main;

import java.util.ArrayList;

import main.Teclado.enummaximominimo;

public class Usuario extends Jugador {

	protected Usuario(Modos modo) {
		super(modo);
	}

	protected Combinacion ponerPinchitos(Combinacion pinchosBuenos) {
		Combinacion pinchos = new Combinacion(getModo());
		int num1, num2;
		boolean bandera = false;;

		do {
			bandera = false;
			
			System.out.printf("\n\n¿Cuántos pinchitos negros?\n");
			num1 = Teclado.valores(0, getModo().getCasillas(), enummaximominimo.AMBOS_INCLUIDOS);

			System.out.printf("\n¿Cuántos pinchitos rojos?\n");
			num2 = Teclado.valores(0, getModo().getCasillas(), enummaximominimo.AMBOS_INCLUIDOS);

			for (int i = 0; i < getModo().getCasillas(); i++) {
				if (num1 > 0) {
					pinchos.getCombinacion()[i] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
					num1--;
				} else if (num2 > 0) {
					pinchos.getCombinacion()[i] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
					num2--;
				} else {
					pinchos.getCombinacion()[i] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
				}
			}
			
			for (int i=0;i< getModo().getCasillas();i++) {
				if (!pinchos.getCombinacion()[i].equals(pinchosBuenos.getCombinacion()[i])) {
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
	protected Combinacion elegirCombinacionConRepet() {
		Combinacion combSecreta = new Combinacion(getModo());
		ArrayList lista = new ArrayList<String>();
		boolean repetir = true;
		int opcionPosicion;
		int opcionColor;
		String pregunta;

		for (int x = 0; x < getModo().getCasillas(); x++) {
			lista.add(null);
			combSecreta.getCombinacion()[x] = new Casilla(null);
		}

		do {

			System.out.printf(
					"\n\nColores:\n1. Negro\n2. Rojo\n3. Verde\n4. Amarillo\n5. Azul\n6. Morado\n7. Celeste\n8. Blanco\n");
			opcionColor = Teclado.valores(1, 8, enummaximominimo.AMBOS_INCLUIDOS);

			System.out.printf("\nPosiciones: De 1 a %d\n", getModo().getCasillas());
			opcionPosicion = Teclado.valores(1, getModo().getCasillas(), enummaximominimo.AMBOS_INCLUIDOS);

			opcionPosicion--;

			switch (opcionColor) {
			case 1:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.NEGRO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.NEGRO + "  " + Colores.RESET);;
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 2:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROJO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROJO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 3:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDE + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDE + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 4:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AMARILLO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AMARILLO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 5:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AZUL + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AZUL + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 6:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.MORADO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.MORADO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 7:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.CELESTE + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.CELESTE + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 8:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.BLANCO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.BLANCO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 9:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDECLARO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDECLARO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 10:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROSA + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROSA + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			}
			if (!lista.contains(null)) {
				do {
					System.out.printf("\nTu combinación es:\n\n");
					for (int i = 0; i < getModo().getCasillas(); i++) {
						System.out.printf("%dº: %s  ", i + 1, combSecreta.getCombinacion()[i].getColor());
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
	protected Combinacion elegirCombinacionSinRepet() {
		Combinacion combSecreta = new Combinacion(getModo());
		ArrayList lista = new ArrayList<String>();
		boolean repetir = true;
		int opcionPosicion;
		int opcionColor;
		int repeticion = 0;
		String pregunta;

		for (int x = 0; x < getModo().getCasillas(); x++) {
			lista.add(null);
			combSecreta.getCombinacion()[x] = new Casilla(null);
		}

		do {

			System.out.printf(
					"\n\nColores:\n1. Negro\n2. Rojo\n3. Verde\n4. Amarillo\n5. Azul\n6. Morado\n7. Celeste\n8. Blanco\n");
			opcionColor = Teclado.valores(1, 8, enummaximominimo.AMBOS_INCLUIDOS);

			System.out.printf("\nPosiciones: De 1 a %d\n", getModo().getCasillas());
			opcionPosicion = Teclado.valores(1, getModo().getCasillas(), enummaximominimo.AMBOS_INCLUIDOS);

			opcionPosicion--;

			switch (opcionColor) {
			case 1:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.NEGRO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.NEGRO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 2:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROJO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROJO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 3:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDE + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDE + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 4:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AMARILLO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AMARILLO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 5:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AZUL + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.AZUL + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 6:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.MORADO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.MORADO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 7:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.CELESTE + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.CELESTE + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 8:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.BLANCO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.BLANCO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 9:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDECLARO + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.VERDECLARO + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			case 10:
				if (combSecreta.getCombinacion()[opcionPosicion].getColor() == null) {
					combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROSA + "  " + Colores.RESET);
					lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
				} else {
					do {
						System.out.printf("La posición %d es %s ¿Deseas cambiarla? S/N: ", opcionPosicion + 1,
								combSecreta.getCombinacion()[opcionPosicion].getColor());
						pregunta = Teclado.pedirCadena();
						pregunta = pregunta.toUpperCase();
					} while (!pregunta.equals("S") && !pregunta.equals("N"));
					if (pregunta.equals("S")) {
						combSecreta.getCombinacion()[opcionPosicion].setColor(Colores.ROSA + "  " + Colores.RESET);
						lista.set(opcionPosicion, combSecreta.getCombinacion()[opcionPosicion]);
					}
				}
				break;
			}
			if (!lista.contains(null)) {
				do {
					System.out.printf("\nTu combinación es:\n\n");
					for (int i = 0; i < getModo().getCasillas(); i++) {
						System.out.printf("%dº: %s  ", i + 1, combSecreta.getCombinacion()[i].getColor());
					}
					System.out.printf("\n¿Desea cambiar alguna casilla? S/N ");
					pregunta = Teclado.pedirCadena();
					pregunta = pregunta.toUpperCase();
				} while (!pregunta.equals("S") && !pregunta.equals("N"));
				if (pregunta.equals("N")) {
					repetir = false;

					// CREAR UN METODO

					for (int h = 0; h < getModo().getCasillas(); h++) { // AQUI SE COMPARA CADA COLOR PARA QUE NO SE REPITAN
						repeticion = 0;
						for (int t = 0; t < getModo().getCasillas(); t++) {
							if (combSecreta.getCombinacion()[h].getColor().equals(combSecreta.getCombinacion()[t].getColor())) {
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
	protected Combinacion generarCombinacion() {

		return elegirCombinacionSinRepet();
	}

	protected void dibujarCombinacionSecreta() {
		for (int i = 0; i < getModo().getCasillas(); i++) {
			System.out.printf("%s ", getCombSecreta().getCombinacion()[i].getColor());
		}
	}

}
