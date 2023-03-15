package javaucjc.ejercicios.condicionales;

import java.util.Scanner;

public class Estaciones {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mes;
		String estacion = "";
		
		System.out.print("Que mes quieres comprobar?? --> ");
		mes = scan.nextLine();
		if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Marzo"))
			estacion = "Invierno";
		else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio"))
			estacion = "Primavera";
		else if (mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Septiembre"))
			estacion = "Verano";
		else if (mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre") || mes.equalsIgnoreCase("Diciembre"))
			estacion = "Otoño";
		else
			estacion = "El valor introducido no es un mes";
		System.out.println("if     --> " + estacion);
		System.out.print("switch --> ");
		switch (mes.toLowerCase()) {
			case "enero":
			case "febrero":
			case "marzo": System.out.println("Invierno");break;
			case "abril":
			case "mayo":
			case "junio": System.out.println("Primavera");break;
			case "julio":
			case "agosto":
			case "septiembre": System.out.println("Verano");break;
			case "octubre":
			case "noviembre":
			case "diciembre": System.out.println("Otoño");break;
			default: System.out.println("El valor introducido no es un mes");
		}
		scan.close();
	}
}
