package javaucjc.zoologico;

public class Serpiente extends Animal {
	
	private int	longitud;

	public Serpiente(String nombre, String tipo, int longitud) {
		super(nombre, tipo);
		this.longitud = longitud;
	}
	
	@Override
	public void desplazar()
	{
		System.out.println("El animal con nombre " + this.nombre + " se"
				+ " desplaza reptando");
	}

}
