package javaucjc.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		
		int num1 = 10
				;
		int num2 = 9;
		
//		CONDICIONES CON IF
		if ( num1 > num2 || num1 < 0 )
			System.out.println( "Num1 es mayor" );
		else if ( num2 > 0 )
			System.out.println( "Nun2 es mayor que cero" );
		else
			System.out.println( "No se cumple ninguna de las condiciones" );

//		CONDICIONES CON SWITCH
		switch (num1) {
			case 1 : System.out.println( "Valor 1" );break;
			case 2 : System.out.println( "Valor 2" );break;
			case 10 : System.out.println( "Valor 10" );break;
			default : System.out.println( "Otro valor" );break;
		}
		
	}

}
