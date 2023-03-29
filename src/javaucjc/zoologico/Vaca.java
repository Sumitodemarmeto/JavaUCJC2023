package javaucjc.zoologico;

public class Vaca extends Animal {
	
	private int	numCuernos;

	public Vaca(String nombre, String tipo, int numCuernos) {
		super(nombre, tipo);
		this.numCuernos = numCuernos;
	}

}
