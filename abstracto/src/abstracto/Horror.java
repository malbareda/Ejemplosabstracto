package abstracto;

import java.util.ArrayList;

public class Horror {
	
	
	public static void main(String[] args) {
		ArrayList<Professor> horror = new ArrayList<>();

		for(int i=0;i<10;i++) {
			Marc p = new Marc();
			horror.add(p);
			Professor n = new Nico();
			horror.add(n);
		}
		System.out.println(horror);
	}
	
}

