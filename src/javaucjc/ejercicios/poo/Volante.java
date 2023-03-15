package javaucjc.ejercicios.poo;

import java.awt.Color;

public class Volante {
	
	private int		id;
	private String	tipo;
	private Color	color;

	public Volante(int id, String tipo, Color color) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.color = color;
	}

	public Volante(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
