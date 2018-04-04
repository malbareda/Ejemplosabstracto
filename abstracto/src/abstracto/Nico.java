package abstracto;

public class Nico extends Professor{
	
	public Nico() {
		super();
		Modulo = "M2";
		Edad = "35 años y lo bien que se conserva";
		
	}
	
	public void examen() {
		System.out.println("Examen de M2");
	}
	
	@Override
	public void ataqueEspecial() {
		System.out.println("Arrollarte con la bici");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "He puesto en el examen un par de ejercicios picantes";
	}

}
