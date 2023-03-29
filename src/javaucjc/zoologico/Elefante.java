package javaucjc.zoologico;

public class Elefante extends Animal {
	
	private int	longTrompa;

	public Elefante(String nombre, String tipo, int longTrompa) {
		super(nombre, tipo);
		this.longTrompa = longTrompa;
	}
	
	public void programarJava()
	{
		System.out.println("El elefante : " + this.nombre + " está programando");
	}
	
	@Override
	public void desplazar()
	{
		super.desplazar();
		System.out.println("\bdespacio");
	}

}
