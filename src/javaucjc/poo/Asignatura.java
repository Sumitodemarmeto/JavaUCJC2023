package javaucjc.poo;

public class Asignatura {
	
	private String	nombre;
	private int		notaMedia;
	
	public Asignatura(String nombre, int notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}

}
