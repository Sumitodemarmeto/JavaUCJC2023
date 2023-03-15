package javaucjc.arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		int[][]	mat;
		
		mat = new int[2][3];
		
		for (int ln[]:mat)
		{
			for (int cl:ln)
				System.out.print(cl + " ");
			System.out.println();
		}

	}

}
