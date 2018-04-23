package abstracto;

public class Marc extends Professor implements IngenieroInformatico, Jugador{
	
	int Mn2 = 5;
	
	
	public Marc() {
		super();
		sillaGaming = true;
		Modulo = "M3 & MB";
		Edad = "Joven";
		Mn = 3;
		
	}
	
	
	
	public void examen() {
		System.out.println("Examen de M3");
	}
	
	public void ataqueEspecial() {
		System.out.println("Bola del proyector");
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Te voy a recomendar un restaurante";
	}
	
	public void notaDoble(int nota1, int nota2, Alumno a) {
		int[] tnotas = a.getNotas();
		tnotas[this.Mn] = nota1;
		tnotas[this.Mn2] = nota2;
		a.setNotas(tnotas);
	}

	@Override
	public void soyIngeniero() {
		System.out.println("Sir Engineer!");
	}

	@Override
	public void jugarVideojuegos() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void comerDoritos(Dorito d) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void noLigar() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void jugaralLol() {
		// TODO Auto-generated method stub
		
	}

}
