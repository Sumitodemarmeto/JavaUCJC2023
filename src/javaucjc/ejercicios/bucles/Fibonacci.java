package javaucjc.ejercicios.bucles;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int		i;
		int		j;
		int		k;
		int		amount;
		Scanner	scan;
		
		i = 0;
		j = 0;
		System.out.print("Cuantos valores quieres obtener?? --> ");
		scan = new Scanner(System.in);
		amount = scan.nextInt();
		while (amount-- > 0)
		{
			k = i + j;
			if (k == 0)
				k++;
			i = j;
			j = k;
			System.out.println(k);
		}
		scan.close();
		
	}
	
}
