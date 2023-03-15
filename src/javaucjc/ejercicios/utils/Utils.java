package javaucjc.ejercicios.utils;

import java.util.Scanner;

import javaucjc.ejercicios.menu.Menu;

public class Utils {

//	· PINTAR MENU ( HECHO )
//	· PINTAR MENU CON PARAMETRO --> Sring menu ( HECHO )
//	· PINTAR MENU CON PARAMETRO --> Sring[] menu ( HECHO )
	
	static Scanner	scan = new Scanner(System.in);
	
	public static int	pedirValor(String petición)
	{
		System.out.print(petición + "\n -> ");
		return scan.nextInt();
	}
	
	public static String	pedirCadena(String petición)
	{
		System.out.print(petición + "\n -> ");
		return (scan.next());
	}
	
	public static Object pedir(String petición, String tipo)
	{
		System.out.print(petición + "\n -> ");
		switch (tipo.toLowerCase())
		{
			case "int": return (scan.nextInt());
			case "float": return (scan.nextFloat());
			case "bigint": return (scan.nextBigInteger());
			case "double": return (scan.nextDouble());
			case "boolean": return (scan.nextBoolean());
			default: return (scan.next());
		}
	}
	
	public static void	printMenu()
	{
		System.out.println("1º- Validar email.");
		System.out.println("2º- Pintar el cuadrado.");
		System.out.println("3º- Mostrar datos.");
		System.out.println("4º- Salir.");
	}
	
	public static void	printMenu(String menu)
	{
		int		i;
		int		j;
		
		i = 0;
		j = menu.indexOf('\n');
		if (j < 0)
		{
			System.out.println(menu);
			return ;
		}
		while (j >= 0)
		{
			System.out.println(menu.substring(i, j));
			i = j + 1;
			j = menu.indexOf('\n', i);
		}
		System.out.println(menu.substring(i));
	}
	
	public static void	printMenu(String[] menu)
	{
		for (String cadena:menu)
			System.out.println(cadena);
	}
	
	public static void main(String[] args) {
		String	menu[];
		int		opcion;
		
		menu = new String[] {"Hola", "Que", "Tal"};
		printMenu(menu);
		opcion = (Integer)pedir("\nQue opcion quieres elegir", "int");
		System.out.println();
		switch(opcion)
		{
			case 1: Menu.option1();System.out.println();break;
			case 2: Menu.option2(scan);System.out.println();break;
			case 3: Menu.option3();System.out.println();break;
			case 4: return ;
			default: System.out.println("Opcion no valida.");break;
		}
	}
	
}
