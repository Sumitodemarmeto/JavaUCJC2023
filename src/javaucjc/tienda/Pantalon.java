package javaucjc.tienda;

import java.awt.Color;

public class Pantalon extends Prenda {
	
	Boton	boton;

	public Pantalon(int talla, int precio, Color color, Boton boton) {
		super(talla, precio, color);
		this.boton = boton;
	}

}
