package main;

import java.util.ArrayList;

public class Tablero implements Dibujable {

	private ArrayList<Combinacion> tablero;
	private ArrayList<Combinacion> pista;

	Tablero() {
		tablero = new ArrayList<Combinacion>();
		pista = new ArrayList<Combinacion>();
	}

	void añadirAlTablero(Combinacion fila, Combinacion pista) {
		tablero.add(fila);
		this.pista.add(pista);

	}
	
	ArrayList<Combinacion> getTablero() {
		return this.tablero;
	}
	
	ArrayList<Combinacion> getPista() {
		return this.pista;
	}

	@Override
	public void dibujarTablero(Tablero tablero, Jugador usuario, Jugador maquina) {

		System.out.printf("\n\n");
		for (int i = 0; i < tablero.tablero.size(); i++) {
			System.out.printf("Intento %d: ", i + 1);
			for (int h = 0; h < tablero.tablero.get(i).combinacion.length; h++) {
				System.out.printf("%s ", tablero.tablero.get(i).combinacion[h].color);
			}
			System.out.printf("         Pista: ");
			
			for (int t=0;t<tablero.pista.get(i).combinacion.length;t++) {
				System.out.printf("%s ",tablero.pista.get(i).combinacion[t].color);
			}

			System.out.printf("\n\n");
		}
		System.out.printf("\n\n");
	}

}
