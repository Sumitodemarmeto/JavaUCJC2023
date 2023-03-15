package javaucjc.poo;

public class Alumno {
	
	private String		nombre;
	private String		apellidos;
	private Asignatura	asignatura;
	
	public Alumno(String nombre, String apellidos, Asignatura asignatura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignatura = asignatura;
	}

	public Alumno(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public void	estudiar()
	{
		System.out.println("El alumno " + nombre + " está estudiando y tiene "
				+ "una nota media de " + asignatura.getNotaMedia());
	}
}
