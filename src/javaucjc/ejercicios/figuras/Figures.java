package javaucjc.ejercicios.figuras;

import java.util.Scanner;

public class Figures {

	public static void	printFilledScuare(Scanner scan)
	{
		int		size;
		int		width;
		int		height;
		
		System.out.print("Introduce el tamaño del cuadrado --> ");
		size = scan.nextInt();
		height = size;
		while (height-- > 0)
		{
			width = size;
			while (width-- > 1)
				System.out.print("* ");
			System.out.println("*");
		}
	}
	
	public static void	printVoidScuare(Scanner scan)
	{
		int		size;
		int		width;
		int		height;
		
		System.out.print("Introduce el tamaño del cuadrado --> ");
		size = scan.nextInt();
		height = size;
		while (height-- > 0)
		{
			width = size;
			if (height == size - 1 || height == 0)
				while (width-- > 1)
					System.out.print("* ");
			else
			{
				width--;
				System.out.print("* ");
				while (width-- > 1)
					System.out.print("  ");
			}
			System.out.println("*");
		}
	}
	
}
