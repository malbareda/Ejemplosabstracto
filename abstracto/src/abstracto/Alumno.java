package abstracto;

public class Alumno implements Cloneable {
	
	
	private String nombre;
	private int mediaNotas;
	private boolean ganasDeVivir=false;
	private long practicasDeSistemas;
	private int[] notas;
	public String juegoFavorito;
	
	Alumno(String nombre){
		this.nombre=nombre;
		notas = new int[5];
	}

	public int getMediaNotas() {
		return mediaNotas;
	}

	public boolean isGanasDeVivir() {
		return ganasDeVivir;
	}

	public long getPracticasDeSistemas() {
		return practicasDeSistemas;
	}

	public void setPracticasDeSistemas(long practicasDeSistemas) {
		this.practicasDeSistemas = practicasDeSistemas;
	}

	public int[] getNotas() {
		return notas;
	}

	void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	public void media() {
		if (ganasDeVivir) {
			int acc = 0;
			for (int i : notas) {
				acc += i;
			}
			mediaNotas = acc / 5;
		}
	}
	
	public void ganas() {
		if(practicasDeSistemas>2) ganasDeVivir=false;
		else ganasDeVivir = false;
	}
	
	
	public void hacerPracticadeSistemas() {
		if (ganasDeVivir) {
			practicasDeSistemas--;
		}
	}
	
	public void haberSiMeMuero() {
		if (!ganasDeVivir) {
			System.out.println("no hay nada pa cenar");
		}
	}
	
	public void partidilla(Alumno a) {
		int rand = (int) (Math.random()*100);
		if(rand>95) {
			ganasDeVivir=true;
		}
	}
	
	@Override
	public String toString() {
		return nombre;
		
	}
	
	public Alumno clonar() {
		return this;
	}
	
	public Alumno copiar() {
		try {
			return (Alumno) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
