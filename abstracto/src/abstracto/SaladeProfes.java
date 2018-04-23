package abstracto;

import java.util.ArrayList;

public class SaladeProfes extends ArrayList<Professor>{
	
	static SaladeProfes sala=null;
	private SaladeProfes() {
		
	}
	
	public static SaladeProfes get() {
		if(sala==null) {
			sala = new SaladeProfes();
			return sala;
		}else {
			return sala;
		}
	}
	
	public void hayComida() {
		
		this.add(new Marc());
		this.add(new Victor());
		this.add(new Nico());
		this.add(new Pere());
		this.add(new Marc());
		
	}
	
	
	

}
