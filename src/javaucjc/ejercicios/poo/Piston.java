package javaucjc.ejercicios.poo;

public class Piston {

	private int		id;
	private String	marca;

	public Piston(int id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}

	public Piston(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
