package abstracto;

public abstract class Professor {
	
	String Instituto;
	String Modulo;
	String Edad;
	int Mn;
	boolean sillaGaming;
	
	public Professor(){
		Instituto = "IES SABADELL";
		sillaGaming = false;
	}
	
	
	public void evaluar(double nota) {
		if(nota<5) {
			System.out.println("SUSPÈS");
			System.out.println("SUSPÈS");
			System.out.println("SUSPÈS");
		}else {
			System.out.println("Aprova");
		}
	}
	
	public void horaPatio(Cafe c) {
		System.out.println("Rajar de los alumnos");
	}
	
	public abstract void examen();
	
	public void ataqueEspecial() {
		System.out.println("Sin ataque especial");
	}
	
	
	public abstract String toString();
	
	public void ponerNota( Alumno a, int nota) {
		int[] tnotas = a.getNotas();
		tnotas[this.Mn] = nota;
		a.setNotas(tnotas);
	}

}
