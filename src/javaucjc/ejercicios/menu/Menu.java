package javaucjc.ejercicios.menu;

import java.util.Scanner;

import javaucjc.ejercicios.figuras.Figures;

public class Menu {
	
	public static void	option1()
	{
		return ;
	}
	
	public static void	option2(Scanner scan)
	{
		Figures.printVoidScuare(scan);
		return ;
	}
	
	public static void	option3()
	{
		int	i;
		int	j;
		
		i = 0;
		j = 100;
		while (i <= 100)
		{
			System.out.print(i++ + ";");
			i++;
			j--;
			System.out.println(j--);
		}
		return ;
	}

//	public static void	printMenu(Scanner scan)
//	{
//		int		option;
//		
//		System.out.println("1º- Validar email.");
//		System.out.println("2º- Pintar el cuadrado.");
//		System.out.println("3º- Mostrar datos.");
//		System.out.println("4º- Salir.");
//		System.out.print("\nIntroduzca el la opción que desea --> ");
//		option = scan.nextInt();
//		System.out.println();
//		switch(option)
//		{
//			case 1: option1();System.out.println();break;
//			case 2: option2(scan);System.out.println();break;
//			case 3: option3();System.out.println();break;
//			case 4: return ;
//			default: System.out.println("Opcion no valida.");break;
//		}
//		printMenu(scan);
//	}
	
//	public static void main(String[] args) {
//		Scanner	scan;
//		
//		scan = new Scanner(System.in);
//		printMenu(scan);
//		scan.close();
//	}
	
}
