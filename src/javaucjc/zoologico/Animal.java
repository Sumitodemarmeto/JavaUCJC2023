package javaucjc.zoologico;

public class Animal {
	
	protected String nombre;
	protected String tipo;
	
	public Animal(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void	comer()
	{
		System.out.println("El animal con nombre " + this.nombre + " está comiendo");
	}
	
	public void desplazar()
	{
		System.out.println("El animal con nombre " + this.nombre + " se desplaza a 4 patas");
	}

}
