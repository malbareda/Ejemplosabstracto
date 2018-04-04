package abstracto;

public class Carta {
	
	String nombre;
	int hp;
	int atk1;
	String natk1;
	int atk2;
	String natk2;
	
	
	public Carta(String nom) {
		switch(nom) {
		case "Bola del Proyector":
			this.nombre=nom;
			hp = 50;
			atk1 = 200;
			natk1 = "Balancearse en la cara de Marc";
			break;
		case "Fantasma Casero":
			this.nombre=nom;
			hp = 10;
			atk1 = 10;
			natk1 = "Quedarse en casa";
			atk2 = 20;
			natk2 = "Multiplicación";
			break;
		case "La Venta de Oro":
			this.nombre=nom;
			hp = 100;
			atk1 = 1;
			natk1 = "Zhonya";
			atk2 = 2;
			natk2 = "Envio mediante piña";
			break;
			
		}
	}

}
