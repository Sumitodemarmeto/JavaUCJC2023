package javaucjc.ejercicios.f1;

public class Coche {

	String	escuderia;
	String	motor;
	int		numero;
	Piloto	piloto;
	int		velocidad;
	int		avance;
	
	public Coche(String escuderia, String motor) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.avance = 0;
	}

	public Coche(String escuderia, String motor, int numero, Piloto piloto) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.avance = 0;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAvance() {
		return avance;
	}

	public void setAvance(int avance) {
		this.avance = avance;
	}

	public void	correr(int maxdist)
	{
		this.avance += (Math.random()*maxdist+1);
	}
	
}
