package abstracto;

public interface Jugador {
	
	public void jugaralLol();
	
	
	public default void jugaralFactorio() {
		System.out.println("Fabricas");
	}

}
