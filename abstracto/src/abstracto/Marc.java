package abstracto;

public class Marc extends Professor{
	
	
	
	public Marc() {
		super();
		sillaGaming = true;
		Modulo = "M3 & MB";
		Edad = "Joven";
		
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
	

}
