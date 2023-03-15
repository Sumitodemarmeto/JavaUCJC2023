package javaucjc.tienda;

import java.awt.Color;

public class Camisa extends Prenda {
	
	Boton	botones[];

	public Camisa(int talla, int precio, Color color, Boton[] botones) {
		super(talla, precio, color);
		this.botones = botones;
	}

}
