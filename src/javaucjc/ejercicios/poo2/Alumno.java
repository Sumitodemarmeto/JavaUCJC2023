package javaucjc.ejercicios.poo2;

import java.util.Scanner;

public class Alumno {
	
	private String			nombre;
	private String			apellidos;
	private Asignatura[][]	asignaturas;

	public Alumno(Scanner scan) {
		super();
		System.out.println("Introduzca el nombre del alumno.");
		this.nombre = scan.nextLine();
		System.out.println("Introduzca los apellidos del alumno.");
		this.apellidos = scan.nextLine();
	}

	public Alumno(String nombre, String apellidos, Asignatura[][] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignaturas = asignaturas;
	}

	public Alumno(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Asignatura[][] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[][] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void	mostrarNotasEvaluacion(Scanner scan)
	{
		int		eval;
		int		i;
		
		i = 0;
		eval = 0;
		if (this.asignaturas == null)
			return ;
		while (eval <= 0 || eval >= 3)
		{
			System.out.println("Elige la evaluación a mostrar.");
			eval = scan.nextInt();
			switch (eval)
			{
				case 1 :
				{
					while (i < 5)
					{
						if (this.asignaturas[0][i] != null)
							this.asignaturas[0][i].mostrarNotaMedia();
						i++;
					};
					break;
				}
				case 2 :
				{
					while (i < 5)
					{
						if (this.asignaturas[1][i] != null)
							this.asignaturas[1][i].mostrarNotaMedia();
						i++;
					};
					break;
				}
				default : System.out.println("Opcion no valida");
			}
		}
	}
	
	public int getNotaMedia()
	{
		int	suma;
		int	cantAsignaturas;
		
		suma = 0;
		cantAsignaturas = 0;
		for (Asignatura[] i : asignaturas)
		{
			for (Asignatura j : i)
			{
				if (j != null)
				{
					suma += j.getNotaMedia();
					cantAsignaturas++;
				}
			}
		}
		return (suma);
	}

}
