package abstracto;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TestCarta {
	
	public static void main(String[] args) {
		ArrayDeque<Carta> baraja = new ArrayDeque<>();
		
		baraja.add(new Carta("Bola del Proyector"));
		baraja.add(new Carta("Fantasma Casero"));
		baraja.add(new Carta("La Venta de Oro"));
		baraja.add(new Carta("Bola del Proyector"));
		int len = baraja.size();
		for(int i=0;i<len;i++) {
				Carta cartaactual = baraja.pop();
				System.out.println(cartaactual.nombre + " " + cartaactual.atk1 + " " + cartaactual.natk1);	
		}
		
		
		

	}

}
