package abstracto;

public interface IngenieroInformatico {
	
	
	public default void soyIngeniero() {
		System.out.println("soy ingeniero!");
	}
	
	public void jugarVideojuegos();
	
	public void comerDoritos(Dorito d);
	
	public void noLigar();
	

}
