package abstracto;

import java.util.ArrayList;

public class Horror {
	
	
	public static void main(String[] args) {
		/*ArrayList<Professor> horror = new ArrayList<>();

		for(int i=0;i<10;i++) {
			Marc p = new Marc();
			horror.add(p);
			Professor n = new Nico();
			horror.add(n);
		}
		System.out.println(horror);*/
		
		SaladeProfes sdp = SaladeProfes.get();
		
		
		
		sdp.hayComida();
		sdp.add(new GatosdeMarc());
		
		for (Professor p : sdp) {
			System.out.println(p.getClass());
			if(p instanceof Professor) {
				System.out.println("deja de comer gordaco");
			}
			
		}
		
		
		Marc m = new Marc();
		Nico n = new Nico();
		Victor v = new Victor();
		
		Alumno a = new Alumno("DavidCarvajal");
		
		Alumno a2 = a.copiar();
		
		
		if(a==a2) {
			System.out.println("iguales");
		}
		if(a.equals(a2)) {
			System.out.println("equanimes");
		}
		
		a.juegoFavorito="LoL";
		a2.juegoFavorito="Wow";
		System.out.println(a.juegoFavorito);
		System.out.println(a2.juegoFavorito);
		
		/*System.out.println(a);
		
		n.soyIngeniero();
		m.soyIngeniero();
		
		*/
		
	}
	
}

