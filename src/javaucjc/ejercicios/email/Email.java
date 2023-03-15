package javaucjc.ejercicios.email;

public class Email {

	public static boolean	chkemail(String s)
	{
		if (s.matches("^.*\\p{Space}.*"))
		{
			System.out.println("No puede haber ningun espacio en el correo");
			return (false);
		}
		if (s.matches("^(?![.@]).*@(?![.@]).*([.]).*$"))
		{
			System.out.println("Correcto");
			return (true);
		}
		System.out.println("Patron incorrecto");
		return (false);
	}
	
}
