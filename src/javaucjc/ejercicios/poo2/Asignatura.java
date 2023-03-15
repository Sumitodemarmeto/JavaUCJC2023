package javaucjc.ejercicios.poo2;

public class Asignatura {
	
	private int	id;
	private String	nombre;
	private int		notaMedia;
	private boolean	optativa;

	public Asignatura(int id, String nombre, boolean optativa, int notaMedia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.optativa = optativa;
		this.notaMedia = notaMedia;
	}

	public Asignatura(int id, String nombre, boolean optativa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.optativa = optativa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}

	public boolean isOptativa() {
		return optativa;
	}

	public void setOptativa(boolean optativa) {
		this.optativa = optativa;
	}
	
	public void	mostrarNotaMedia()
	{
		System.out.println(this.nombre + " --> " + this.notaMedia);
	}

}
