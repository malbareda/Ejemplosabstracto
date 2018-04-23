package abstracto;

public class Nico extends Professor implements IngenieroInformatico{
	
	public Nico() {
		super();
		Modulo = "M2";
		Edad = "35 años y lo bien que se conserva";
		Mn = 2;
		
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

}
