package abstracto;

public class Victor extends Professor{

	public Victor() {
		this.Modulo = "M4";
		Mn = 2;
		Edad = "36";
	}
	
	@Override
	public void examen() {
		// TODO Auto-generated method stub
		System.out.println("Examen de M4");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Clase meme";
	}
	
	

}
