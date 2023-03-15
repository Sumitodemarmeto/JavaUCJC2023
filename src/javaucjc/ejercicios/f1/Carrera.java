package javaucjc.ejercicios.f1;

public class Carrera {
	
	String	nombre;
	String	circuito;
	Coche	parrilla[];
	int		distancia;
	
	public Carrera(String nombre, String circuito) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
	}

	public Carrera(String nombre, String circuito, Coche[] parrilla) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrilla = parrilla;
	}

	public Carrera(String nombre, String circuito, Coche[] parrilla, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrilla = parrilla;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public Coche[] getParrilla() {
		return parrilla;
	}

	public void setParrilla(Coche[] parrilla) {
		this.parrilla = parrilla;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public Coche	iniciarCarrera(int distancia, Coche coches[])
	{
		for (Coche coche:coches)
		{
			coche.correr(distancia);
			if (coche.avance >= distancia)
				return (coche);
		}
		return iniciarCarrera(distancia, coches);
	}

	public Coche	iniciarCarrera(Coche coches[])
	{
		for (Coche coche:coches)
		{
			coche.correr(this.distancia);
			if (coche.avance >= this.distancia)
				return (coche);
		}
		return iniciarCarrera(this.distancia, coches);
	}

}
