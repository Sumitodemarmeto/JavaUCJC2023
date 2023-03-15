package javaucjc.ejercicios.poo;

import java.awt.Color;

public class Concesionario {

	public static void main(String[] args) {
		
		Coche	coche1;
		Coche	coche2;
		
		coche1 = new Coche("6643 JGB");
		coche1.setMarca("Citroen");
		coche1.setMotor(new Motor());
		coche1.getMotor().setMarca("BMW");
		coche1.getMotor().setNumCaballos(500);
		coche1.getMotor().setPiston(new Piston(0, "MAHLE Motorsport"));
		coche1.setVolante(new Volante(1, "Mariposa", Color.gray));
		coche2 = new Coche("Fiat", "6689 KGZ", new Motor("BMW", 600,
				new Piston(1)), new Volante(0, "Circular", Color.white));
		coche2.getMotor().getPiston().setMarca("UEM Pistons");
		System.out.println("La marca del piston del coche : " + coche1 + "es : "
				+ coche1.getMotor().getPiston().getMarca() + " y el"
				+ "color del volante es : " + coche1.getVolante().getColor());
		System.out.println();
		System.out.println("La marca del piston del coche : " + coche2 + "es : "
				+ coche2.getMotor().getPiston().getMarca() + " y el "
				+ "color del volante es : " + coche2.getVolante().getColor());
		System.out.println();
		System.out.println();
		coche1.conducir();
		System.out.println();
		coche2.conducir();

	}

}
