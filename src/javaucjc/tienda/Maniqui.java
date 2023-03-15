package javaucjc.tienda;

public class Maniqui {
	
	private int		id;
	private Prenda	ropa[];

	public Maniqui(int id) {
		super();
		this.id = id;
	}

	public void vestir(Prenda prendas[])
	{
		for (int i=0; i < prendas.length; i++)
			this.ropa[i] = prendas[i];
	}

}
