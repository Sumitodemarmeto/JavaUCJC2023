package javaucjc.tienda;

import java.awt.Color;

public class Tienda {
	
	
	public static void main(String[] args) {

		String	nombre;
		Maniqui	maniquies[];
		Prenda	prendas[];
		
		nombre = "Una tienda";
		maniquies = new Maniqui[2];
		prendas = new Prenda[] {new Camisa(5, 15, Color.gray, new Boton[] {new Boton()})};

	}

}
