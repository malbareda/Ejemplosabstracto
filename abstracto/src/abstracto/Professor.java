package abstracto;

public abstract class Professor {
	
	String Instituto;
	String Modulo;
	String Edad;
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

}
