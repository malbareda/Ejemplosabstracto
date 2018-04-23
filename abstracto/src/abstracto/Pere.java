package abstracto;

public class Pere extends Professor implements IngenieroInformatico{
	
	public Pere() {
		this.Modulo = "M1";
		Edad = "no preguntes";
		Mn = 1;
	}

	public void examen() {
		System.out.println("Examen de M1");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Juan Carlos ha preparado unas prácticas";
	}

	public void OrdenesDeJuanCarlos(Alumno a) {
		a.setPracticasDeSistemas(a.getPracticasDeSistemas()+1);
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
