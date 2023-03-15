package javaucjc.ejercicios.poo;

public class Coche {
	
	private String	marca;
	private	String	matricula;
	private Motor	motor;
	private Volante	volante;
	private int		velocidad = (int)(50 + Math.random() * ((120 - 50) + 1));

	public Coche(String marca, String matricula, Motor motor, Volante volante) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motor = motor;
		this.volante = volante;
	}

	public Coche(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	
	public void	conducir()
	{
		System.out.println("El coche : " + this + " va a una velocidad de : "
				+ this.velocidad);
	}

}
