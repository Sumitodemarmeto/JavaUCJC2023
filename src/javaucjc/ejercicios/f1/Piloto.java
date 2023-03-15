package javaucjc.ejercicios.f1;

public class Piloto {
	
	String	nombre;
	int		experiencia;
	String	equipo;
	int		victorias;

	public Piloto(String nombre, String equipo) {
		super();
		this.nombre = nombre;
		this.experiencia = 0;
		this.equipo = equipo;
		this.victorias = 0;
	}

	public Piloto(String nombre, int experiencia, String equipo, int victorias) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.equipo = equipo;
		this.victorias = victorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

}
