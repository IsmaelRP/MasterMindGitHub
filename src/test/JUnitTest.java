package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.*;

class JUnitTest {
	
	
	@DisplayName("Equivalencias válidas del modo fácil")
	@Test
	void pruebasModoFacilValidas() {
		
		Jugador jugador1 = new Maquina(Modos.FACIL);
		Jugador jugador2 = new Maquina(Modos.FACIL);
		Combinacion a1 = new Combinacion(Modos.FACIL);
		Combinacion b1 = new Combinacion(Modos.FACIL);
		Combinacion c1 = new Combinacion(Modos.FACIL);
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
	}
	
	@DisplayName("Equivalencias no válidas del modo fácil")
	@Test
	void pruebasModoFacilNoValidas() {
		
		Jugador jugador1 = new Maquina(Modos.FACIL);
		Jugador jugador2 = new Maquina(Modos.FACIL);
		Combinacion a1 = new Combinacion(Modos.FACIL);
		Combinacion b1 = new Combinacion(Modos.FACIL);
		Combinacion c1 = new Combinacion(Modos.FACIL);
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = null;
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = null;
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = null;
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = null;
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(ArrayIndexOutOfBoundsException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(ArrayIndexOutOfBoundsException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla("dwasd");
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	           
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla("");
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla("azulito");
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	           
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla("");
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	           
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	           
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	           
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	           
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
	
	            jugador1.generarPista(jugador2);
	         
		
		// *******************************************************************************************************************
		
		
	}
	
	@DisplayName("Equivalencias válidas del modo medio")
	@Test
	void pruebasModoMedioValidas() {
		
		Jugador jugador1 = new Maquina(Modos.MEDIO);
		Jugador jugador2 = new Maquina(Modos.MEDIO);
		Combinacion a1 = new Combinacion(Modos.MEDIO);
		Combinacion b1 = new Combinacion(Modos.MEDIO);
		Combinacion c1 = new Combinacion(Modos.MEDIO);
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************

	}
	
	@DisplayName("Equivalencias no válidas del modo medio")
	@Test
	void pruebasModoMedioNoValidas() {
		
		Jugador jugador1 = new Maquina(Modos.MEDIO);
		Jugador jugador2 = new Maquina(Modos.MEDIO);
		Combinacion a1 = new Combinacion(Modos.MEDIO);
		Combinacion b1 = new Combinacion(Modos.MEDIO);
		Combinacion c1 = new Combinacion(Modos.MEDIO);
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = null;
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = null;
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = null;
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = null;
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(ArrayIndexOutOfBoundsException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(ArrayIndexOutOfBoundsException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(ArrayIndexOutOfBoundsException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla("dwasd");
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	          
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla("");
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla("azulito");
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	          
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(" ");
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	          
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	          
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	          
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
	          
		
		// *******************************************************************************************************************
		
	}
	
	@DisplayName("Equivalencias válidas del modo difícil")
	@Test
	void pruebasModoDificilValidas() {
		
		Jugador jugador1 = new Maquina(Modos.DIFICIL);
		Jugador jugador2 = new Maquina(Modos.DIFICIL);
		Combinacion a1 = new Combinacion(Modos.DIFICIL);
		Combinacion b1 = new Combinacion(Modos.DIFICIL);
		Combinacion c1 = new Combinacion(Modos.DIFICIL);
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.ROSA + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.VERDECLARO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
	}
	
	@DisplayName("Equivalencias no válidas del modo difícil")
	@Test
	void pruebasModoDificilNoValidas() {
		
		Jugador jugador1 = new Maquina(Modos.DIFICIL);
		Jugador jugador2 = new Maquina(Modos.DIFICIL);
		Combinacion a1 = new Combinacion(Modos.DIFICIL);
		Combinacion b1 = new Combinacion(Modos.DIFICIL);
		Combinacion c1 = new Combinacion(Modos.DIFICIL);
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = null;
		a1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = null;
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[6] = null;
		b1.getCombinacion()[7] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = null;
		b1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;
		
		assertThrows(NullPointerException.class,
	            ()->{
	            jugador1.generarPista(jugador2);
	            });
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla("dwasd");
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO  + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla("");
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla("azulito");
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO  + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		a1.getCombinacion()[0] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		a1.getCombinacion()[1] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		a1.getCombinacion()[2] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		a1.getCombinacion()[3] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		a1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		a1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		a1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		b1.getCombinacion()[0] = new Casilla(Colores.VERDE + "  " + Colores.RESET);
		b1.getCombinacion()[1] = new Casilla(Colores.AZUL + "  " + Colores.RESET);
		b1.getCombinacion()[2] = new Casilla(Colores.AMARILLO + "  " + Colores.RESET);
		b1.getCombinacion()[3] = new Casilla("");
		b1.getCombinacion()[4] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[5] = new Casilla(Colores.MORADO + "  " + Colores.RESET);
		b1.getCombinacion()[6] = new Casilla(Colores.CELESTE + "  " + Colores.RESET);
		b1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		c1.getCombinacion()[0] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[1] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[2] = new Casilla(Colores.NEGRO  + "  " + Colores.RESET);
		c1.getCombinacion()[3] = new Casilla(Colores.NEGRO + "  " + Colores.RESET);
		c1.getCombinacion()[4] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[5] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[6] = new Casilla(Colores.ROJO + "  " + Colores.RESET);
		c1.getCombinacion()[7] = new Casilla(Colores.BLANCO + "  " + Colores.RESET);
		
		jugador1.combSecreta = a1;
		jugador2.combRespuesta = b1;

		Assert.assertEquals(c1, jugador1.generarPista(jugador2));
		
		// *******************************************************************************************************************
		
		
		
	}
}
